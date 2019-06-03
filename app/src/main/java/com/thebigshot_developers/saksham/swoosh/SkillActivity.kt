package com.thebigshot_developers.saksham.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {
    var player:String=""
    var playerSk:String=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player=intent.getStringExtra(EXTRA_Player)
    }
    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState?.putString(EXTRA_Player,player)
        outState?.putString(EXTRA_PlayerSk,playerSk)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState!=null){
            player=savedInstanceState.getString(EXTRA_Player)
        playerSk=savedInstanceState.getString(EXTRA_PlayerSk)
    }}
    fun beginnerBtnClicked(view: View){
        ballerskillbtn.isChecked=false
        playerSk="beginner"
        if(beginnerskillbtn.isChecked==false)
            playerSk=""
    }
    fun ballerBtnClicked(view: View){
        beginnerskillbtn.isChecked=false
        playerSk="baller"
        if(ballerskillbtn.isChecked==false)
            playerSk=""
    }
    fun skillNextBtnClicked(view: View){
        if(playerSk!="")
        { val fi= Intent(this, FinishActivity::class.java)
          fi.putExtra(EXTRA_Player,player + " "+playerSk)
            startActivity(fi)
        }else{
            Toast.makeText(this,"Please select skills", Toast.LENGTH_SHORT).show()
        }

    }
}
