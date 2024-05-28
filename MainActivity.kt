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
        button.setOnClickListener {
            if(inpemail.text.contains("@"))
            {

                if(inppassword.text.equals(inppasswordagain.text)){
                    wyswietlanie.setText("Witaj" + inpemail.text)
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


    }

}
