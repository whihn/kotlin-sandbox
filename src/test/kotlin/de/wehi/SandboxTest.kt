package de.wehi

import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class SandboxTest {

    @Test
    fun `creates class with default property`() {
        val sandbox = Sandbox()

        assertEquals("defaultInput", sandbox.input)
    }

    @Test
    fun `sums passed arguments`() {
        val sandbox = Sandbox()

        assertEquals(3, sandbox.compute(1, 2))
        assertEquals(6, sandbox.compute(1, 2, 3))
        assertEquals(10, sandbox.compute(1, 2, 3, 4))
    }
}