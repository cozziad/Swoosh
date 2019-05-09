package com.ehword.swoosh.Controller

import android.os.Bundle
import com.ehword.swoosh.Utilities.EXTRA_LEAGUE
import com.ehword.swoosh.R

class SkillActivity : BaseActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
        println(league)

    }
}
