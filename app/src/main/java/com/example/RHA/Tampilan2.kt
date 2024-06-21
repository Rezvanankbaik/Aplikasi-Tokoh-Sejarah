package com.example.RHA

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.tugas_pts.R
import com.google.android.material.appbar.MaterialToolbar

class Tampilan2:AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.tampilan_2)

        val namatokoh = intent.getStringExtra("NAMA")
        val asal = intent.getStringExtra("ASAL")
        val gambar = intent.getIntExtra("GAMBAR",0)
        val dexkripsi = intent.getStringExtra("DEXKRIPSI")
        val profesi = intent.getStringExtra("PROFESI")

        val detail_dexkripsi = findViewById<TextView>(R.id.dexkrisi)
        val detail_gambar = findViewById<ImageView>(R.id.gambar_1)
        val detail_nama = findViewById<TextView>(R.id.nama_1)
        val detail_profesi = findViewById<TextView>(R.id.profesi)
        val detail_asal = findViewById<TextView>(R.id.asal_negara)


        val clik = findViewById<TextView>(R.id.clik)
        clik.setOnClickListener {
            val kiriman: Intent = Intent().apply {
                action = Intent.ACTION_SEND
                putExtra(Intent.EXTRA_TEXT, "$namatokoh\n" +
                        "$dexkripsi")
                type = "text/plain"
            }
            val kirim = Intent.createChooser(kiriman, null)
            startActivity(kirim)
        }






        detail_gambar.setImageResource(gambar)
        detail_dexkripsi.text=dexkripsi
        detail_nama.text=namatokoh
        detail_asal.text=asal
        detail_profesi.text=profesi


        var panahbalik2 = findViewById<MaterialToolbar>(R.id.panah_balik2)
        panahbalik2.setNavigationOnClickListener{
            finish()
        }
    }
}