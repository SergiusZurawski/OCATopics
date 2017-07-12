package oca.bildbloks.Inheritence.CosntructorCallOrder;

/**Parent Constructor is always executed before:
 Primate
 Ape
 */
public class Primate {
    public Primate() {
        System.out.println("Primate");
    }
}
class Ape extends Primate {
    public Ape() {
        System.out.println("Ape");
    }
}
class Chimpanzee extends Ape {
    public static void callExample() {
        new Chimpanzee();
    }
}