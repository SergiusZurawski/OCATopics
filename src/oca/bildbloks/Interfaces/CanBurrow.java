package oca.bildbloks.Interfaces;

/**
    public or default access modifier
    abstract keyword (assumed)
    interface keyword (required)
    interface name
    public abstract keywords (assumed)
    public static final keywords (assumed)
 */
public abstract interface CanBurrow {
    public static final int MINIMUM_DEPTH = 2;
    public abstract int getMaximumDepth();
}

/**
    Implementing an interface
        implements keyword (required)
        interface name
        signature matches interface method
 */

class FieldMouse implements CanBurrow {
    public int getMaximumDepth() {
        return 10;
    }
}

/**Defining an Interface
 1. Interfaces cannot be instantiated directly.
 2. An interface is not required to have any methods.
 3. An interface may not be marked as final .
 4. All top-level interfaces are assumed to have public or default access, and they must include the abstract
        modifier in their definition. Therefore, marking an interface as  private ,
        protected , or final will trigger a compiler error, since this is incompatible with these assumptions.
 5. All nondefault methods in an interface are assumed to have the modifiers abstract and public in their definition.
        Therefore, marking a method as private , protected , or final will trigger compiler errors
        as these are incompatible with the abstract and public keywords.
 */
interface WalksOnTwoLegs {}
class TestClass {
    public static void main(String[] args) {
        //WalksOnTwoLegs example = new WalksOnTwoLegs(); // DOES NOT COMPILE
    }
}
//public final interface WalksOnEightLegs {} // DOES NOT COMPILE

interface CanFly {
    void fly(int speed);
    abstract void takeoff();
    public abstract double dive();
}
//interface are equal, compiler will add abstract and public abstract
abstract interface CanFlyDublicate {
    public abstract void fly(int speed);
    public abstract void takeoff();
    public abstract double dive();
}

/** BAD example
private final interface CanCrawl {      // DOES NOT COMPILE
    private void dig(int depth);        // DOES NOT COMPILE
    protected abstract double depth();  // DOES NOT COMPILE
    public final void surface();        // DOES NOT COMPILE
}
*/

//Inheriting an Interface
/**
 1. An interface that extends another interface, as well as an abstract class that
    implements an interface, inherits all of the abstract methods as its own abstract
    methods.
 2. The first concrete class that implements an interface, or extends an abstract class
    that implements an interface, must provide an implementation for all of the inherited
    abstract methods.
 */

//Like an abstract class, an interface may be extended using the extend keyword
//Unlike an abstract class, though, an interface may extend multiple interfaces.
interface HasTail {
    public int getTailLength();
}
interface HasWhiskers {
    public int getNumberOfWhiskers();
}
interface Seal extends HasTail, HasWhiskers {
}
// fi rst concrete class to extend the abstract class
// must implement all the inherited abstract methods of the interface.
//class LeopardSeal implements HasTail, HasWhiskers {}

/**Bad Examples*/
interface CanRun {}
//class Cheetah extends CanRun {} // DOES NOT COMPILE Class Cannot extend Interface*
class Hyena {}
//interface HasFur extends Hyena {} // DOES NOT COMPILE Interface Cannot extend Class
/**class implements interface not Extends*/
/** class that inherits from two interfaces that contain the same abstract method */
interface Herbivore {
    public void eatPlants();
}
interface Omnivore {
    public void eatPlants();
    public void eatMeat();
}
/**If two abstract interface methods have identical behaviors - the same method signature—
    creating a class that implements one of the two methods automatically implements the second method
        interface methods are considered duplicates since they have the same signature.
 */
class Bear implements Herbivore, Omnivore {
    public void eatMeat() {
        System.out.println("Eating meat");
    }
    public void eatPlants() {
        System.out.println("Eating plants");
    }
}

/** two methods have different signatures
 If the method name is the same but the input parameters are different - overload.
 */

/**It is not possible in Java to define two methods in a class with the same name and input parameters but different return types. */
interface Herbivore1 {
    public int eatPlants();
}
interface Omnivore1 {
    public void eatPlants();
}
/*
class Bear1 implements Herbivore1, Omnivore1 {
    public int eatPlants() { // DOES NOT COMPILE
        System.out.println("Eating plants: 10");
        return 10;
    }
    public void eatPlants() { // DOES NOT COMPILE
        System.out.println("Eating plants");
    }
}
*/

/**The compiler would also throw an exception if you defi ne an interface or abstract class that inherits from two conflicting interfaces*/
//public interface Supervore extends Herbivore, Omnivore {}            // DOES NOT COMPILE
//public abstract class AbstractBear implements Herbivore, Omnivore {} // DOES NOT COMPILE