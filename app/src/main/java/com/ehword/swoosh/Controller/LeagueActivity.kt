package com.ehword.swoosh.Controller

import android.content.Intent
import android.view.View
import android.os.Bundle
import android.widget.Toast
import com.ehword.swoosh.Utilities.EXTRA_LEAGUE
import com.ehword.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : BaseActivity() {

    var selectedLeague = ""

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
            skillIntent.putExtra(EXTRA_LEAGUE,selectedLeague)
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
        selectedLeague = "mens"
    }
    fun womensButtonClicked (view: View)
    {
        mensButton.isChecked = false
        coedButton.isChecked = false
        selectedLeague = "womens"
    }
    fun coedButtonClicked (view: View)
    {
        womensButton.isChecked = false
        mensButton.isChecked = false
        selectedLeague = "coed"
    }



}
