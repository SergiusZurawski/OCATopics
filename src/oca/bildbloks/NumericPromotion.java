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
        //int a = x * y;  //Error promoted to long

        double c = 39.21;
        float d = 2.1F;
        double e = c * d;
        //float f =  c * d;  //Error promoted to double

        short i = 10;
        short k = 3;
//        short m = i * k;   //Error promoted to int
        int o = i * k;

        short l = 14;
        float m = 13;
        double h = 30;

        float s = l * y;  // Promoted to float
        double r = l * y/h;  // promoted to double

    }
}
