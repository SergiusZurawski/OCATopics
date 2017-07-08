package oca.bildbloks;
import java.util.Random;

//!Fields and instance initializer blocks are run in the order in which they appear in the file.
//!The constructor runs after all fields and instance initializer blocks have run
public class OrderOfInitialization {
    // instance field
    Random r = new Random();
    String name;
    // instance initializers.
    {
        System.out.printf("NON-STATIC BLOCK\n");
    }
    // static initializers.
    static{
        System.out.printf("STATIC BLOCK\n");
    }
    // static fields
    static final String STATIC_FIELD = "STATIC FIELD";
    //Constructor
    public OrderOfInitialization(){
        System.out.println("in constructor");
    };
    public OrderOfInitialization(String s) {
        name = "Duke";// initialize in constructor
    }
    // Method
    public void CreatingObjects(){};

    // Static Method
    public static void callExample() {
        OrderOfInitialization c = new OrderOfInitialization();
        System.out.printf("MAIN METHOD\n");

    }

    /**
        1. If there is a superclass, initialize it first (we’ll cover this rule in the next chapter. For
            now, just say “no superclass” and go on to the next rule.)
        2. Static variable declarations and static initializers in the order they appear in the file.
        3. Instance variable declarations and instance initializers in the order they appear in the file.
        4. The constructor.
     */
}

class InitializationOrderSimple {
    private String name = "Torchie";
    { System.out.println(name); }
    private static int COUNT = 0;
    static { System.out.println(COUNT); }
    static { COUNT += 10; System.out.println(COUNT); }
    public InitializationOrderSimple() {
        System.out.println("constructor");
    }
}

class CallInitializationOrderSimple {
    public static void callExample() {
        InitializationOrderSimple init = new InitializationOrderSimple();
    }
}

/* Output
 0
 10
 Torchie
 constructor
 */
/**
 If the class is referred to without a new call, only rules 1 and 2 apply.
 The other two rules relate to instances and constructors. They have to wait until there is
 code to instantiate the object.
 */
class InitializationOrderN0Constructor {
    private String name = "Torchie";
    { System.out.println(name); }
    private static int COUNT = 0;
    static { System.out.println(COUNT); }
    { COUNT++; System.out.println(COUNT); }
    public InitializationOrderN0Constructor() {
        System.out.println("constructor");
    }
    public static void callExample() {
        System.out.println("read to construct");
        new InitializationOrderN0Constructor();
    }
}
/*
read to construct
Torchie
1
constructor
*/

class YetMoreInitializationOrder {
    static { add(2); }
    static void add(int num) { System.out.print(num + " "); }
    YetMoreInitializationOrder() { add(5); }
    static { add(4); }
    { add(6); }
    static { new YetMoreInitializationOrder(); }
    { add(8); }
    public static void callExample() { }
}

/*2 4 6 8 5*/

