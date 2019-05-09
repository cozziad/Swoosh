package com.ehword.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ehword.swoosh.Utilities.*
import com.ehword.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE)
    }

    fun beginnerBtnClicked (view:View)
    {
        ballerBtn.isChecked = false
    }

    fun ballerBtnClicked (view:View)
    {
        beginnerBtn.isChecked = false
    }

    fun finishBtnClicked (view: View)
    {
        if (beginnerBtn.isChecked) {
            skill = "beginner"
        }
        else if (ballerBtn.isChecked)
        {
            skill = "baller"
        }
        else
        {
            Toast.makeText(this,"Please select a skill level", Toast.LENGTH_SHORT).show()
            return
        }
        val finishIntent = Intent(this, FinishActivity::class.java)
        finishIntent.putExtra(EXTRA_LEAGUE,league)
        finishIntent.putExtra(EXTRA_SKILL,skill)
        startActivity(finishIntent)
    }

}
