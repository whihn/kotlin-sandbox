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

        assertEquals(3, sandbox.compute(1, 2))
        assertEquals(6, sandbox.compute(1, 2, 3))
        assertEquals(10, sandbox.compute(1, 2, 3, 4))
    }
}