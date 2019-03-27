package com.example.ntabu.mushrooms

import android.content.Intent
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_results.*

class ResultsActivity : MushroomsActivityBase() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_results)
        setupActionBar()

        result1.setOnClickListener {
            val intent = Intent(this, DetailsActivity::class.java)
            startActivity(intent)
        }
    }
}
