package oca.bildbloks;
/** System.gc() is not guaranteed to run, */

import java.util.ArrayList;
import java.util.List;

/**An object will remain on the heap until it is no longer reachable. An object is no longer
 reachable when one of two situations occurs:
 ■ The object no longer has any references pointing to it.
 ■ All references to the object have gone out of scope.
 */
public class GarbageCollection {

    /**
     reference != object that it refers to;
     they are two different entities.
     The reference is a variable that has a name and can be used to access the contents of an object.
     A reference can be assigned to another reference, passed to a method, or returned from a method

     An object in heap and does not have a name
     access only through a reference
     Objects come in all different shapes and
     sizes and consume varying amounts of memory

     An object cannot be assigned to another
     object, nor can an object be passed to a method or returned from a method.
     object gets garbage collected, not its reference.
     */

    public static void refferences() {
        String one, two;
        one = new String("a");
        two = new String("b");
        one = two;
        String three = one;
        one = null;
        System.out.println("");
    }

    /** finalize() finalize() call could run 0 or 1 time
     method gets called if the garbage collector tries to collect the object
     If the garbage collector doesn’t run, the method doesn’t get called
     If the garbage collector fails to collect the object and tries to run it again later, the method doesn’t get called a second time.
     */
    protected void finalize() {
        System.out.println("Calling finalize");
    }
    /**  Code For MAIN()
     GarbageCollection.refferences();
     GarbageCollection gc = new GarbageCollection();
     gc = null;
     System.gc();
     try {
     Thread.sleep(5000);
     } catch (InterruptedException e) {
     e.printStackTrace();
     }
     System.out.println("after");
     */

    private static List objects = new ArrayList();
    protected void finalize1() {
        //Object no longer available for gc.
        objects.add(this); // Don't do this
    }
}
