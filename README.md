# ExpressionSolver

This is a simple library with the express purpose of evaluating expressions (arbitrary precision). Used in conjunction with EquationSolver.

Since it targets JVM, Java users can also implement this library. (Jitpack)[https://jitpack.io/#adamint/ExpressionSolver/-SNAPSHOT] and Gradle/Maven to use it. (please don't just include the jar and dependencies)

Usage is very simple, create a new `MathParser`, then create new `Expression`s and call `Expression#evaluate`! 

Support for variables, functions, and constants is included already. If you don't see a function or constant that you'd like to have, 
simply use the methods in `MathParser` to create it.

An example implementation lives in (Ardent)[https://github.com/ArdentDiscord/Ardent-2018/blob/master/src/main/kotlin/com/ardentbot/commands/fun/Calculate.kt] if you're curious.

Future plans are to evaluate derivatives, integrals, and limits.
