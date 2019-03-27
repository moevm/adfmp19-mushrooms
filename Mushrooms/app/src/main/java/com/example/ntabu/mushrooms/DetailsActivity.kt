package com.example.ntabu.mushrooms

import android.os.Bundle
import android.text.Html
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : MushroomsActivityBase() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        setupActionBar()

        descriptionText.setText(getDescriptionText())
    }

    private fun getDescriptionText() : String {
        val text = "<p>Можно спутать с желчным грибом, горчаком с розовеющей мякотью.</p>" +
            "<p>Шляпка белого гриба имеет коричнево-бурый цвет, существуют подвиды белых " +
            "грибов с окраской шляпки от светло коричневого до темно каштанового цвета. Обычно она вырастает " +
            "до 7-30 сантиметров в диаметре. Хотя в некоторых, особенно благоприятных местах, можно встретить " +
            "белый гриб со шляпкой диаметром в 50 см. Оборот шляпки губчатый, белого цвета.</p>" +
            "<p>Мякоть у созревшего гриба обычно сочная, плотная, мясистая, белого цвета. " +
            "У старых грибов она может немного пожелтеть. На срезе и после обработки не темнеет.</p>" +
            "<p>Растут везде, за исключением Антарктиды и Австралии, в хвойных, лиственных и смешанных лесах.</p>"
        return Html.fromHtml(text, Html.FROM_HTML_MODE_LEGACY).toString()
    }
}
