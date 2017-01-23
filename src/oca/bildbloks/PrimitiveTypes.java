package oca.bildbloks;
import static java.lang.System.*;

public class PrimitiveTypes {
    boolean aTrue = true; //true|false
    boolean aFalse = Boolean.FALSE;
    byte aByteMin = Byte.MIN_VALUE;     //-128
    byte aByteMax = Byte.MAX_VALUE;     // 127
    short aShortMin = Short.MIN_VALUE;  // -32768
    short aShortMax = Short.MAX_VALUE;  //  32767
    int aIntMin = Integer.MIN_VALUE;    // -2147483648
    int aIntMax = Integer.MAX_VALUE;    //  2147483647
    long aLongMin = Long.MIN_VALUE;     //  -2 63
    long aLongMax = Long.MAX_VALUE;     //   2 64 -1
    float aFloatMin = Float.MIN_VALUE;  //  -2147483647
    float aFloatMax = Float.MAX_VALUE;  //   2147483647
    double aDoubleMin = Double.MAX_VALUE;
    double aDoubleMax = Double.MIN_VALUE;
    char aCharMin = '\u0000';               //(or 0)
    char aCharMax = '\uffff';               //(or 65,535 inclusive)

    boolean aBoolDefault;
    byte aByteDefault;
    short aShortDefault;
    int aIntDefault;
    long aLongDefault;
    float aFloatDefault;
    double aDoubleDefault;
    char aCharDefault;

    public void printMinMaxValue(){
        out.println(aByteMin);
        out.println(aByteMax);
        out.println("---");
        out.println(aShortMin);
        out.println(aShortMax);
        out.println("---");
        out.println(aIntMin);
        out.println(aIntMax);
        out.println("---");
        out.println(aLongMin);
        out.println(aLongMax);
        out.println("---");
        out.println(aFloatMin);
        out.println(aFloatMax);
        out.println("---");
        out.println(aDoubleMin);
        out.println(aDoubleMax);
        out.println("---");
        out.println(aCharMin);
        out.println(aCharMax);
    }

    public void printDefault(){
        out.println(aBoolDefault);
        out.println(aShortDefault);
        out.println(aIntDefault);
        out.println(aLongDefault);
        out.println(aFloatDefault);
        out.println(aDoubleDefault);
        out.println(aCharDefault);
    }
}
