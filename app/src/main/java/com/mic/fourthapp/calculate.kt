package com.mic.fourthapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculate.*

class calculate : AppCompatActivity() {
    var total:Double = 0.0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculate)
        btn_add.setOnClickListener {
         total=calcula("add")
        }
        btn_sub.setOnClickListener {
            total=calcula("sub")
        }
        btn_div.setOnClickListener {
            total=calcula("div")
        }
        btn_mul.setOnClickListener {
            total=calcula("mul")
        }
        btn_equal.setOnClickListener {
            txt_result.text="The total number ="+total.toString()
        }
        btn_clear.setOnClickListener {
            txt_result.text="The total number ="+"0.0"
            et_numberone.setText("")
            et_numbertwo.setText("")

        }
        btn_continue.setOnClickListener {
            val intent=Intent(this,MainActivity::class.java)
            startActivity(intent)
        }
    }
    fun calcula(operator:String):Double{
        var num1:Double=0.0
            num1=et_numberone.text.toString().toDouble()
        var  num2:Double=0.0
                num2=et_numbertwo.text.toString().toDouble()
        var result:Double=0.0


        if(operator.equals("add")){
            result=num1+num2
        }else if(operator.equals("sub")){
            result=num1-num2
        }else if(operator.equals("mul")){
            result=num1*num2
        }else if(operator.equals("div")){
            result=num1/num2
        }
        return result
    }
}
