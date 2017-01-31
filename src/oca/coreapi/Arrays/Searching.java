package oca.coreapi.Arrays;

import java.util.Arrays;

/**  Java also provides a convenient way to search—but only if the array is already sorted.
    Binary search rules
        1. Target element found in sorted array       - Index of match
        2. Target element not found in sorted array   - Negative value showing one smaller than the negative of index, where a match needs to be inserted to preserve sorted order
        3. multiple elements with the specified value - there is no guarantee which one will be found.
        4. Unsorted array                             - A surprise—this result isn’t predictable
 */
public class Searching {
    public void searchingExample(){
        int[] numbers = {2,4,6,8};
        System.out.println(Arrays.binarySearch(numbers, 2)); // 0
        System.out.println(Arrays.binarySearch(numbers, 4)); // 1
        System.out.println(Arrays.binarySearch(numbers, 1)); // -1
        System.out.println(Arrays.binarySearch(numbers, 3)); // -2
        System.out.println(Arrays.binarySearch(numbers, 9)); // -5

        int[] numbersNotSorted = {10,2,4,6,8};
        System.out.println(Arrays.binarySearch(numbersNotSorted, 2)); // ??
    }

}
