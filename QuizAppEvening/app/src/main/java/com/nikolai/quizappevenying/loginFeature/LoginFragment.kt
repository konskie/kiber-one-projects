package com.nikolai.quizappevenying.loginFeature

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.core.widget.doOnTextChanged
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.nikolai.quizappevenying.R
import com.nikolai.quizappevenying.helpers.DataManager
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class LoginFragment: Fragment() {
    @Inject
    lateinit var manager: DataManager

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_login, container,false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val button = view.findViewById<Button>(R.id.enter_button)
        button.isEnabled = manager.userName.isNotEmpty()
        button.setOnClickListener {
            findNavController().navigate(R.id.action_loginFragment_to_quizFragment)

        }

        val userText = view.findViewById<EditText>(R.id.user_name_field)
        userText.doOnTextChanged { text, start, before, count ->
            manager.userName = text.toString()
            button.isEnabled = manager.userName.isNotEmpty()
        }
    }
}
