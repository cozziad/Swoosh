package com.ehword.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ehword.swoosh.R
import com.ehword.swoosh.Utilities.*
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        skill = intent.getStringExtra(EXTRA_SKILL)
        searchLeaguesTxt.text = "Looking for a $league $skill league near you"
    }

}
