package com.example.tipcalculator


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.text.isDigitsOnly

class MainActivity : AppCompatActivity() {

    private lateinit var numberOfPeople: EditText
    private lateinit var amountToBePaid: EditText
    private lateinit var tipPerson: TextView
    private lateinit var totalPerson: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var calculateButton = findViewById<Button>(R.id.calculateButton)
        var tip5 = findViewById<Button>(R.id.tip5)
        var tip10 = findViewById<Button>(R.id.tip10)
        var tip15 = findViewById<Button>(R.id.tip15)
        var tip25 = findViewById<Button>(R.id.tip25)
        var tip50 = findViewById<Button>(R.id.tip50)
        var tipCustom = findViewById<EditText>(R.id.tipCustom)

        numberOfPeople = findViewById(R.id.numberOfPeople)
        amountToBePaid = findViewById(R.id.amountToBePaid)
        tipCustom = findViewById(R.id.tipCustom)
        tipPerson = findViewById(R.id.tipPerson)
        totalPerson = findViewById(R.id.totalPerson)
        var tip = 0
        tip5.setOnClickListener {
            tip = 5
        }
        tip10.setOnClickListener {
            tip = 10
        }
        tip15.setOnClickListener {
            tip = 15
        }
        tip25.setOnClickListener {
            tip = 25
        }
        tip50.setOnClickListener {
            tip = 50
        }



        calculateButton.setOnClickListener {
            val numberOfPeople1 = numberOfPeople.text.toString().toInt()
            val amountToBePaid1 = amountToBePaid.text.toString().toInt()
            if (numberOfPeople.text.isEmpty()) {
                numberOfPeople.setError("Enter number of people")
            }
            if (amountToBePaid.text.isEmpty()) {
                amountToBePaid.setError("Enter the bill")
            }

            if (tipCustom.text.toString().isEmpty()) {
                when (tip) {
                    5 -> {
                        totalPerson.text = (amountToBePaid1 / numberOfPeople1).toString()
                        tipPerson.text = (totalPerson.text.toString()
                            .toInt() + (amountToBePaid1 / 20 / numberOfPeople1)).toString()
                    }

                    10 -> {
                        totalPerson.text = (amountToBePaid1 / numberOfPeople1).toString()
                        tipPerson.text = (totalPerson.text.toString()
                            .toInt() + (amountToBePaid1 / 10 / numberOfPeople1)).toString()
                    }


                    15 -> {
                        totalPerson.text = (amountToBePaid1 / numberOfPeople1).toString()
                        tipPerson.text = (totalPerson.text.toString()
                            .toInt() + (amountToBePaid1 * 3 / 20 / numberOfPeople1)).toString()
                    }

                    25 -> {
                        totalPerson.text = (amountToBePaid1 / numberOfPeople1).toString()
                        tipPerson.text = (totalPerson.text.toString()
                            .toInt() + (amountToBePaid1 / 4 / numberOfPeople1)).toString()
                    }

                    50 -> {
                        totalPerson.text = (amountToBePaid1 / numberOfPeople1).toString()
                        tipPerson.text = (totalPerson.text.toString()
                            .toInt() + (amountToBePaid1 / 2 / numberOfPeople1)).toString()
                    }


                }


            }else{
                totalPerson.text = ( amountToBePaid1 / numberOfPeople1).toString()
                tipPerson.text = (totalPerson.text.toString().toInt() + (amountToBePaid1 * totalPerson.text.toString().toInt() / 100 / numberOfPeople1 ) ).toString()
            }


        }


    }
}
