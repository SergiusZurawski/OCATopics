package oca.bildbloks;

/**
    access modifier
    return type
    exception list are irrelevant to overloading.
 */
public class Oveloading {
    public void fly(int numMiles) { }
    public void fly(short numFeet) { }
    public boolean fly() { return false; }
    void fly(int numMiles, short numFeet) { }
    public void fly(short numFeet, int numMiles) throws Exception { }

    /** not valid overloading:  return type*/
    public void fly1(int numMiles) { }
    //public int fly1(int numMiles) { }// DOES NOT COMPILE

    /** not valid overloading: static*/
    public void fly2(int numMiles) { }
    //public static void fly2(int numMiles) { }// DOES NOT COMPILE

    /**Overloading and Varargs*/
    public void fly3(int[] lengths) { }
    //public void fly3(int... lengths) { } // DOES NOT COMPILE


}
