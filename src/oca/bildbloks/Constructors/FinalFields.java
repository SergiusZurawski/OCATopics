package oca.bildbloks.Constructors;


/**
    final instance variables must be assigned a value exactly once
    in line of the declaration
    in an instance initializer
    in the constructor.

    The constructor is part of the initialization process, so it is allowed to assign final
    instance variables in it. By the time the constructor completes, all final instance variables
    must have been set.
 */
public class FinalFields {
    private final int volume;
    private final String name = "The Mouse House";
    public FinalFields(int length, int width, int height) {
        volume = length * width * height;
    }
}
