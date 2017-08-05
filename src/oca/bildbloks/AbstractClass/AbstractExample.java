package oca.bildbloks.AbstractClass;

public class AbstractExample {
}

abstract class Cow {}

class Chicken {
    //public abstract void peck();  // Abstract Methods are allowed only in abstract classes.
}

/** Abstract methods has to be empty*/
abstract class Turtle {
    //public abstract void swim() {}  // has body {}
    //public abstract int getAge() {
    //    return 10;
    //}
}

/** abstract class cannot be marked as final */
//public final abstract class Tortoise {}  // DOES NOT COMPILE

/** abstract method may not be marked as final */
abstract class Goat {
    //public abstract final void chew();
}

/**method may not be marked as both abstract and private*/
abstract class Whale {
    //private abstract void sing();
}
