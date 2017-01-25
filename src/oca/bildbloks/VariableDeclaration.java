package oca.bildbloks;

public class VariableDeclaration {
    /** ■ Local variables—in scope from declaration to end of block
        ■ Instance variables—in scope from declaration until object garbage collected
        ■ Class variables—in scope from declaration until program ends*/
    String s1;
    String s2, s3;
    String s4 = "yes", s5 = "no";
    int i1, i2, i3 = 0;
    //int num, String value; // DOES NOT COMPILE

    /**static variables go into scope when declared like the other
     variables types. However, they stay in scope for the entire life of the program*/
    static String staticStr;


    boolean b1, b2;
    String str1 = "1", str2;
    //double d1, double d2;  // DOES NOT COMPILE
    int in1; int in2;
    //int in3; in4;          // DOES NOT COMPILE

    /**
     * Identifiers (Var Names)
     *  name must begin with a letter or the symbol $ or _  ( Don’t start any identifiers with $. The compiler uses this symbol for some files.)
     *  Subsequent characters may also be numbers
     *  cannot use Java reserved word
     *  Java is case sensitive var != Var
     */
    int okidentifier;
    int $OK2Identifier;
    int _alsoOK1d3ntifi3r;
    int __SStillOkbutKnotsonice$;

    //int 3DPointClass   // identifiers cannot begin with a number
    //int hollywood@vine // @ is not a letter, digit, $ or _
    //int *$coffee       // * is not a letter, digit, $ or _
    //int public         // public is a reserved word

    /** Reserved words
     abstract
     assert
     boolean
     break
     byte
     case
     catch
     char
     class
     const*
     continue
     default
     do
     double
     else
     enum
     extends
     false
     final
     finally
     float
     for
     goto*
     if
     implements
     import
     instanceof
     int
     interface
     long
     native
     new
     null
     package
     private
     protected
     public
     return
     short
     static
     strictfp
     super
     switch
     synchronized
     this
     throw
     throws
     transient
     true
     try
     void
     volatile
     while
     */

    /** Initialization of Variables */


}
