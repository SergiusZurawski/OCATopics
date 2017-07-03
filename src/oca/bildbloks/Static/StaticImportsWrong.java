package oca.bildbloks.Static;

//import static statics.A.TYPE;
//import static statics.B.TYPE; // DOES NOT COMPILE Same name with prevois. Reffer to it with full class name


//import static java.util.Arrays; // DOES NOT COMPILE Arrays is class, not static class
import static java.util.Arrays.asList;
//static import java.util.Arrays.*; // DOES NOT COMPILE wrong order
public class StaticImportsWrong {
    public static void main(String[] args) {
        //Arrays.asList("one"); // DOES NOT COMPILE
    }
}