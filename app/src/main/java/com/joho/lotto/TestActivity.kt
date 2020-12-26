package com.joho.lotto

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_test.*

class TestActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_test)


        button.setOnClickListener{
            // MainActivity 를 시작하는 Intent 를 생성한다.
            val intent = Intent(this@TestActivity, MainActivity::class.java)
            // intent 를 사용하여 Activity 를 시작한다.
            startActivity(intent)
        }

        button2.setOnClickListener{
            // ConstellationActivity 를 시작하는 Intent 를 생성한다.
            val intent = Intent(this@TestActivity, ConstellationActivity::class.java)
            // intent 를 사용하여 Activity 를 시작한다.
            startActivity(intent)
        }

        button3.setOnClickListener{
            // NameActivity 를 시작하는 Intent 를 생성한다.
            val intent = Intent(this@TestActivity, NameActivity::class.java)
            // intent 를 사용하여 Activity 를 시작한다.
            startActivity(intent)
        }

        button4.setOnClickListener{
            // RESULT ACTIVITY 를 시작하는 Intent 를 생성한다.
            val intent = Intent(this@TestActivity, ResultActivity::class.java)
            // intent 를 사용하여 Activity 를 시작한다.
            startActivity(intent)
        }

        /**
         *  xml에서 참조할 수 있게 메소드 정의
         */

        fun goConstellation(view: View){
            val intent = Intent(this@TestActivity, ConstellationActivity::class.java)
            startActivity(intent)
        }


    }
}
