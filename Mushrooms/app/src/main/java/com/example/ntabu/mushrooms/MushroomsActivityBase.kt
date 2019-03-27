package com.example.ntabu.mushrooms

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.view.Menu
import android.view.MenuItem
import android.widget.ImageButton

abstract class MushroomsActivityBase : AppCompatActivity() {

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.main_menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        return when (item!!.itemId) {
            R.id.action_history -> {
                goHistory()
                true
            }
            else -> super.onOptionsItemSelected(item)
        }
    }

    protected fun setupActionBar() {
        setSupportActionBar(findViewById(R.id.my_toolbar))
        supportActionBar?.title = null

        findViewById<ImageButton>(R.id.but_back).setOnClickListener { super.onBackPressed() }
        findViewById<ImageButton>(R.id.but_home).setOnClickListener { goHome() }
    }

    protected fun goHistory() {
        val intent = Intent(this, History::class.java)
        startActivity(intent)
    }

    protected fun goHome() {
        val intent = Intent(this, MainActivity::class.java)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
        startActivity(intent)
    }
}