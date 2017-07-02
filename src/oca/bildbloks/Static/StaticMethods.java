package oca.bildbloks.Static;

/**
    Main example:

     public class Koala {
        public static int count = 0;
        public static void main(String[] args) {
            System.out.println(count);
        }
     }

     public class KoalaTester {
        public static void main(String[] args) {
            Koala.main(new String[0]);
            // call static method
        }
     }

    Static methods have two main purposes:
        - For utility or helper methods that don’t require any object state.
        - For state that is shared by all instances of a class, like a counter. All instances must share the same state.
        - Methods that merely use that state should be static as well.
 */
class Koala {
    public static int count = 0;
    public static void main(String[] args) {
        System.out.println(count);
    }

}

class KoalaTester {
    public static void main(String[] args) {
        Koala.main(new String[0]);
        // call static method
    }
}
public class StaticMethods {
    public static void staticCalls() {
        System.out.println(Koala.count);
        Koala.main(new String[0]);

        /**Caling static methods on instance*/
        Koala k = new Koala();
        System.out.println(k.count); // k is a Koala
        k = null;
        System.out.println(k.count); // k is still a Koala

        /** Interacting with static variable*/
        Koala.count = 4;
        Koala koala1 = new Koala();
        Koala koala2 = new Koala();
        koala1.count = 6;
        koala2.count = 5;
        System.out.println(Koala.count);
    }
}
/** Static vs. Instance
 Type           | Calling                            | Legal?   | How? |
 Static method  | Another static method or variable  | Yes      | Using the classname
 Static method  | An instance method or variable     | No       |
 Instance method| A static method or variable        | Yes      | Using the classname or a reference variable
 Instance method| Another instance method or variable| Yes      | Using a reference variable
 */

class Static {
    private String name = "Static class";
    public static void first() {}
    public static void second() {}

    public void third() {
        System.out.println(name);
    }

    public static void main(String args[]) {
        first();
        second();
        //third(); // DOES NOT COMPILE
    }
}
class Gorilla {
        public static int count;
        public static void addGorilla() { count++; }
        public void babyGorilla() { count++; }

        public void announceBabies() {
            addGorilla();
            babyGorilla();
        }

        public static void announceBabiesToEveryone() {
            addGorilla();
            //babyGorilla(); // DOES NOT COMPILE
        }
        public int total;
        //public static average = total / count; // DOES NOT COMPILE
}



