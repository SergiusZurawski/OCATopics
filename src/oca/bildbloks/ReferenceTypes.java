package oca.bildbloks;

/***
 * key differences between primitives and reference Types
 * 1.
 * reference types can be assigned null,  they do not currently refer to an object
 * primitive types compiler error if assign  null
 * 2.
 * reference types - can call methods if not null
 * 3.
 * reference types  - lowercase type names.
 */
public class ReferenceTypes {
    java.util.Date today;
    String greeting;
    //int value = null; // DOES NOT COMPILE   //1
    String s = null;    //COMPILEs

    String reference = "hello";
    int len = reference.length();
    //int bad = len.length(); // DOES NOT COMPILE  //2
}
