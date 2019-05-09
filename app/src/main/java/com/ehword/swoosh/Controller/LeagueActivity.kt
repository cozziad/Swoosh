package com.ehword.swoosh.Controller

import android.content.Intent
import android.view.View
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import com.ehword.swoosh.Utilities.*
import com.ehword.swoosh.R
import com.ehword.swoosh.Model.Player
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var player = Player("","")

    override fun onSaveInstanceState(outState: Bundle?) {
        super.onSaveInstanceState(outState)
        outState?.putParcelable(EXTRA_PLAYER,player)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle?) {
        super.onRestoreInstanceState(savedInstanceState)
        if (savedInstanceState != null)
        {
            player = savedInstanceState.getParcelable(EXTRA_PLAYER)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

//        leagueNextButton.setOnClickListener {
//            val skillIntent = Intent(this, SkillActivity::class.java)
//            startActivity(skillIntent)
//        }
    }
    fun leagueNextClicked (view: View){
        if (mensButton.isChecked || womensButton.isChecked || coedButton.isChecked) {
            val skillIntent = Intent(this, SkillActivity::class.java)
            skillIntent.putExtra(EXTRA_PLAYER,player)
            startActivity(skillIntent)
        }
        else
        {
            Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT).show()
        }
    }

    fun mensButtonClicked (view: View)
    {
        womensButton.isChecked = false
        coedButton.isChecked = false
        player.league = "mens"
    }
    fun womensButtonClicked (view: View)
    {
        mensButton.isChecked = false
        coedButton.isChecked = false
        player.league = "womens"
    }
    fun coedButtonClicked (view: View)
    {
        womensButton.isChecked = false
        mensButton.isChecked = false
        player.league = "coed"
    }



}
