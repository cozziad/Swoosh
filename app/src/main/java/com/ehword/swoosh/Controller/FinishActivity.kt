package com.ehword.swoosh.Controller

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.ehword.swoosh.R
import com.ehword.swoosh.Utilities.*
import com.ehword.swoosh.Model.*
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : BaseActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        val player = intent.getParcelableExtra<Player>(EXTRA_PLAYER)
        searchLeaguesTxt.text = "Looking for a ${player.league} ${player.skill} league near you"
    }

}
