package impls

import interfaces.Functions

/**
 * Класс, реализующий интерфейс Functions
 */
class FunctionsImpl : Functions {
    override fun calculate(a: Int, b: Int) = a + b
    override fun substringCounter(s: String, sub: String): Int {
        var index = 0
        var counter = 0

        while (true) {
            index = s.indexOf(sub, index)
            if (index != -1) {
                counter++
                index += sub.length
            } else return counter
        }
    }

    override fun splitterSorter(s: String, sub: String): List<String> {
        return s.split(sub)
    }

    override fun uniqueCounter(s: String, sub: String): Map<String, Int> {
        val result = mutableMapOf<String, Int>()
        for (str in s.split(sub)) {
            if (result.containsKey(str)) result[str] = result[str]!! + 1
            else result[str] = 1
        }
        return result
    }

    override fun isPalindrome(s: String): Boolean {
        return s == invert(s)
    }

    override fun invert(s: String): String {
        return s.reversed()
    }
}
