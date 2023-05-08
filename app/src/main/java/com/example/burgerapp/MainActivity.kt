package com.example.burgerapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var btn:Button
    private lateinit var rgMeat:RadioGroup
    private lateinit var cbcheese:CheckBox
    private lateinit var cbonion:CheckBox
    private lateinit var cbsalad:CheckBox
    private lateinit var result:TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn=findViewById(R.id.btn)
        rgMeat=findViewById(R.id.rgMeat)
        cbcheese=findViewById(R.id.cbcheese)
        cbonion=findViewById(R.id.cbonion)
        cbsalad=findViewById(R.id.cbsalad)
        result=findViewById(R.id.result)

       btn.setOnClickListener {
           // this is only for radiogroup
           val checkedMeatRadioButtonId= rgMeat.checkedRadioButtonId
           val Meat=findViewById<RadioButton>(checkedMeatRadioButtonId)
           // this is for checkedbox
           val cheese=cbcheese.isChecked
           val onion=cbonion.isChecked
           val salad=cbsalad.isChecked
           // this is for textview set on programetically
           val orderString="you ordered a burger with:\n"+
                   "${Meat.text}"+
                   (if (cheese)"\ncheese" else "")+
                   (if (onion)"\nonion" else "")+
                   (if (salad)"\nsalad" else "")
                   result.text= orderString







       }

    }
}