package com.sgkang.twoclickexit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    //뒤로가기 연속 클릭 대기시간
    var backPressedTime: Long = 0

    override fun onBackPressed() {
        // 2초 내로 다시 뒤로가기 버튼을 누르면 앱 종료
        if(System.currentTimeMillis() - backPressedTime < 2000){
            finish()
        }

        Toast.makeText(this, "뒤로가기를 한번 더 누르면 종료됩니다.", Toast.LENGTH_LONG).show()
        backPressedTime = System.currentTimeMillis()
    }
}