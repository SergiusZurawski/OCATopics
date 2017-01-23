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

    //Excepttions
    //Overflows
    /*
    byte ByteOverflow = 3123456789;
    int IntOverflow = 3123456789;
    long LongOverflow = 3123456789;
    */


    public void printMinMaxValue(){
        out.println("Byte---");
        out.println(aByteMin);
        out.println(aByteMax);
        out.println("Short---");
        out.println(aShortMin);
        out.println(aShortMax);
        out.println("Int---");
        out.println(aIntMin);
        out.println(aIntMax);
        out.println("Long---");
        out.println(aLongMin);
        out.println(aLongMax);
        out.println("Float---");
        out.println(aFloatMin);
        out.println(aFloatMax);
        out.println("Double---");
        out.println(aDoubleMin);
        out.println(aDoubleMax);
        out.println("Char---");
        out.println(aCharMin);
        out.println(aCharMax);
    }

    public void printDefault(){
        out.println(aBoolDefault);
        out.println(aByteDefault);
        out.println(aShortDefault);
        out.println(aIntDefault);
        out.println(aLongDefault);
        out.println(aFloatDefault);
        out.println(aDoubleDefault);
        out.println(aCharDefault);
    }
}
