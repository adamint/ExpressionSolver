package com.adamratzman.math.expressions

import com.adamratzman.math.MathParser
import java.util.*

val parser = MathParser(100)

fun main(args:Array<String>) {
    val scanner = Scanner(System.`in`)
    while (scanner.hasNextLine()) {
        val before = System.currentTimeMillis()
        println("Value: ${Expression(scanner.nextLine()).evaluate()}")
        println("Time: ${System.currentTimeMillis() - before}ms")
    }
}
