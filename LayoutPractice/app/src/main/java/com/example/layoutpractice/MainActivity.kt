package com.example.layoutpractice

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*


// 메인화면
class MainActivity : AppCompatActivity() {

    val TAG:String = "로그"

    // 뷰가 생성되었을 때
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // 그릴 xml 뷰 파일을 연결시켜준다. 즉, 설정한다.
        setContentView(R.layout.activity_main)

        // 로그인 버튼 뷰에 클릭 리스너를 설정하였다.
//        login_btn.setOnClickListener(View.OnClickListener {
//            onLoginButtonClicked()
//
//        })
        // 람다식(더 간단)
        login_btn.setOnClickListener {
            onLoginButtonClicked()
        }

    }

    fun onLoginButtonClicked(){
        Log.d(TAG, "MainActivity - onLoginButtonClicked() called")

        val intent = Intent(this, SecondActivity::class.java)

        startActivity(intent)
    }

}