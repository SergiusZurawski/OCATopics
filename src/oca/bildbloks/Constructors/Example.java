package oca.bildbloks.Constructors;


/** constructor is a special method that matches the name of the class and has no return type*/

/*When Java sees the new keyword, it allocates memory for the new object. Java also looks
for a constructor and calls it.
*/

/* A constructor is typically used to initialize instance variables. The this keyword tells
Java you want to reference an instance variable.
*/

public class Example {
    public Example() {
        System.out.println("constructor");
    }

    //invalid constructors; Considered as
    //public Example() { } // DOES NOT COMPILE  doesn't match the classname because Java is case sensitive
    public void Example() { }  // Has return type is considered as method
}

/** Java gives you the one with the most granular scope, which is the parameter*/
class This {
    private String color;
    public This(String color) {
        this.color = color;
    }

    public This(String color,String s) {
        color = color;  //assigning parameter to itself
    }
}

class ThisExample {
    private String color;
    private int height;
    private int length;
    public ThisExample(int length, int theHeight) {
        length = this.length; // backwards – no good!  //The instance variable length starts out with a 0 value. That 0 is assigned to the method parameter length . The instance variable stays at 0.
        height = theHeight;   // fine because a different name
        this.color = "white"; // fine, but redundant
    }
    public static void executeExample() {
        ThisExample b = new ThisExample(1, 2);
        System.out.println(b.length + " " + b.height + " " + b.color);
    }
}

