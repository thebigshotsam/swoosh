package com.thebigshot_developers.saksham.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {
    var opt=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    fun mensBtnClicked(view: View){
        womensleaguebtn.isChecked=false
        Coeleaguebtn.isChecked=false
         opt="mens"
        if(mensleaguebtn.isChecked==false)
            opt=""
    }
    fun womenBtnClicked(view: View){
        mensleaguebtn.isChecked=false
        Coeleaguebtn.isChecked=false
        opt="womens"
        if(womensleaguebtn.isChecked==false)
            opt=""

    }
    fun CoedBtnClicked(view: View){
        womensleaguebtn.isChecked=false
        mensleaguebtn.isChecked=false
        opt="coed"
        if(Coeleaguebtn.isChecked==false)
            opt=""
    }
    fun leagueNextClicked(view: View) = if(opt!=""){
    val skil= Intent(this,SkillActivity::class.java)
        skil.putExtra(EXTRA_LEAGUE,opt)
    startActivity(skil)}else{
        Toast.makeText(this,"Please select Leagues",Toast.LENGTH_SHORT).show()
    }
}
