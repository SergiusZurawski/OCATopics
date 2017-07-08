package oca.bildbloks.Labda;

import java.util.ArrayList;
import java.util.List;

public class Animal {
    private String species;
    private boolean canHop;
    private boolean canSwim;
    public Animal(String speciesName, boolean hopper, boolean swimmer) {
        species = speciesName;
        canHop = hopper;
        canSwim = swimmer;
    }
    public boolean canHop() { return canHop; }
    public boolean canSwim() { return canSwim; }
    public String toString() { return species; }
}

interface CheckTrait {
    boolean test(Animal a);
}

class CheckIfHopper implements CheckTrait {
    public boolean test(Animal a) {
        return a.canHop();
    }
}

class TraditionalSearch {
    public static void callExample() {
        List<Animal> animals = new ArrayList<Animal>(); // list of animals
        animals.add(new Animal("fish", false, true));
        animals.add(new Animal("kangaroo", true, false));
        animals.add(new Animal("rabbit", true, false));
        animals.add(new Animal("turtle", false, true));
        print(animals, new CheckIfHopper()); // pass class that does check
        print(animals, a -> a.canSwim());  // Lambda way
    }
    private static void print(List<Animal> animals, CheckTrait checker) {
        for (Animal animal : animals) {
            if (checker.test(animal)) // the general check
            System.out.print(animal + " ");
        }
        System.out.println();
    }
}

/**
 print(() -> true);                                     // 0 parameters
 print(a -> a.startsWith("test"));                      // 1 parameters
 print((String a) -> a.startsWith("test"));             // 1 parameters
 print((a, b) -> a.startsWith("test"));                 // 2 parameters
 print((String a, String b) -> a.startsWith("test"));   // 2 parameters

 invalid sintax
 print(a, b -> a.startsWith("test"));         // DOES NOT COMPILE  parentheses are only optional when there is one parameter and it doesn’t have a type declared
 print(a -> { a.startsWith("test"); });       // DOES NOT COMPILE no return keyword.
 print(a -> { return a.startsWith("test") });  // DOES NOT COMPILE no semicolon

 Lambdas are allowed to access Instance and static variables.

 Java doesn’t allow us to redeclare a local variable, the following is an issue:
 (a, b) -> { int a = 0; return 5;} // DOES NOT COMPILE
 (a, b) -> { int c = 0; return 5;} // is ok, it uses a different variable name
 */