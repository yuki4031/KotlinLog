package jp.techacademy.yuuki.kawashima.kotlinlog

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import java.lang.Exception

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val h = Human("川島",22)
        h.hobby = "音楽"
        h.say()
        h.think()
    }
}
