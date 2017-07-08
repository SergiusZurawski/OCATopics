package oca.bildbloks.Constructors;

/**  If you don’t include any constructors in the class, Java will create one(Default) for you without any parameters.*/

/**Remember that a default constructor is only supplied if there are no constructors present.*/
public class Default {
    // default constructor is equivalent to
    //public Default() {}
    public static void callExample() {
        Default rabbit = new Default(); // Calls default constructor
    }
}

class Default1 {  //The only one who gets default constructor
}
class Default2 {
    public Default2() { }
}
class Default3 {
    public Default3(boolean b) { }
}
class Default4 {
    private Default4() { }
}
