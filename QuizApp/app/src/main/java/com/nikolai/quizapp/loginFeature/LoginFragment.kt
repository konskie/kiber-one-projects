package com.nikolai.quizapp.loginFeature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.nikolai.quizapp.R
import com.nikolai.quizapp.helpers.DataManager
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LoginFragment: Fragment() {
    @Inject
    lateinit var dataManager: DataManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(
            R.layout.fragment_login,
            container,
            false
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val button = view.findViewById<Button>(R.id.btn_login)
        checkButtonEnabled()
        button.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_quizFragment)
        }

        val userTextField = view.findViewById<TextView>(R.id.userzname_textfield)
        userTextField.doOnTextChanged { text, start, before, count ->
            dataManager.userName = text.toString()
            checkButtonEnabled()
        }
    }

    private fun checkButtonEnabled() {
        val button = view?.findViewById<Button>(R.id.btn_login)
        button?.isEnabled = !dataManager.userName.isEmpty()

    }
}