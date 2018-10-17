# ExpressionSolver
Adam Ratzman, for ISCS

This is a simple library with the express purpose of evaluating expressions (arbitrary precision). Used in conjunction with EquationSolver

Usage is very simple, create a new `MathParser`, then create new `Expression`s and call `Expression#evaluate`! 

Support for variables, functions, and constants is included already. If you don't see a function or constant that you'd like to have, 
simply use the methods in `MathParser` to create it.

Future plans are to evaluate derivatives, integrals, and limits
