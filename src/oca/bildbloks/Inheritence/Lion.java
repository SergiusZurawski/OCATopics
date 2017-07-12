package oca.bildbloks.Inheritence;



public class Lion extends Animal {

    public Lion(int age) {
        super(age);
        //super(); // DOES NOT COMPILE Only as a FIRST STATMENT
    }

    private void roar() {
        System.out.println("The "+getAge()+" year old lion says: Roar!");
    }
}