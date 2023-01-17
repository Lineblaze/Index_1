package tests

import impls.FunctionsImpl
import interfaces.Functions
import org.testng.AssertJUnit.assertEquals
import org.testng.annotations.Test

class FunctionsTest {
    private val functions: Functions = FunctionsImpl()
    @Test
    fun calculateTest() {
        assertEquals(3, functions.calculate(1, 2))
        assertEquals(0, functions.calculate(0, 0))
        assertEquals(0, functions.calculate(-1, 1))
    }
    @Test
    fun substringCounterTest() {
        assertEquals(3, functions.substringCounter("a a a b c", "a"))
        assertEquals(0, functions.substringCounter("a a a b c", "d"))
        assertEquals(0, functions.substringCounter("", "a"))
    }
    @Test
    fun splitterSorterTest() {
        assertEquals(listOf("a", "a", "a", "b", "c"), functions.splitterSorter("a, a, a, b, c", ", "))
        assertEquals(listOf("a", "a a b c"), functions.splitterSorter("a, a a b c", ", "))
        assertEquals(listOf("a a a b c"), functions.splitterSorter("a a a b c", ", "))
    }
    @Test
    fun uniqueCounterTest() {
        assertEquals(mapOf("a" to 3, "b" to 1, "c" to 1), functions.uniqueCounter("a, a, a, b, c", ", "))
        assertEquals(mapOf("a," to 3, "b," to 1, "c" to 1), functions.uniqueCounter("a, a, a, b, c", " "))
    }
    @Test
    fun isPalindromeTest() {
        assertEquals(true, functions.isPalindrome("abccba"))
        assertEquals(true, functions.isPalindrome(" "))
        assertEquals(true, functions.isPalindrome(""))
        assertEquals(false, functions.isPalindrome("abca"))
    }
    @Test
    fun invertTest() {
        assertEquals("dcba", functions.invert("abcd"))
        assertEquals(" ", functions.invert(" "))
        assertEquals("", functions.invert(""))
    }
}
