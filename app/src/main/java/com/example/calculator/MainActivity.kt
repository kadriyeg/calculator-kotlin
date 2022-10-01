package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var num1: Int? = null
    var num2: Int? = null
    var myResult: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun sum(view : View){
     num1 = editText.text.toString().toIntOrNull()
     num2 = editText2.text.toString().toIntOrNull()

    if (num1 == null || num2 == null){
        textView.text = "Do not forget to enter numbers"
    } else {
        var myResult= num1!!+num2!!
        textView.text = "Result : ${myResult}"
    }
    }

    fun subtract(view : View){
        num1 = editText.text.toString().toIntOrNull()
        num2 = editText2.text.toString().toIntOrNull()

        if (num1 == null || num2 == null){
            textView.text = "Do not forget to enter numbers"
        } else {
            var myResult= num1!! - num2!! //because we are checked the nullability, it is okay to use !! here
            textView.text = "Result : ${myResult}"
        }
    }


    fun divide(view : View){

        num1 = editText.text.toString().toIntOrNull()
        num2 = editText2.text.toString().toIntOrNull()

        if (num1 == null || num2 == null){
            textView.text = "Do not forget to enter numbers"
        } else {
            var myResult= num1!! / num2!!
            textView.text = "Result : ${myResult}"
        }
    }

    fun multiplication(view : View){
        num1 = editText.text.toString().toIntOrNull()
        num2 = editText2.text.toString().toIntOrNull()

        if (num1 == null || num2 == null){
            textView.text = "Do not forget to enter numbers"
        } else {
            myResult= num1!! * num2!!
            textView.text = "Result : ${myResult}"
        }
    }

}