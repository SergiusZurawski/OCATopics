package oca.coreapi.Wrappers2;

import java.util.ArrayList;
import java.util.List;

/**
 */
public class Autoboxing {
    public void autoboxing(){
        List<Double> weights = new ArrayList<>();
        weights.add(50.5);                 // [50.5]
        weights.add(new Double(60)); // [50.5, 60.0]
        weights.remove(50.5);           // [60.0]
        double first = weights.get(0);     // 60.0
    }

    public void unboxingNull(){
        List<Integer> heights = new ArrayList<>();
        heights.add(null);
        int h = heights.get(0); // NullPointerException
    }

    public void autoboxingIntegresRemoveIssue(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.remove(1);  //it will remove element under index 1;
                                  // 1 is considered as an index; You need to box int if you want ot remove
        System.out.println(numbers);
        numbers.remove(new Integer(2));
        System.out.println(numbers);
    }
}
