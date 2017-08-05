package oca.bildbloks.Inheritence.CallsBetweenChildAndParrent;

public class Override {
}


/**
 methods are overloaded, not overridden if the same name but different signatures

 The compiler performs the following checks when you override a nonprivate method:
    1. The method in the child class must have the same signature as the method in the parent class.
    2. The method in the child class must be at least as accessible or more accessible than the method in the parent class
    3. The method in the child class may not throw a checked exception that is new or broader than the class of any exception thrown in the parent class method.
    4. If the method returns a value, it must be the same or a subclass of the method in the parent class, known as covariant return types.


 */

class Canine {
    public double getAverageWeight() {
        return 50;
    }
}
class Wolf extends Canine {
    public double getAverageWeight() {
        return super.getAverageWeight()+20;
        //return getAverageWeight()+20; // INFINITE LOOP
    }
    public static void callExample() {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
    }
}

class InsufficientDataException extends Exception {}
class Reptile {
    protected boolean hasLegs() throws InsufficientDataException {
        throw new InsufficientDataException();
    }
    protected double getWeight() throws Exception {
        return 2;
    }

    protected double getHeight() throws InsufficientDataException {
        return 2;
    }

    protected int getLength() {
        return 10;
    }
}

class Snake extends Reptile {
    /** Doesn't violate rulse*/
    protected boolean hasLegs() {    //Hide exception is OK
        return false;
    }
    protected double getWeight() throws InsufficientDataException{   //More stricter exception is ok
        return 2;
    }
    /** violate rulse*/
    /*
    protected double getHeight() throws Exception { // DOES NOT COMPILE more broad exception
        return 2;
    }
    protected int getLength() throws InsufficientDataException { // DOES NOT COMPILE  return type has changed
        return 10;
    }

    */
}

/** Rulse doesn't apply for Private methods.
 If a method is private im superclass it doesn't matter what we will do in a child class
 */
class Camel {
    private String getNumberOfHumps() {
        return "Undefined";
    }
}
class BactrianCamel extends Camel {
    private int getNumberOfHumps() {  //return type changes
        return 2;
    }
}

