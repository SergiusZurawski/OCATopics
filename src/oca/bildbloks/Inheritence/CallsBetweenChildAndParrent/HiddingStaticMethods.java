package oca.bildbloks.Inheritence.CallsBetweenChildAndParrent;

/**
 * child class defi nes a static method with the same name and signature as a static method defi ned in a parent class
        First, the four previous rules for overriding a method must be followed when a method is hidden.
    1. The method in the child class must have the same signature as the method in the parent class.
    2. The method in the child class must be at least as accessible or more accessible than the method in the parent class.
    3. The method in the child class may not throw a checked exception that is new or broader than the class of any exception thrown in the parent class method.
    4. If the method returns a value, it must be the same or a subclass of the method in the parent class, known as covariant return types.
    5. The method defined in the child class must be marked as static if it is marked as static in the parent class (method hiding).
            Likewise, the method must not be marked as static in the child class if it is not marked as static in the parent class (method overriding).
 */
public class HiddingStaticMethods {
}

class Bear {
    public static void eat() {
        System.out.println("Bear is eating");
    }

    public static void sneeze() {
        System.out.println("Bear is sneezing");
    }
    public void hibernate() {
        System.out.println("Bear is hibernating");
    }
}
class Panda extends Bear {

    //Hidding
    public static void eat() {
        System.out.println("Panda bear is chewing");
    }

    /*
    public void sneeze() { // DOES NOT COMPILE
        System.out.println("Panda bear sneezes quietly");
    }

    public static void hibernate() { // DOES NOT COMPILE
        System.out.println("Panda bear is going to sleep");
    }
    */

    public static void callExample() {
        Panda.eat();
    }
}

/**Overriding vs. Hiding Methods*/
// hidding
class Marsupial {
    public static boolean isBiped() {
        return false;
    }
    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped());
    }
}
class Kangaroo extends Marsupial {
    public static boolean isBiped() {
        return true;
    }
    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: "+isBiped());
    }
    public static void callExample() {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
    }
    /* OutPut
        Marsupial walks on two legs: false
        Kangaroo hops on two legs: true
    */
}
// overriding

class MarsupialOverriding {
    public boolean isBiped() {
        return false;
    }
    public void getMarsupialDescription() {
        System.out.println("Marsupial walks on two legs: "+isBiped());
    }
}
class KangarooOverriding extends MarsupialOverriding {
    public boolean isBiped() {
        return true;
    }
    public void getKangarooDescription() {
        System.out.println("Kangaroo hops on two legs: "+isBiped());
    }
    public static void callExample() {
        Kangaroo joey = new Kangaroo();
        joey.getMarsupialDescription();
        joey.getKangarooDescription();
    }
    /*
        Marsupial walks on two legs: true
        Kangaroo hops on two legs: true
    */
}
// Mix
class Foo {
    public static void classMethod() {
        System.out.println("classMethod() in Foo");
    }

    public void instanceMethod() {
        System.out.println("instanceMethod() in Foo");
    }
}

class Bar extends Foo {
    public static void classMethod() {
        System.out.println("classMethod() in Bar");
    }

    public void instanceMethod() {
        System.out.println("instanceMethod() in Bar");
    }
}

class Test {
    public static void callExample() {
        Foo f = new Bar();
        f.instanceMethod();
        f.classMethod();

        /*
        instanceMethod() in Bar
        classMethod() in Foo
        */
    }
}