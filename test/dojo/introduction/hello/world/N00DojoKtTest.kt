package dojo.introduction.hello.world

import org.junit.Assert.assertEquals
import org.junit.Test

class N00DojoKtTest {
    @Test fun testPrint(){
        val helloWorld = "Hello, World"
        assertEquals(helloWorld, getName(helloWorld))
        println(getName(helloWorld))
    }

    private fun getName(name: String): String {
        return name;
    }
}