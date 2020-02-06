package com.example.uitestingespresso

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.Espresso.pressBack
import androidx.test.espresso.action.ViewActions.click
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import androidx.test.ext.junit.rules.ActivityScenarioRule
import org.junit.Rule
import org.junit.Test

class MainActivityTest {

    @get : Rule
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun test_navigation_to_next() {
        onView(withId(R.id.button_next)).perform(click())

        onView(withId(R.id.secondary))
            .check(matches(isDisplayed()))
    }

    @Test
    fun test_back_to_mainActivity() {
        onView(withId(R.id.button_next)).perform(click())

        onView(withId(R.id.secondary))
            .check(matches(isDisplayed()))
//        method 1
        onView(withId(R.id.button_previous)).perform(click())
//        method 2
//        pressBack()

        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }

    @Test
    fun testMainActivity() {
//        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }

    //testing visibility of next button
    @Test
    fun test_visibility_of_title_and_next_button() {
//        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.title_main))
            .check(matches(isDisplayed()))

        /**
         * method 1
         * */
        onView(withId(R.id.button_next))
            .check(matches(isDisplayed()))

        /**
         * method 2
         * test for view that may not be currently in view
         * */
        onView(withId(R.id.button_next))
            .check(matches(withEffectiveVisibility(Visibility.VISIBLE)))
    }

    @Test
    fun isTextDisplayedCorrect() {
//        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.title_main))
            .check(matches(withText(R.string.main_activity)))
    }
}