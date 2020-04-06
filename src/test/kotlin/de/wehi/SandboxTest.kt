package de.wehi

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SandboxTest {

    @Test
    fun creates_class_with_default_property() {
        val sandbox = Sandbox()

        assertEquals("defaultInput", sandbox.input)
    }

    @Test
    fun adds_passed_arguments() {
        val sandbox = Sandbox()

        val result = sandbox.compute(1, 2)

        assertEquals(3, result)
    }
}