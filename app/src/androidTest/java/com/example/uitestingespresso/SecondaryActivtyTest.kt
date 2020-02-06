package com.example.uitestingespresso

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class SecondaryActivtyTest{
    @get : Rule
    val activityRule = ActivityScenarioRule(SecondaryActivty::class.java)

    //test for view currently in view
    @Test
    fun testSecondaryActivity() {
        onView(withId(R.id.secondary))
            .check(matches(isDisplayed()))
    }

    @Test
    fun test_title_button_previous_displayed() {
        onView(withId(R.id.title_secondary))
            .check(matches(isDisplayed()))

        onView(withId(R.id.button_previous))
            .check(matches(isDisplayed()))
    }

    @Test
    fun test_title_secondary() {
        onView(withId(R.id.title_secondary))
            .check(matches(withText(R.string.secondary_activity)))
    }
}