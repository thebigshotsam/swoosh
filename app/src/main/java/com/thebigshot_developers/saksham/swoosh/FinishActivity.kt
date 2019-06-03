package com.thebigshot_developers.saksham.swoosh

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    var player:String=""


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        player=intent.getStringExtra(EXTRA_Player)
        endview.text="We are finding details of $player ... "
    }
}
