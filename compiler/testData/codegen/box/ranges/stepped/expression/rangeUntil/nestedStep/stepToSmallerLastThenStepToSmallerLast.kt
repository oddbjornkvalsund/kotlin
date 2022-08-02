// Auto-generated by GenerateSteppedRangesCodegenTestData. Do not edit!
// WITH_STDLIB
// DONT_TARGET_EXACT_BACKEND: JVM
// !LANGUAGE: +RangeUntilOperator
@file:OptIn(ExperimentalStdlibApi::class)
import kotlin.test.*

fun box(): String {
    val intList = mutableListOf<Int>()
    val intProgression = 1..<11
    for (i in intProgression step 2 step 3) {
        intList += i
    }
    assertEquals(listOf(1, 4, 7), intList)

    val longList = mutableListOf<Long>()
    val longProgression = 1L..<11L
    for (i in longProgression step 2L step 3L) {
        longList += i
    }
    assertEquals(listOf(1L, 4L, 7L), longList)

    val charList = mutableListOf<Char>()
    val charProgression = 'a'..<'k'
    for (i in charProgression step 2 step 3) {
        charList += i
    }
    assertEquals(listOf('a', 'd', 'g'), charList)

    return "OK"
}