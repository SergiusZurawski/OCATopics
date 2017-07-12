package oca.bildbloks.Inheritence;

/**
    1. The first statement of every constructor is a call to another constructor within the class
        using this() , or a call to a constructor in the direct parent class using super() .
    2. The super() call may not be used after the first statement of the constructor.
    3. If no super() call is declared in a constructor, Java will insert a no-argument super()
        as the first statement of the constructor.
    4. If the parent doesn’t have a no-argument constructor and the child doesn’t define any
        constructors, the compiler will throw an error and try to insert a default no-argument
        constructor into the child class.
    5. If the parent doesn’t have a no-argument constructor, the compiler requires an explicit
        call to a parent constructor in each child constructor.

 */

public class Animal {
    private int age;
    private String name;

    public Animal(int age) {
        super();
        this.age = age;
        System.out.println();
    }
    public Animal(int age, String name) {
        super();
        this.age = age;
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }


}
