package com.example.ntabu.mushrooms

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.SeekBar
import android.widget.Spinner
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_questionnaire2.*

class Questionnaire2 : MushroomsActivityBase() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questionnaire2)
        setupActionBar()

        but_ready.setOnClickListener {
            val intent = Intent(this, ResultsActivity::class.java)
            startActivity(intent)
        }

        val hatSpecSpinner: Spinner = findViewById(R.id.ed_hat_spec)
        ArrayAdapter.createFromResource(this, R.array.spec_array, android.R.layout.simple_spinner_item)
            .also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                hatSpecSpinner.adapter = adapter
            }

        val legColorSpinner: Spinner = findViewById(R.id.ed_leg_color)
        ArrayAdapter.createFromResource(this, R.array.leg_color_array, android.R.layout.simple_spinner_item)
            .also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                legColorSpinner.adapter = adapter
            }

        val legRingSpinner: Spinner = findViewById(R.id.ed_leg_ring)
        ArrayAdapter.createFromResource(this, R.array.leg_ring_array, android.R.layout.simple_spinner_item)
            .also { adapter ->
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                legRingSpinner.adapter = adapter
            }

        setupOnProgressChanged(sb_hat_width, val_hat_width)
        setupOnProgressChanged(sb_leg_height, val_leg_height)
        setupOnProgressChanged(sb_leg_diameter, val_leg_diameter)
    }

    private fun setupOnProgressChanged(seekBar: SeekBar, textView: TextView) {
        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, i: Int, b: Boolean) {
                textView.text = i.toString()
            }
            override fun onStartTrackingTouch(seekBar: SeekBar) {
                // Do nothing
            }
            override fun onStopTrackingTouch(seekBar: SeekBar) {
                // Do nothing
            }
        })
    }
}
