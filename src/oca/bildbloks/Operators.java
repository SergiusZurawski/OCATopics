package oca.bildbloks;

/** unary,
    binary
    ternary

    Java operators are not necessarily evaluated from left-to-right order
    Unless overridden with parentheses, Java operators follow order of operation
    If two operators have the same level of precedence, then Java guarantees left-to-right evaluation
    All of the arithmetic operators may be applied to any Java primitives, except boolean and String
 */
/** operator precedence

    expression++, expression--                        Post-unary operators
    ++expression, --expression                        Pre-unary operators
    +, -, !                                           Other unary operators
    *, /, %                                           Multiplication/Division/Modulus
    +, -                                              Addition/Subtraction
    <<, >>, >>>                                       Shift operators
    <, >, <=, >=, instanceof                          Relational operators
    ==, !=                                            Equal to/not equal to
    &, ^, |                                           Logical operators
    &&, ||                                            Short-circuit logical operators
    boolean expression ? expression1 : expression2    Ternary operators
    =, +=, -=, *=, /=, %=, &=, ^=, !=, <<=, >>=, >>>= Assignment operators
 */

/**
    +  Indicates a number is positive, although numbers are assumed to be positive in Java unless accompanied by a negative unary operator
    - Indicates a literal number is negative or negates an expression
    ++ Increments a value by 1
    -- Decrements a value by 1
    ! Inverts a Boolean’s logical value
 */

public class Operators {

    public void orderOfOperation() {
        //reminder can be applied to a  -x

        //int x = !5; // DOES NOT COMPILE
        //boolean y = -true; // DOES NOT COMPILE
        //boolean z = !0; // DOES NOT COMPILE

        int x = 3;
        int y = ++x * 5 / x-- + --x;
        System.out.println("x is " + x);
        System.out.println("y is " + y);
    }


}
