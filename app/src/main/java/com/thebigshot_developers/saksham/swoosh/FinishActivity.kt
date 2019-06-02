package com.thebigshot_developers.saksham.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    var end=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        end=intent.getStringExtra(EXTRA_LEAGUE)
        endview.text="We are finding details of "+end+" ..."
    }
}
