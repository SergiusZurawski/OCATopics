package oca.bildbloks;

public class Main {

    public static void main(String[] args) {
//        PrimitiveTypes pt = new PrimitiveTypes();
//        pt.printMinMaxValue();
//        pt.printDefault();
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
    }
}
