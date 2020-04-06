package de.wehi

class Sandbox(val input: String = "defaultInput") {

    fun compute(vararg input: Int): Int {
        return input.sum()
    }
    
}
