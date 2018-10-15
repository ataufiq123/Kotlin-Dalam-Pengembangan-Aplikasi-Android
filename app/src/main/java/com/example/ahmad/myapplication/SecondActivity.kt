package com.example.ahmad.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val nama= intent.getStringExtra("nama")
        val alamat= intent.getStringExtra("alamat")

        tv_data_diri.text="""
                            Perkenalkan,
                            Nama Saya $nama
                            Berasal dari $alamat
                           """.trimIndent()
    }
}
