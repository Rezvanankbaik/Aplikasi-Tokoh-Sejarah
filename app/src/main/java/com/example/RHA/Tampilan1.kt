package com.example.RHA

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.tugas_pts.R
import com.google.android.material.appbar.MaterialToolbar

class Tampilan1:AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tampilan_1)

        val tampilan = findViewById<RecyclerView>(R.id.tampilan)
        tampilan.adapter = Adaptor(
            dataTokoh,
        onclik = {namaTokoh, asalNegara, dexkripsiTokoh, gambarTokoh, profesi ->
            startActivity(Intent(this, Tampilan2::class.java).apply {
                putExtra("NAMA",namaTokoh )
                putExtra("ASAL",asalNegara)
                putExtra("GAMBAR",gambarTokoh)
                putExtra("DEXKRIPSI",dexkripsiTokoh)
                putExtra("PROFESI",profesi)
            }
            )
        })

        var persen3 = findViewById<ImageView>(R.id.persen_3)
        persen3. setOnClickListener{
            startActivity(Intent(this, profile::class.java))
        }
    }
}