package com.example.elias_acuna_20250512_semana8

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private val imageList = listOf(
        R.drawable.arte1,
        R.drawable.arte2,
        R.drawable.arte3,
        R.drawable.arte4,
        R.drawable.arte5
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        recyclerView.layoutManager = GridLayoutManager(this, 2)
        recyclerView.adapter = ImageAdapter(imageList)
    }
}
