package oca.bildbloks;
import java.util.Random;

/**
 * Created by Serg on 1/21/2017.
 */
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
    public static void main(String... args) {
        OrderOfInitialization c = new OrderOfInitialization();
        System.out.printf("MAIN METHOD\n");

    }

}
