package oca.bildbloks.Inheritence;

/**
 First statement of every constructor is either this() , or a call to a constructor in the direct parent class super()
 If the parent class has more than one constructor, the child class may use any valid parent constructor in its defi nition
 */

public class Zebra extends Animal {
    public Zebra(int age) {
        super(age);
    }
    public Zebra() {
        this(4);
    }
}