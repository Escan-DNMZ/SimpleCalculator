package com.escan.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    var number1:Int? = null
    var number2:Int? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }


    fun Sum(view:View){
        number1 = Number1.text.toString().toIntOrNull()
        number2 = Number2.text.toString().toIntOrNull()
        if (number1 != null && number2 != null){
            var nums = Numbers(number1,number2)
            textView.text = "Sonuç: ${nums.sum}"
        }
        else{
            textView.text = "Sayı girmek zorundasın"
        }
    }

    fun Sub(view:View){
        number1 = Number1.text.toString().toIntOrNull()
        number2 = Number2.text.toString().toIntOrNull()
        if (number1 != null && number2 != null){
            var nums = Numbers(number1,number2)
            textView.text = "Sonuç: ${nums.sub}"
        }
        else{
            textView.text = "Sayı girmek zorundasın"
        }
    }

    fun Multiply(view:View){
        number1 = Number1.text.toString().toIntOrNull()
        number2 = Number2.text.toString().toIntOrNull()
        if (number1 != null && number2 != null){
            var nums = Numbers(number1,number2)
            textView.text = "Sonuç: ${nums.multi}"
        }
        else{
            textView.text = "Sayı girmek zorundasın"
        }
    }

    fun Div(view:View){
        number1 = Number1.text.toString().toIntOrNull()
        number2 = Number2.text.toString().toIntOrNull()
        if (number1 != null && number2 != null){
            var nums = Numbers(number1,number2)
            textView.text = "Sonuç: ${nums.div}"
        }
        else{
            textView.text = "Sayı girmek zorundasın"
        }
    }

    fun Pow(view:View){
        number1 = Number1.text.toString().toIntOrNull()
        number2 = Number2.text.toString().toIntOrNull()
        if (number1 != null && number2 != null){
            var nums = Numbers(number1,number2)
            textView.text = "Sonuç: ${nums.pow.toInt()}"
        }
        else{
            textView.text = "Sayı girmek zorundasın"
        }
    }

}