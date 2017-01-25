package oca.bildbloks;

/**
    1. If two values have different data types, Java will automatically promote one of the values to the larger of the two data types.
    2. If one is int and other is floating-point, Java will automatically promote the int to the floating-point value’s data type.
    3. Smaller data types, namely byte, short, and char,
        are first promoted to int any time they’re used with a Java binary arithmetic operator,
        even if neither of the operands is int.
    4. After all promotion has occurred and the operands have the same data type, the resulting
        value will have the same data type as its promoted operands.
 */
public class NumericPromotion {
    public void promotion(){
        int x = 1;
        long y = 33;
        long z = x * y;
        //int a = x * y;  //Error

        double c = 39.21;
        float d = 2.1F;
    }
}
