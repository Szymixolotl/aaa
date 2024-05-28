package com.example.myapplication

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var inpemail = findViewById<EditText>(R.id.inpemail)
        var inppassword = findViewById<EditText>(R.id.inppassword)
        var inppasswordagain = findViewById<EditText>(R.id.inppasswordagain)
        var button = findViewById<Button>(R.id.button4)
        var wyswietlanie = findViewById<TextView>(R.id.textView5)

        fun validandregister(){
            if(inpemail.text.contains("@"))
            {
                var email = inpemail.text
                var pierwsze = inppassword.text.trim().toString()
                var drugi = inppasswordagain.text.trim().toString()
                if( pierwsze.equals(drugi, true) ){
                    wyswietlanie.setText("Witaj " + email)
                }
                else{
                    wyswietlanie.setText("Hasła się różnią")
                }
            }
            else
            {
                wyswietlanie.setText("Nieprawidłowy adres e-mail")
            }
        }
        button.setOnClickListener {
           validandregister()
        }


    }

}
