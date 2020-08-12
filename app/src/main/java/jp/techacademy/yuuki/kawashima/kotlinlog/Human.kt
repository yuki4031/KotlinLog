package jp.techacademy.yuuki.kawashima.kotlinlog

import android.util.Log

open class Human: Animal,Thinkable{
    var hobby: String
    constructor(name: String, age: Int): super(name,age){
        this.hobby = ""
    }
    override fun say(){
        Log.d("kotlintest","私の名前は" + this.name + "です。年は" + this.age + "歳です。")
    }
    override fun think(){
        Log.d("kotlintest","私は" + this.hobby + "について考える。")
    }
}