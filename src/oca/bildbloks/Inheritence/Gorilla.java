package oca.bildbloks.Inheritence;

/**
 If the parent class has more than one constructor, the child class may use any valid parent constructor in its defi nition
 */
public class Gorilla extends Animal {
    public Gorilla(int age) {
        super(age,"Gorilla");
    }
    public Gorilla() {
        super(5);
    }
}
