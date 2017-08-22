package oca.bildbloks.Autoboxing;

public class Primitive {
    public void flyInt(int numMiles) { System.out.println("int");}
    public void flyInt(Integer numMiles) { System.out.println("Integer");}

    void callInts(){
        // More Specific is called
        int a = 1;
        Integer b = 1;

        flyInt(a);
        flyInt(1);
        flyInt(b);
    }
}

class Refference {
    public void flyRef(String s) {System.out.print("string ");}
    public void flyRef(Object o) {System.out.print("object ");}

    void callReff(){
        // More Specific is called
        String a = "s";
        Object b = new Object();

        flyRef(a);
        flyRef("");
        flyRef(b);
        flyRef(1); //Autoboxed to Integer > Object
    }
}

class OrderOfCall {
    public void fly(int i) {
        System.out.print("int ");
    }

    public void fly(long l) {
        System.out.print("long ");
    }

    void callInts() {
        // More Specific is called
        int a = 1;
        Integer b = 1;

        long c = 1L;
        Long d = 1L;

        fly(a);
        fly(1);
        fly(b);

        fly(c);
        fly(d);

        Object o = new Object();
        //fly(o);  //Error
    }

    /**
     Exact match by type    public String glide(int i, int j) {}
     Larger primitive type  public String glide(long i, long j) {}
     Autoboxed type         public String glide(Integer i, Integer j) {}
     Varargs                public String glide(int... nums) {}
     */

    public void flyPriority(int i)      {System.out.print("int ");}
    public void flyPriority(long i)     {System.out.print("long ");}
    public void flyPriority(Integer i)  {System.out.print("Integer ");}
    public void flyPriority(Long i)     {System.out.print("Long ");}
    public void flyPriority(int ... i)  {System.out.print("Varargs int ");}

    public static void callExample() {
        OrderOfCall co = new OrderOfCall();
        // first priority is:
        //                     direct match, output "int"
        //                     Larger primitive type "long'
        //                     Autoboxed Integer "Integer'
        //                     Varargs "Varargs'
        int var = 1;
        co.flyPriority(var); //int
    }

}

class OrderOfCallLongerType {
    /** Larger Type
     Exact match by type    public String glide(int i, int j) {}
     Larger primitive type  public String glide(long i, long j) {}
     Autoboxed type         public String glide(Integer i, Integer j) {}
     Varargs                public String glide(int... nums) {}
     */
    public void flyPriority(double i)   {System.out.print("double ");}
    public void flyPriority(float i)    {System.out.print("float ");}
    public void flyPriority(long i)     {System.out.print("long ");}
    public void flyPriority(Integer i)  {System.out.print("Integer ");}
    public void flyPriority(Long i)     {System.out.print("Long ");}
    public void flyPriority(int ... i)  {System.out.print("Varargs int ");}


    public static void callExampleInt() {
        OrderOfCallLongerType co = new OrderOfCallLongerType();
        int var = 1;
        co.flyPriority(var); //long
    }
}

class OrderOfCallLongerPrimitive {
    /** float and double has priority over Autoboxed types;
     Exact match by type    public String glide(int i, int j) {}
     Larger primitive type  public String glide(long i, long j) {}
     Autoboxed type         public String glide(Integer i, Integer j) {}
     Varargs                public String glide(int... nums) {}
     */
    public void flyPriority(double i)   {System.out.print("double ");}
    public void flyPriority(float i)    {System.out.print("float ");}
    public void flyPriority(Integer i)  {System.out.print("Integer ");}
    public void flyPriority(Long i)     {System.out.print("Long ");}
    public void flyPriority(int ... i)  {System.out.print("Varargs int ");}


    public static void callExample() {
        OrderOfCallLongerPrimitive co = new OrderOfCallLongerPrimitive();
        int var = 1;
        co.flyPriority(var); //float
    }

}

class OrderOfCallPrimitiveClasses {
    /**
     * Converted to primitive type;
     * Exact match by type    public String glide(int i, int j) {}
     * Larger primitive type  public String glide(long i, long j) {}
     * Autoboxed type         public String glide(Integer i, Integer j) {}
     * Varargs                public String glide(int... nums) {}
     */
    public void flyPriority(Integer i)  {System.out.print("Integer ");}
    public void flyPriority(Long i)     {System.out.print("Long ");}
    public void flyPriority(int... i)   {System.out.print("Varargs int ");}


    public static void callExample() {
        OrderOfCallPrimitiveClasses co = new OrderOfCallPrimitiveClasses();
        int var = 1;
        co.flyPriority(var); //Integer
    }
}

class OrderOfCallPrimitiveClassesConvrsionToBigger {
    /**
     * float and double has priority over Autoboxed types;
     * Exact match by type    public String glide(int i, int j) {}
     * Larger primitive type  public String glide(long i, long j) {}
     * Autoboxed type         public String glide(Integer i, Integer j) {}
     * Varargs                public String glide(int... nums) {}
     */
    public void flyPriority(Integer i)  {System.out.print("Integer ");}
    public void flyPriority(Long i)     {System.out.print("Long ");}
    public void flyPriority(int... i)   {System.out.print("Varargs int ");}


    public static void callExample() {
        OrderOfCallPrimitiveClasses co = new OrderOfCallPrimitiveClasses();
        int var = 1;
        co.flyPriority(var); //Integer
    }
}


/** Var Args Example*/
class Glider2 {
    public static String glide(String s)           {return "1";}
    public static String glide(String... s)        {return "2";}
    public static String glide(Object o)           {return "3";}
    public static String glide(String s, String t) {return "4";}

    public static void callExample() {
        System.out.print(glide("a"));
        System.out.print(glide("a", "b"));
        System.out.print(glide("a", "b", "c"));
    }
}
  /**Java Will Do only One Conversion*/

class TooManyConversions {
  public static void play(Long l) { }
  public static void play(Long... l) { }
  public static void Appy() {
      //play(4);      // DOES NOT COMPILE
      play(4L);   // calls the Long version
  }
}

