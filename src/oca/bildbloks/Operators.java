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

import java.io.File;

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

    public void assigmentt() {
        /**smaller types will be promoted automaticly to bigger types, however bigger types will throw exception if assigned to a smaller type*/
        //int x = 1.0; // DOES NOT COMPILE
        //short y = 1921222; // DOES NOT COMPILE
        //int z = 9f; // DOES NOT COMPILE
        //long t = 192301398193810323; // DOES NOT COMPILE
    }

    //Casting Primitive Values
    public void castingPrimitives(){
        int x = (int)1.0;
        short y = (short)1921222; // Stored as 20678
        int z = (int)9l;
        long t = 192301398193810323L;
        // Overwlow
        System.out.print(2147483647+1); // -2147483648
        System.out.print(Integer.MAX_VALUE+1);
        System.out.print(Integer.MIN_VALUE-1);
    }


    //Compound operators are shorthand and they can also save us from having to explicitly cast a value
    public void compoundAssignmentOperators(){
        int x = 3;
        x *= 2;
        long i = 10;
        int o = 5;
        //o = o * i;  // DOES NOT COMPILE
        o *= i;       // Compails
        // AssignmentOperator is an expression
        long a = 5;
        long b = (a=3);
    }

    public void relationalOperators ()
    {
        /*  applied to numeric primitive data types only
            If the two numeric operands are not of the same data type, the smaller one is promoted in the manner as previously discussed

            <   Strictly less than
            <=  Less than or equal to
            >   Strictly greater than
            >=  Greater than or equal to

            a instanceof b - True if the reference that a points to is an instance of a class, subclass, or class that implements a particular interface, as named in b
         */
    }

    public void logicOperators () {
        /** (&), (|), and (^), may be applied to both numeric and boolean data types
            boolean data types, they’re referred to as logical operators
            numeric data types, they’re referred to as bitwise operators
         * */

    }

    boolean x = true;
    boolean y = true;
    boolean i = false;
    boolean z = false;

    public void logicalTrueTablesAND(){
        System.out.println(x & y); //true
        System.out.println(x & i); //false
        System.out.println(i & z); //false
    }

    public void logicalTrueTablesOR(){
        System.out.println(x | y); //true
        System.out.println(x | i); //true
        System.out.println(i | z); //false
    }

    public void logicalTrueTablesXOR(){
        System.out.println(x ^ y); //true
        System.out.println(x ^ i); //true
        System.out.println(i ^ z); //false
    }

    /**conditional operators, && and ||, short-circuit operators almost exatly "&" and "|", respectively,
        except that the right-hand side of the expression may never be
        evaluated if the final result can be determined by the left-hand side of the expression
     */
    public void logicalTrueTablesShortCircuit(){
        int p;
        boolean x = true || (p < 4); // p not initialized

        /**short-circuit operators are used is checking for null objects before performing an operation*/
        Integer a = null;
        if(a != null && a.longValue() < 5) {
            // Do something
        }

        if(a != null & a.longValue() < 5) { // Throws an exception if x is null
            // Do something
        }

        int q = 6;
        boolean e = (q >= 6) || (++q <= 7);
        System.out.println(q);  // 6
    }

    /** Equality Operators  == and !=.
        “two objects are the same” != “two objects are equivalent.”
        Equality isn't present for numeric and boolean primitives

         1. Comparing two numeric primitive types. If the numeric values are of different data
             types, the values are automatically promoted as previously described. For example,
             5 == 5.00 returns true since the left side is promoted to a double.
         2. Comparing two boolean values.
         3. Comparing two objects, including null and String values. compares references to the objects,
            not the objects they point to


     */

    public void equality(){
        /* you cannot mix and match types
        boolean x = true == 3; // DOES NOT COMPILE
        boolean y = false != "Giraffe"; // DOES NOT COMPILE
        boolean z = 3 == "Kangaroo"; // DOES NOT COMPILE
        */

        /*Object comparison*/
        File x = new File("myFile.txt");
        File y = new File("myFile.txt");
        File z = x;
        System.out.println(x == y); // Outputs false
        System.out.println(x == z); // Outputs true
    }
}
