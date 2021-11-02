package com.neato.test

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.ext.junit.rules.activityScenarioRule
import com.kaspersky.kaspresso.testcases.api.testcase.TestCase
import io.github.kakaocup.kakao.image.KImageView
import org.junit.Rule
import org.junit.Test

class POCInstrumentationTest : TestCase()  {

    @get:Rule
    var activityScenarioRule: ActivityScenarioRule<*> =
        activityScenarioRule<MainActivity>()

    @Test
    fun name() = run {

        val image = KImageView {
            withId(R.id.image)
        }
        image.hasDrawable(R.drawable.error_image)
    }

}