package oca.bildbloks.Interfaces;

/**
 1. Interface variables are assumed to be public , static , and final . Therefore, marking
    a variable as private or protected will trigger a compiler error, as will marking any
    variable as abstract .
 2. The value of an interface variable must be set when it is declared since it is marked as final .
 */
public class InterfaceVariables {
}
 interface CanSwim {
    int MAXIMUM_DEPTH = 100;
    final static boolean UNDERWATER = true;
    public static final String TYPE = "Submersible";
}
interface CanSwimAfteCompilation {
    public static final int MAXIMUM_DEPTH = 100;
    public static final boolean UNDERWATER = true;
    public static final String TYPE = "Submersible";
}
/*
public interface CanDig {
    private int MAXIMUM_DEPTH = 100;               // DOES NOT COMPILE  private modifier is used
    protected abstract boolean UNDERWATER = false; // DOES NOT COMPILE  protected  abstract
    public static String TYPE;                     // DOES NOT COMPILE  not initialized
}
*/