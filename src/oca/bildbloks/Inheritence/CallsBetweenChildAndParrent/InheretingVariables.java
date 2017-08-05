package oca.bildbloks.Inheritence.CallsBetweenChildAndParrent;


/** variables can not  be overridden but instead hidden
    regardless of whether the variable is an instance variable or a static variable.
 */
public class InheretingVariables {
}

class Rodent {
    protected int tailLength = 4;
    public void getRodentDetails() {
        System.out.println("[parentTail="+tailLength+"]");
    }
}
 class Mouse extends Rodent {
     protected int tailLength = 8;

     public void getMouseDetails() {
         System.out.println("[tail=" + tailLength + ",parentTail=" + super.tailLength + "]");
     }

     public static void callExample() {
         Mouse mouse = new Mouse();
         mouse.getRodentDetails();
         mouse.getMouseDetails();
     }
     /* Output
        [parentTail=4]
        [tail=8,parentTail=4]
     */
 }