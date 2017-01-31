package oca.coreapi.Arrays;

import java.util.Arrays;

/**
  array is an OBJECT. int [], byte[] etc are objects.
    BUT Object[] != Object
 */
public class ArraysExample {
    //primitives
    int[] myIntArray0;   //null
    int[] myIntArray1   = new int[3];
    int[] myIntArray2   = {1,2,3};
    int[] myIntArray3   = new int[]{1,2,3};
    int [] myIntArray4  = new int[3];
    int myIntArray5[]   = new int[3];
    int myIntArray6 []  = new int[3];
    //int[] myIntArray3   = new int[3]{1,2,3}; not compile

    //reference types
    String[] myStringArray1   = new String[3];
    String[] myStringArray2   = {"a","b","c"};
    String[] myStringArray3   = new String[]{"a","b","c"};
    String [] myStringArray4  = new String[3];
    String myStringArray5[]   = new String[3];
    String myStringArray6 []  = new String[3];

    //declaration in one line
    int[] ids, types; //two arryas
    int ids1[], types1; //ids1 - array, types1 - not array, int;

    public void printEmptyArrays(){
        System.out.println(Arrays.toString(myIntArray1));
        System.out.println(Arrays.toString(myStringArray1));
    }

    public void arryaEquals(){
        String [] bugs = { "cricket", "beetle", "ladybug" };
        String [] alias = bugs;
        String [] creatures = { "cricket", "beetle", "ladybug" };
        System.out.println(bugs.equals(alias));     // true
        System.out.println(bugs == alias);          // true
        System.out.println(bugs == creatures);      // false
        System.out.println(bugs.equals(creatures)); // false
        System.out.println(Arrays.equals(bugs, creatures));  //true
        System.out.println(bugs.toString());        // [Ljava.lang.String;@160bc7c0
    }

    public void casstingArrays(){
        String[] strings = { "stringValue" };
        Object[] objects = strings;
        String[] againStrings = (String[]) objects;
        //againStrings[0] = new StringBuilder(); // DOES NOT COMPILE
        objects[0] = new StringBuilder(); // careful! runtime - ArrayStoreException
    }

    public void usingArray(){
        String[] mammals = {"monkey", "chimp", "donkey"};
        System.out.println(mammals.length); // 3
        System.out.println(mammals[0]);     // monkey
        System.out.println(mammals[1]);     // chimp
        System.out.println(mammals[2]);     // donkey

        //accessing wrong index
        int[] numbers = new int[10];
        numbers[10] = 3;
        numbers[numbers.length] = 5;
        for (int i = 0; i <= numbers.length; i++) numbers[i] = i + 5;
    }
}
