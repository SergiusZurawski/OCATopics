package oca.bildbloks.Constructors;

/** constructors must have different parameters in order to be overloaded.
 */
public class Overloading {
    private String color;
    private int weight;
    public Overloading(int weight) {// first constructor
        this.weight = weight;
        color = "brown";
    }
    public Overloading(int weight, String color) { // second constructor
        this.weight = weight;
        this.color = color;
    }
    // Calling constructor
    public Overloading(int weight, int i) {//
        //Overloading(weight, "brown"); // DOES NOT COMPILE
        //Constructors can be called only by writing new before the name of the constructor
    }

    public Overloading(int weight, long l) {
        new Overloading(weight, "brown"); // Compiles but does not do what we want
    }

    // Correct
    public Overloading(int weight, Long l) {
        this(weight, "brown");  // this keyword
    }

    // Not correct
    public Overloading(int weight, Integer l) {
        System.out.println("in constructor");
        // ready to call this
        //this(weight, "brown");  //DOES NOT COMPILE , this has to be first
    }
}


