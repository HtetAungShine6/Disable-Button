package com.example.disablebutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var inputText : EditText
    lateinit var inputText2 : EditText
    lateinit var action_button : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        inputText = findViewById(R.id.editText)
        inputText2 = findViewById(R.id.editText2)
        action_button = findViewById(R.id.btnOK)

        inputText.addTextChangedListener(buttonListener)
        inputText2.addTextChangedListener(buttonListener)
    }

    var buttonListener = object : TextWatcher

    {
        override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

        }

        override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
            val newinput = inputText.text.toString().trim()
            val newinput2 = inputText2.text.toString().trim()
            if(newinput.isNotEmpty() && newinput2.isNotEmpty())
            action_button.isEnabled = true
        }

        override fun afterTextChanged(s: Editable?) {

        }
    }
}