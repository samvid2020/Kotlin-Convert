package com.example.kotlinconvert

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    lateinit var sp1: Spinner
    lateinit var sp2: Spinner
    lateinit var ed1: EditText
    lateinit var b1: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        sp1 = findViewById(R.id.spfrom)
        sp2 = findViewById(R.id.spto)
        ed1 = findViewById(R.id.txtamt)
        val from = arrayOf("USD")
        val ad: ArrayAdapter<*> =
            ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, from)
        sp1.setAdapter(ad)
        val to = arrayOf("Indian Rupees", "Japanese yen")
        val ad1: ArrayAdapter<*> =
            ArrayAdapter(this, R.layout.support_simple_spinner_dropdown_item, to)
        sp2.setAdapter(ad1)
        b1 = findViewById(R.id.btn1)
        b1.setOnClickListener(View.OnClickListener {
            val tot: Double
            val amt = ed1.getText().toString().toDouble()
            if (sp1.getSelectedItem().toString() === "USD" && sp2.getSelectedItem()
                    .toString() === "Indian Rupees"
            ) {
                tot = amt * 75.04
                Toast.makeText(applicationContext, tot.toString(), Toast.LENGTH_LONG).show()
            } else if (sp1.getSelectedItem().toString() === "USD" && sp2.getSelectedItem()
                    .toString() === "Japanese yen"
            ) {
                tot = amt * 114.39
                Toast.makeText(applicationContext, tot.toString(), Toast.LENGTH_LONG).show()
            }
        })
    }
}