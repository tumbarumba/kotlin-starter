package com.exubero.kotlinstarter

import org.hamcrest.CoreMatchers.equalTo
import org.hamcrest.MatcherAssert.assertThat
import org.junit.jupiter.api.Test

class ExampleTest {
    @Test
    fun `should calculate the thing`() {
        val example = Example()
        assertThat(example.calculate(), equalTo(42))
    }
}