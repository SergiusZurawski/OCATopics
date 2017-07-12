package oca.bildbloks.Inheritence.CallsBetweenChildAndParrent;

class Fish {
    protected int size;
    private int age;
    public Fish(int age) {
        this.age = age;
    }
    public int getAge() {
        return age;
    }
}
class Shark extends Fish {
    private int numberOfFins = 8;
    public Shark(int age) {
        super(age);
        this.size = 4;
    }
    public void displaySharkDetails() {
        System.out.print(" just name "    + getAge());
        System.out.print(" this + name "  + this.getAge());
        System.out.print(" super + name " + super.getAge());
        System.out.print(" and "+size+        " meters long");
        System.out.print(" and "+this.size +  " meters long");
        System.out.print(" and "+super.size + " meters long");
    }

    /**
     super() - call to parent constructor
     super   - reference to parent object in order to access memebers.

     this() - call do different constructor of the current class
     this   - reference to object itself.

     Good
     public Rabbit(int age) {
        super();
        super.setAge(10);
     }

     Bad
     public Rabbit(int age) {
        super;              // DOES NOT COMPILE
        super().setAge(10); // DOES NOT COMPILE
     }
     */
}
