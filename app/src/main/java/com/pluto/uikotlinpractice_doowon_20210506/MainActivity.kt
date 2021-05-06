package com.pluto.uikotlinpractice_doowon_20210506

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//    확인 버튼이 눌렸을 때 실행할 이벤트

        okBtn.setOnClickListener {
//            입력된 내용을 (contentEdt의 text값) 조회하여 변수에 저장한다. (조회한다 = get)

            val inputContent = contentEdt.text.toString()
//            contentEdt의 text를 String으로

            resultTxt.text = inputContent

        }

    }
}