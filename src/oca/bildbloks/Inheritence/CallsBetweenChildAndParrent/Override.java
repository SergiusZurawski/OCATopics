package oca.bildbloks.Inheritence.CallsBetweenChildAndParrent;

public class Override {
}


class Canine {
    public double getAverageWeight() {
        return 50;
    }
}
class Wolf extends Canine {
    public double getAverageWeight() {
        return super.getAverageWeight()+20;
        //return getAverageWeight()+20; // INFINITE LOOP
    }
    public static void callExample() {
        System.out.println(new Canine().getAverageWeight());
        System.out.println(new Wolf().getAverageWeight());
    }
}