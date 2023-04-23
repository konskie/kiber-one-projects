package com.nikolai.quizappevenying.quizResult

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.nikolai.quizappevenying.R
import com.nikolai.quizappevenying.helpers.DataManager
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject
@AndroidEntryPoint
class ResultFragment: Fragment () {


    @Inject
    lateinit var storage: DataManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_result, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val resultText = view.findViewById<TextView>(R.id.scoreText)
        resultText.text = getString(R.string.user_score, storage.test.score)
        val restartButton = view.findViewById<Button>(R.id.restartButton)
        restartButton.setOnClickListener {
            storage.test.score = 0
            findNavController().popBackStack(R.id.loginFragment, false)
        }
    }
}