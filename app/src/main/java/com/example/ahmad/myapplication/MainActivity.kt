package com.example.ahmad.myapplication

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var nama:String?=null
    lateinit var alamat:String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn_simpan.setOnClickListener {
            nama=et_nama.text.toString()
            alamat=et_alamat.text.toString()

            val intent =Intent(this,SecondActivity::class.java)
            intent.let {
                it.putExtra("nama",nama)
                it.putExtra("alamat",alamat)
            }
            startActivity(intent)
        }

    }

}
