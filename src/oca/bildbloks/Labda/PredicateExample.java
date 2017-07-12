package oca.bildbloks.Labda;

/**
    Lambdas work with interfaces that have only one method. These are called functional interfaces

    java.util.function
    public interface Predicate<T> {
        boolean test(T t);
    }
 */
import java.util.*;
import java.util.function.Predicate;

public class PredicateExample {
    public static void callExample() {
        List<Animal> animals = new ArrayList<Animal>();
        animals.add(new Animal("fish", false, true));
        print(animals, a -> a.canHop());
    }

    private static void print(List<Animal> animals, Predicate<Animal> checker) {
        for (Animal animal : animals) {
            if (checker.test(animal))
                System.out.print(animal + " ");
        }
        System.out.println();
    }
}
