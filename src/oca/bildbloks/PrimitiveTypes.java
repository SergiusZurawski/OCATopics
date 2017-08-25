package oca.bildbloks;
import static java.lang.System.*;


/** http://cs.fit.edu/~ryan/java/language/java-data.html
 Type	    Description	                Default	    Size	    Example Literals
 boolean	true or false	            false	    1 bit	    true, false
 char	    Unicode character	        \u0000	    16 bits	    'a', '\u0041', '\101', '\\', '\'', '\n', 'ß'
 byte	    twos complement integer	    0	        8 bits	    (none)
 short	    twos complement integer	    0	        16 bits	    (none)
 int	    twos complement integer	    0	        32 bits	    -2, -1, 0, 1, 2
 long	    twos complement integer 	0	        64 bits	    -2L, -1L, 0L, 1L, 2L
 float	    IEEE 754 floating point	    0.0	        32 bits	    1.23e100f, -1.23e-100f, .3f, 3.14F
 double	    IEEE 754 floating point	    0.0	        64 bits	    1.23456e300d, -1.23456e-300d, 1e1d


 Type	Size	    Range
 byte	8 bits	    -128 .. 127
 short	16 bits	    -32,768 .. 32,767
 int	32 bits	    -2,147,483,648 .. 2,147,483,647
 long	64 bits	    -9,223,372,036,854,775,808 .. 9,223,372,036,854,775,807
 float	32 bits	    3.40282347 x 1038, 1.40239846 x 10-45
 double	64 bits	    1.7976931348623157 x 10308, 4.9406564584124654 x 10-324

*/

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
    // Refferency types; default always null
    String aReffDefault;

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
        out.println(aCharDefault);  //'\u0000' (NUL)
        out.println(aReffDefault);
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

    public static void widenings(){
        /**
         from
         to		byte	short	char	int	    long	float	double
         byte   [id] |    -   |
         short	 +   |  [id]  |
         char	 -   |    -   | [id] |
         int	 + 	 |    +	  |	 +   |  [id]
         long	 +   |	  +	  |  +   |    +   | [id]
         float	 +   |	  +	  |  +   |    +   |   +   |  [id]
         double	 +   |	  +	  |  +   |    +   |   +   |   +    | [id]



                byte( -128 .. 127)  short(-32,768 .. 32,767)  char(\u0000 .. \uFFFF)
         short	-128..127*	        [id]	 	 	 	      --
         int	-128..127*	        -32,768 .. 32,767*	      0 .. 65,535+	            [id]
         long	-128 .. 127*	    -32,768 .. 32,767*	      0 .. 65,535+	             -1	    [id]
         float	-128.0 .. 127.0	    -32,768.0 .. 32,767.0	  0.0 .. 65,535.0	        -1.0p	-1.0p	[id]
         double	-128.0 .. 127.0	    -32,768.0 .. 32,767.0	  0.0 .. 65,535.0	        -1.0	-1.0p	1.2

         */
        byte aByte = 127;
        /** to Short */
        short aShort = aByte;
        /** to Char */
        char aChar;
        aChar = 123;
        aChar = 'C';
        //aChar = aByte;  //Exception
        //aChar = aShort; //Exception
        /** to Int */
        int aInt;
        aInt = aByte;
        aInt = aShort;
        aInt = aChar;
        /** to Long */
        long aLong;
        aLong = aByte;
        aLong = aShort;
        aLong = aChar;
        aLong = aInt;
        /** to float */
        float aFloat;
        aFloat = aByte;
        aFloat = aShort;
        aFloat = aChar;
        aFloat = aInt;
        aFloat = aLong;
        /** to Dobule */
        double aDouble;
        aDouble = aByte;
        aDouble = aShort;
        aDouble = aChar;
        aDouble = aInt;
        aDouble = aLong;
        aDouble = aFloat;
    }

    public static void narrwings(){

    }
}
