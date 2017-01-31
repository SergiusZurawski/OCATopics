package oca.coreapi.Arrays;
import java.util.*; // import whole package including Arrays
import java.util.Arrays; // import just Arrays
/**
 */
public class Sorting {
    public void sortingInts(){
        int[] numbers = { 6, 9, 1 };
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++)
             System.out.print (numbers[i] + " ");
    }

    public void sortingString(){
        String[] strings = { "10", "9", "100" };
        Arrays.sort(strings);
        for (String string : strings)
            System.out.print(string + " ");  // 10 100 9. String sorts in alphabetic order. Numbers sort before letters and uppercase sorts before lowercase
    }
}
