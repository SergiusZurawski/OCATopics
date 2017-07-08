package oca.bildbloks.Immutable;

/**  remove setters , set values via constructor */
public class ImmutableExamples {
    private int numberEggs;
    public ImmutableExamples(int numberEggs) {
        this.numberEggs = numberEggs;
    }
    public int getNumberEggs() {
        return numberEggs;
    }
}
/**  return types can brake immutability */
class NotImmutable {
    private StringBuilder builder;
    public NotImmutable(StringBuilder b) {
        builder = b;
    }
    public StringBuilder getBuilder() {
        return builder;
    }
}

/* Solution is A Defencive copy*/
class Immutable {
    private StringBuilder builder;
    public Immutable(StringBuilder b) {
        builder = b;
    }
    /* Defencive copy*/
    public StringBuilder getBuilder() {
        return new StringBuilder(builder);
    }
    /* Or return immutable object*/
    public String getValue() {
        return builder.toString();
    }
}

