package com.example.tipcalculator


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var numberOfPeople : EditText
    private lateinit var amountToBePaid : EditText
    private lateinit var tipCustom : EditText
    private lateinit var tip5 : Button
    private lateinit var tip10 : Button
    private lateinit var tip15 : Button
    private lateinit var tip25 : Button
    private lateinit var tip50 : Button
    private lateinit var tipPerson: TextView
    private lateinit var totalPerson : TextView



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var calculateButton = findViewById<Button>(R.id.calculateButton)
        var tip5 = findViewById<Button>(R.id.tip5)
        var tip10 = findViewById<Button>(R.id.tip10)
        var tip15 = findViewById<Button>(R.id.tip15)
        var tip25 = findViewById<Button>(R.id.tip25)
        var tip50 = findViewById<Button>(R.id.tip50)

        numberOfPeople = findViewById(R.id.numberOfPeople)
        amountToBePaid = findViewById(R.id.amountToBePaid)
        tipCustom=findViewById(R.id.tipCustom)
        tipPerson = findViewById(R.id.tipPerson)
        totalPerson=findViewById(R.id.totalPerson)
        tip5.setOnClickListener{
            val numberOfPeople1 = numberOfPeople.text.toString().toInt()
            val amountToBePaid1 = amountToBePaid.text.toString().toInt()
            val tipCustom1 = tipCustom.text.toString().toInt()
            var tipPerson1 = tipPerson.text.toString().toInt()
            var totalPerson1 = totalPerson.text.toString().toInt()
            while (tip5.isActivated  && numberOfPeople.text.isNotEmpty() && amountToBePaid.text.isNotEmpty()){
                totalPerson.text.toString().toInt() == amountToBePaid1 / numberOfPeople1
                tipPerson.text.toString().toInt() == totalPerson1 + (amountToBePaid1 * 5 /100 / numberOfPeople1)
            }

        }

/*
        calculateButton.setOnClickListener{
            val numberOfPeople1 = numberOfPeople.text.toString().toInt()
            val amountToBePaid1 = amountToBePaid.text.toString().toInt()
            val tipCustom1 = tipCustom.text.toString().toInt()
            var tipPerson1 = tipPerson.text.toString().toInt()
            var totalPerson1 = totalPerson.text.toString().toInt()





            if(numberOfPeople.text.isEmpty()  ){
                numberOfPeople.setError("Enter number of people")
            }
            if(amountToBePaid.text.isEmpty()){
                amountToBePaid.setError("Enter the bill")
            }
            if(tip5.isPressed && numberOfPeople.length() > 0 && amountToBePaid.text.length>0){
                totalPerson1 == amountToBePaid1 / numberOfPeople1
                tipPerson1 == totalPerson1 + (amountToBePaid1 * 5 /100 / numberOfPeople1)
            }
            if(tip10.isPressed && numberOfPeople.length() > 0 && amountToBePaid.text.length>0){
                totalPerson1 == amountToBePaid1 / numberOfPeople1
                tipPerson1 == totalPerson1 + (amountToBePaid1  /10 / numberOfPeople1)
            }
            if(tip15.isPressed && numberOfPeople.length() > 0 && amountToBePaid.text.length>0){
                totalPerson1 == amountToBePaid1 / numberOfPeople1
                tipPerson1 == totalPerson1 + (amountToBePaid1 * 5 /100 / numberOfPeople1)

            }
            if(tip25.isPressed && numberOfPeople.length() > 0 && amountToBePaid.text.length>0){
                totalPerson1 == amountToBePaid1 / numberOfPeople1
                tipPerson1 == totalPerson1 + (amountToBePaid1 / 4 / numberOfPeople1)
            }
            if(tip50.isPressed && numberOfPeople.length() > 0 && amountToBePaid.text.length>0) {
                totalPerson1 == amountToBePaid1 / numberOfPeople1
                tipPerson1 == totalPerson1 + (amountToBePaid1 / 2 / numberOfPeople1)

            }
            if (tipCustom.isPressed  &&  tipCustom.text.isNotEmpty()){
                totalPerson1 == amountToBePaid1 / numberOfPeople1
                tipPerson1 == totalPerson1 + (amountToBePaid1 *tipCustom1 / 100 / numberOfPeople1)


            }





        }
    */

    }
}