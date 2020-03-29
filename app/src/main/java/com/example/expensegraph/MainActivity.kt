package com.example.expensegraph

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun addExpense(view: View) {}
    fun graphs(view: View) {

    }

    fun importFrom(view: View) {}
    fun exportFrom(view: View) {}
}
