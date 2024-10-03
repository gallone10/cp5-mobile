package com.example.cp2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.Spinner
import androidx.fragment.app.Fragment

class FormFragment : Fragment() {

    private lateinit var nameInput: EditText
    private lateinit var emailInput: EditText
    private lateinit var messageInput: EditText
    private lateinit var categorySpinner: Spinner

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_form, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        nameInput = view.findViewById(R.id.name_input)
        emailInput = view.findViewById(R.id.email_input)
        messageInput = view.findViewById(R.id.message_input)
        categorySpinner = view.findViewById(R.id.category_spinner)

        val submitButton = view.findViewById<Button>(R.id.submit_button)
        submitButton.setOnClickListener {

        }

        val sendButton = view.findViewById<ImageButton>(R.id.send_button)
    }
}