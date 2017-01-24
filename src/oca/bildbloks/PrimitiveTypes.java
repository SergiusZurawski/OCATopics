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

    boolean aBoolDefault;  //false
    byte aByteDefault;     //0
    short aShortDefault;   //0
    int aIntDefault;       //0
    long aLongDefault;     //0
    float aFloatDefault;   //0.0
    double aDoubleDefault; //0.0
    char aCharDefault;

    //Excepttions
    //Overflows
    //By default, Java assumes you are defning an !int! value with a literal
    // All below considered int
    /*
    byte ByteOverflow = 3123456789;
    int IntOverflow = 3123456789;
    long LongOverflow = 3123456789;
    */
    //To make it a specifi type, Numeric Literal
    long appropriateLiteralCapital = 3123456789L;
    long appropriateLiteralLower   = 3123456789l;

    //Different "Base" Systems
    //1. Octal (8) 0-7 start with "0"
    int octal = 017;
    //2. hexadecimal (0–9 and A–F), prefix number 0x or 0X example, 0xFF
    int hexadecimal = 0xFF;
    //3. binary 0-1 , prefix 0b or 0B
    int binary = 0b11;

    // underscores in number
    int million1 = 1000000;
    int million2 = 1_000_000;

    //double notAtStart = _1000.00; // DOES NOT COMPILE; beginning
    //double notAtEnd = 1000.00_; // DOES NOT COMPILE; end
    //double notByDecimal = 1000_.00; // DOES NOT COMPILE;  right before a decimal point, or right after a decimal point
    double annoyingButLegal = 1_00_0.0_0; // this one compiles



    public void initializeLocalVarInBranches(boolean check){
        int initLocal;

        if(check)
            initLocal = 1;
        //out.println(initLocal); // Compiler Err; Compiller tracks that check could be false

        if(true)
            initLocal = 1;
        out.println(initLocal);  // No error; If always executed.

        int initLocal2;
        if(check)
            initLocal2 = 1;
        else
            initLocal2 = 2;

        out.println(initLocal2);  // No error; All branches covered.
    }

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

    public void printBaseSystems(){
        System.out.println(56);     // 56
        System.out.println(0b11);   // 3
        System.out.println(017);    // 15
        System.out.println(0x1F);   // 31
    }

    public void defaultValuesForLocalVar(){
        /**local var doesn't have a default value*/
        boolean aBoolDefaultLocal;
        byte aByteDefaultLocal;
        short aShortDefaultLocal;
        int aIntDefaultLocal;
        long aLongDefaultLocal;
        float aFloatDefaultLocal;
        double aDoubleDefaultLocal;
        char aCharDefaultLocal;
        /**use without initializaiotn will result in compiler error*/
//        out.println(aBoolDefaultLocal); // Does not compile
//        out.println(aByteDefaultLocal);
//        out.println(aShortDefaultLocal);
//        out.println(aIntDefaultLocal);
//        out.println(aLongDefaultLocal);
//        out.println(aFloatDefaultLocal);
//        out.println(aDoubleDefaultLocal);
//        out.println(aCharDefaultLocal);
    }
}
