package com.thebigshot_developers.saksham.swoosh

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {
    var player=Player("","")

    override fun onSaveInstanceState(outState: Bundle?, outPersistentState: PersistableBundle?) {
        super.onSaveInstanceState(outState, outPersistentState)
        outState?.putParcelable(EXTRA_Player,player)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if(savedInstanceState!=null)
            player=savedInstanceState.getParcelable(EXTRA_Player)
    }

    fun mensBtnClicked(view: View){
        womensleaguebtn.isChecked=false
        Coeleaguebtn.isChecked=false
         player.league="mens"
        if(mensleaguebtn.isChecked==false)
            player.league=""

    }
    fun womenBtnClicked(view: View){
        mensleaguebtn.isChecked=false
        Coeleaguebtn.isChecked=false
        player.league="womens"
        if(womensleaguebtn.isChecked==false)
            player.league=""

    }
    fun CoedBtnClicked(view: View){
        womensleaguebtn.isChecked=false
        mensleaguebtn.isChecked=false
        player.league="coed"
        if(Coeleaguebtn.isChecked==false)
            player.league=""
    }
    fun leagueNextClicked(view: View) {

        if (player.league != "") {
            val skillac = Intent(this, SkillActivity::class.java)
            skillac.putExtra(EXTRA_Player, player.league)
            startActivity(skillac)


        } else {
            Toast.makeText(this, "Please select Leagues", Toast.LENGTH_SHORT).show()
        }
    }
}
