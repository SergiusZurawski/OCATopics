package oca.bildbloks.AbstractClass.CreatingClass;

/**
 * Created by serg on 15/07/17.
 */
public class Extending {
}

abstract class Animal {
    public abstract String getName();
}
/** First Concreate Class has to implement all abstract methods.
    Even if child class implements the method.
public class Walrus extends Animal { // DOES NOT COMPILE
}


public class Flamingo extends Walrus {
    public String getName() {
        return "Flamingo";
    }
}
 */

//  abstract class can extend Another abstract class, implentation is not provided
abstract class Eagle extends Animal {
}

// first concrete class has to implement all abstract methods from all abstract clasess.
abstract class BigCat extends Animal {
    public abstract void roar();
}
class Lion extends BigCat {
    public String getName() {
        return "Lion";
    }
    public void roar() {
        System.out.println("The Lion lets out a loud ROAR!");
    }
}

/**
 Abstract Class Definition Rules:
 1. Abstract classes cannot be instantiated directly.
 2. Abstract classes may be defined with any number, including zero, of abstract and non-abstract methods.
 3. Abstract classes may not be marked as private or final .
 4. An abstract class that extends another abstract class inherits all of its abstract methods as its own abstract methods.
 5. The first concrete class that extends an abstract class must provide an implementation for all of the inherited abstract methods.

 Abstract Method Defi nition Rules:
 1. Abstract methods may only be defined in abstract classes.
 2. Abstract methods may not be declared private or final .
 3. Abstract methods must not provide a method body/implementation in the abstract class for which is it declared.
 4. Implementing an abstract method in a subclass follows the same rules for overriding a method.
    For example, the name and signature must be the same, and the visibility of the method in the subclass must be at least as accessible as the method in the parent
 class.
 */