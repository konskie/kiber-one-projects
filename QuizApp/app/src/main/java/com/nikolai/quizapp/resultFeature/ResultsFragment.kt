package com.nikolai.quizapp.resultFeature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.nikolai.quizapp.R
import com.nikolai.quizapp.helpers.DataManager
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class ResultsFragment: Fragment() {
    @Inject
    lateinit var dataManager: DataManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_results, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val resultText = view.findViewById<TextView>(R.id.textView3)
        val restartButton = view.findViewById<Button>(R.id.restart_button)

        resultText.text = "Your score is: ${dataManager.test.score}"

        restartButton.setOnClickListener {
            dataManager.test.score = 0
            findNavController().popBackStack(R.id.loginFragment, false)
        }
    }
}