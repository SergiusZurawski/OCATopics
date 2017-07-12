package oca.bildbloks.Inheritence.noDefaultConstructor;


/**
public class Elephant extends Mammal{ // DOES NOT COMPILE

}

public class Elephant extends Mammal{
    public Mammal(int age) {         // DOES NOT COMPILE
    }
}
 */
public class Elephant extends Mammal {
    public Elephant() {
        super(10);
    }
}