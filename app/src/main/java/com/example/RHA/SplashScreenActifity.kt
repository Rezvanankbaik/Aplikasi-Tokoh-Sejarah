package com.example.RHA

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.lifecycleScope
import com.example.tugas_pts.R
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlin.time.Duration.Companion.milliseconds


class SplashScreenActifity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen_actifity)
        lifecycleScope.launch {
            delay(1000.milliseconds)
            startActivity(Intent(this@SplashScreenActifity, Tampilan1::class.java))
            finish()
        }
    }
}





