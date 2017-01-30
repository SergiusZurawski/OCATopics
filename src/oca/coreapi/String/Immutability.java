package oca.coreapi.String;

/**
 Once a String object is created, it is not allowed to change. It cannot be made larger or
 smaller, and you cannot change one of the characters inside it.
 */
public class Immutability {


}
/**Example of Immutability
    Also, immutable classes in Java are fi nal, and subclasses can’t add mutable behavior.
 */
class Mutable {
    private String s;
    public void setS(String newS){ s = newS; } // Setter makes it mutable
    public String getS() { return s; }
}
final class Immutable {
    private String s = "name";
    public String getS() { return s; }
}
