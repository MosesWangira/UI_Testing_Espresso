package com.example.uitestingespresso

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import kotlinx.android.synthetic.main.activity_secondary_activty.*

class SecondaryActivty : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_secondary_activty)

        button_previous.setOnClickListener {
            onBackPressed()
        }

    }
}
