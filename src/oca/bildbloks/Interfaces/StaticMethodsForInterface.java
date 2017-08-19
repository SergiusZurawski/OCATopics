package oca.bildbloks.Interfaces;

/**
 Here are the static interface method rules you need to be familiar with:
 1. Like all methods in an interface, a static method is assumed to be public and will not
 compile if marked as private or protected .
 2. To reference the static method, a reference to the name of the interface must be used.
 */
public class StaticMethodsForInterface {
}


interface Hop {
    static int getJumpHeight() {
        return 8;
    }
}