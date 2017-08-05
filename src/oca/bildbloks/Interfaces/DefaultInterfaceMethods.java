package oca.bildbloks.Interfaces;

/**
 A default method is a method defi ned within an interface with the default keyword in which a method body is provided.

 A default method within an interface defi nes an abstract method with a default implementation
 */
public class DefaultInterfaceMethods {}

interface IsWarmBlooded {
    boolean hasScales();
    public default double getTemperature() {
        return 10.0;
    }
}
/**
 1. A default method may only be declared within an interface and not within a class or abstract class.
 2. A default method must be marked with the default keyword. If a method is marked as default , it must provide a method body.
 3. A default method is not assumed to be static , final , or abstract , as it may be used or overridden by a class that implements the interface.
 4. Like all methods in an interface, a default method is assumed to be public and will not compile if marked as private or protected .
 */

interface Carnivore {
    //public default void eatMeat(); // DOES NOT COMPILE
    //public int getRequiredFoodAmount() { // DOES NOT COMPILE
    //    return 13;
    //}
}

/**default methods
 cannot be marked as static and require an instance of the class implementing the inter-
 face to be invoked. They can also not be marked as final or abstract , because they are
 allowed to be overridden in subclasses but are not required to be overridden.

 When an interface extends another interface that contains a default method,
 */


interface HasFins {
    public default int getNumberOfFins(){
        return 4;
    }
    public default double getLongestFinLenght(){
        return 20.0;
    }
    public default boolean doFinsHaveScales(){
        return true;
    }
}

interface SharkFamily extends HasFins {
    public default int getNumberOfFins() {
        return 8;
    }
    public double getLongestFinLength();
//    public boolean doFinsHaveScales() { // DOES NOT COMPILE  //No
//        return false;
//    }
}
abstract class SharkFamily2 implements HasFins{
    public boolean doFinsHaveScales() { // COMPILE  abstract class can contain methods(non abstract methods and no need for default)
        return false;
    }
}

//--------------
/**
  If a class implements two interfaces that have default methods with the same name and
 signature, the compiler will throw an error.
 Exception
 if the subclass overrides the duplicate default methods, the code will compile without
 issue. (ambiguity about which version of the method to call has been removed.)

 * */
interface Walk {
    public default int getSpeed() {
        return 5;
    }
}

interface Run {
    public default int getSpeed() {
        return 10;
    }
}
/*
class Cat implements Walk, Run { // DOES NOT COMPILE
    public static void main(String[] args) {
        System.out.println(new Cat().getSpeed());
    }
}
*/