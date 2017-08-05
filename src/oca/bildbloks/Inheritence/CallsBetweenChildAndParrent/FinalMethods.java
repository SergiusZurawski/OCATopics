package oca.bildbloks.Inheritence.CallsBetweenChildAndParrent;

public class FinalMethods {
}

class Bird {
    public final boolean hasFeathers() {
        return true;
    }
}

 class Penguin extends Bird {
    /*
    public final boolean hasFeathers() { // DOES NOT COMPILE
        return false;
    }
    */
}