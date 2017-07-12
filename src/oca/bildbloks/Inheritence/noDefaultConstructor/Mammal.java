package oca.bildbloks.Inheritence.noDefaultConstructor;



public class Mammal {
    private int age;
    private String name;

    public Mammal(int age) {
        super();
        this.age = age;

    }
    public Mammal(int age, String name) {
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
