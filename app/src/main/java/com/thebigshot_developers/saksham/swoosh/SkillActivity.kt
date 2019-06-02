package com.thebigshot_developers.saksham.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {
    var ski=""
    var league=""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league=intent.getStringExtra(EXTRA_LEAGUE)
    }
    fun beginnerBtnClicked(view: View){
        ballerskillbtn.isChecked=false
        ski="beginner"
        if(beginnerskillbtn.isChecked==false)
            ski=""
    }
    fun ballerBtnClicked(view: View){
        beginnerskillbtn.isChecked=false
        ski="baller"
        if(ballerskillbtn.isChecked==false)
            ski=""
    }
    fun skillNextBtnClicked(view: View){
        if(ski!="")
        { val fi= Intent(this, FinishActivity::class.java)
          fi.putExtra(EXTRA_LEAGUE,league +" "+ski)
            startActivity(fi)
        }else{
            Toast.makeText(this,"Please select skills", Toast.LENGTH_SHORT).show()
        }

    }
}
