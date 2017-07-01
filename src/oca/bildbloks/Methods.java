package oca.bildbloks;
/**
 1. access modifier
 2. method name
 3. optional specifier
 4. return type
 5. parentheses (required)
 6. exception (optional)
 7. list of parameters
 1.     3.     4.   2. 5.    7.            6.
 public final void nap(int minutes) throws InterruptedException {
 // take a nap
 //method body
 }

 Parts of a method declaration
 Element                 |  Value in nap()             | example Required?
 Access modifier         |  public                     | No
 Optional specifier      |  final                      | No
 Return type             |  void                       | Yes
 Method name             |  nap                        | Yes
 Parameter list          | (int minutes)               | Yes, but can be empty parentheses
 Optional exception list | throws InterruptedException | No
 Method body             | {// take a nap}             | Yes, but can be empty braces

 */
public class Methods {

    /* Access Modifiers
        public    The method can be called from any class.
        private   The method can only be called from within the same class.
        protected The method can only be called from classes in the same package or subclasses.
        Default (Package Private) Access The method can only be called from classes in the same package.
    */

    public void walk1() {}
    //default void walk2() {} // DOES NOT COMPILE
    //void public walk3() {}  // DOES NOT COMPILE
    void walk41() {}

    /* Optional Specifiers
    static        Used for class methods.
    abstract      no method body.
    final         method is not allowed to be overridden by a subclass.
    synchronized  multithread lock.
    native        interacting with code written in another language such as C++.
    strictfp      floating-point calcu-lations portable.
    */

    //public void walk1() {}
    public final void walk2() {}
    public static final void walk3() {}
    public final static void walk4() {}
    //public modifier void walk5() {}   // DOES NOT COMPILE
    //public void final walk6() {}      // DOES NOT COMPILE
    final public void walk7() {}

    /*Return Type*/
    public void walk21() { }
    public void walk22() { return; }
    public String walk23() { return ""; }
    //public String walk24() { }                      // DOES NOT COMPILE
    //public walk25() { }                             // DOES NOT COMPILE
    //String walk26(int a) { if (a == 4) return ""; } // DOES NOT COMPILE

    /** Return Type Overfload */
    int integer() {
        return 9;
    }
    /*
    int long() {]
        return 9L; // DOES NOT COMPILE
    }
    */

    int integerExpanded() {
        int temp = 9;
        return temp;
    }
    /*
    int longExpanded() {
        int temp = 9L; // DOES NOT COMPILE
        return temp;
    }
    */
    /**Method Name
        Method names follow the same rules as variable names
            Identifi er may only contain
                letters,
                numbers,
                $ ,
                _ .
        First character is not allowed to be a number,
        reserved words are not allowed.
     */

    public void walk51() { }
    //public void 2walk() { } // DOES NOT COMPILE
    //public walk3 void() { } // DOES NOT COMPILE
    public void Walk_$() { }
    //public void() { } // DOES NOT COMPILE

    /**Parameter List*/
    public void walk91() {}
    //public void walk2 { }               // DOES NOT COMPILE
    public void walk3(int a) {}
    //public void walk4(int a; int b) {}  // DOES NOT COMPILE
    public void walk5(int a, int b) {}  // DOES NOT COMPILE

    /** Optional Exception List */
    public void zeroExceptions() { }
    public void oneException() throws IllegalArgumentException { }
    public void twoExceptions() throws IllegalArgumentException, InterruptedException { }

    /** Method Body*/
    public void walk71() { }
    //public void walk72; // DOES NOT COMPILE
    public void walk73(int a) { int name = 5; }

    /**Working with Varargs*/
    public void walk1(int... nums) { }
    public void walk2(int start, int... nums) { }
    //public void walk3(int... nums, int start) { }    // DOES NOT COMPILE
    //public void walk4(int... start, int... nums) { } // DOES NOT COMPILE
}
