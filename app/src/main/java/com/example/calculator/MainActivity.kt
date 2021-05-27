package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)




        var etNumber=findViewById<EditText>(R.id.etNumber)
        var etSecondNumber=findViewById<EditText>(R.id.etsecondNumber)
        var tvAnswer=findViewById<TextView>(R.id.tvAnswer)
        var btnSubtraction=findViewById<Button>(R.id.btnSubtraction)
        var btnAddition=findViewById<Button>(R.id.btnAddition)
        var btnMultiplication=findViewById<Button>(R.id.btnMultiplication)
        var btnModulus=findViewById<Button>(R.id.btnModulus)

        btnAddition.setOnClickListener{
       if(etNumber.text.toString()=="") {
           Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG). show()
       }
            else if(etSecondNumber.text.toString()== ""){
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
       }
            else{
                val Number = etNumber.text.toString().toInt()
                val SecondNumber = etSecondNumber.toString().toInt()
                val addTotal = Number + SecondNumber
                tvAnswer.text = "Answer:${addTotal}"

       }
        }
        btnSubtraction.setOnClickListener{
            if(etNumber.text.toString()=="") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG). show()
            }
            else if(etSecondNumber.text.toString()== ""){
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            }
            else{
                val Number = etNumber.text.toString().toInt()
                val SecondNumber = etSecondNumber.toString().toInt()
                val SubtractionTotal = Number - SecondNumber
                tvAnswer.text = "Answer:${SubtractionTotal}"

            }
        }
        btnMultiplication.setOnClickListener{
            if(etNumber.text.toString()=="") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG). show()
            }
            else if(etSecondNumber.text.toString()== ""){
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            }
            else{
                val Number = etNumber.text.toString().toInt()
                val SecondNumber = etSecondNumber.toString().toInt()
                val MultiplicationTotal = Number * SecondNumber
                tvAnswer.text = "Answer:${MultiplicationTotal}"

            }
        }
        btnModulus.setOnClickListener{
            if(etNumber.text.toString()=="") {
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG). show()
            }
            else if(etSecondNumber.text.toString()== ""){
                Toast.makeText(baseContext, "Enter a number", Toast.LENGTH_LONG).show()
            }
            else{
                val Number = etNumber.text.toString().toInt()
                val SecondNumber = etSecondNumber.toString().toInt()
                val ModuleTotal = Number / SecondNumber
                tvAnswer.text = "Answer:${ModuleTotal}"

            }
        }
    }
}