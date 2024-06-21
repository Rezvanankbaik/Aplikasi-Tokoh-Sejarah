package com.example.RHA

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugas_pts.R
import com.google.android.material.appbar.MaterialToolbar

class profile : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile)

        var panahbalik = findViewById<MaterialToolbar>(R.id.panah_balik)
        panahbalik. setNavigationOnClickListener {
            finish()
        }




    }
}