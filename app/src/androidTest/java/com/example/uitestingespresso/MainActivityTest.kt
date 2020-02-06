package com.example.uitestingespresso

import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Test

class MainActivityTest {
    @Test
    fun testMainActivity() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.main)).check(matches(isDisplayed()))
    }

    //testing visibility of next button
    @Test
    fun test_visibility_of_title_and_next_button() {
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
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
        val activityScenario = ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.title_main))
            .check(matches(withText(R.string.main_activity)))
    }
}