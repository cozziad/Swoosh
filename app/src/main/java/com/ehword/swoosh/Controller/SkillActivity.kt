package com.ehword.swoosh.Controller

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.ehword.swoosh.Model.Player
import com.ehword.swoosh.Utilities.*
import com.ehword.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : BaseActivity() {

    lateinit var player : Player

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
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER)
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
            player.skill = "beginner"
        }
        else if (ballerBtn.isChecked)
        {
            player.skill = "baller"
        }
        else
        {
            Toast.makeText(this,"Please select a skill level", Toast.LENGTH_SHORT).show()
            return
        }
        val finishIntent = Intent(this, FinishActivity::class.java)
        finishIntent.putExtra(EXTRA_PLAYER,player)
        startActivity(finishIntent)
    }

}
