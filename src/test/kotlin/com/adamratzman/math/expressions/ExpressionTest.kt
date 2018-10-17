package com.adamratzman.math.expressions

import com.adamratzman.math.MathParser
import org.junit.Test

internal class ExpressionTest {
    val parser = MathParser(100)

    @Test
    fun evaluateFunctions() {
        val expression = Expression("8a^2 - 4")
        expression.set("a", 9)
        println(expression.evaluate())

    }

    @Test
    fun evaluate() {
        val expression = Expression("4x^2 + 99x - 853 % 99")
        expression.set("x", 18)
        println(expression.evaluate())
        expression.set("x", "2b")
        expression.set("b", "2")
        println(expression)
        println(expression.evaluate())

        parser.evaluateExpression("4 + mod(4,8)")
    }

}