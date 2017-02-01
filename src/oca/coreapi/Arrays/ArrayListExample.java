package oca.coreapi.Arrays;

import java.util.*; // import whole package including ArrayList
import java.util.ArrayList; // import just ArrayList

/** ArrayList is an ordered sequence that allows duplicates.
    <E> - convention in generics to mean “any class that this array can hold.”
    ArrayList(without <>) - means AraayList<Object>
 */
public class ArrayListExample {
    //Before Java 5
    ArrayList list1 = new ArrayList();
    ArrayList list2 = new ArrayList(10);
    ArrayList list3 = new ArrayList(list2);
    //Java 5 Generics. <> - dimonds.
    ArrayList<String> list4 = new ArrayList<String>();
    // Java 7
    ArrayList<String> list5 = new ArrayList<>();

    public void initArrayList(){
        ArrayList<String> places0 = new ArrayList<String>();
        places0.add("Buenos Aires");
        places0.add("Córdoba");
        places0.add("La Plata");

        ArrayList<String> places1 = new ArrayList<String>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));

        /**Double brace initialization; creates anonius class, not efficient loading time, affects gc*/
        ArrayList<String> list = new ArrayList<String>() {{
            add("A");
            add("B");
            add("C");
        }};

        /**IMMUTABLE*/
        /**utilities and List Not ArrayList*/
        List<String> places2 = Arrays.asList("Buenos Aires", "Córdoba", "La Plata");
        /**collection and List Not ArrayList*/
        List<String> places3 = Collections.singletonList("Buenos Aires");
        /**IMMUTABLE to MUTABLE conversion*/
        ArrayList<String> places = new ArrayList<>(Arrays.asList("Buenos Aires", "Córdoba", "La Plata"));
    }

    /**Methods*/
    /**
     boolean add(E element)     //return boolean is always true for ArrayList. It needs to be there due to collection Interface
     void add(int index, E element)
     */
    public void addExample(){
        ArrayList list = new ArrayList();
        list.add("hawk");         // [hawk]
        list.add(Boolean.TRUE);   // [hawk, true]
        System.out.println(list); // [hawk, true]

        //safe version
        ArrayList<String> safer = new ArrayList<>();
        safer.add("sparrow");
        //safer.add(Boolean.TRUE); // DOES NOT COMPILE

        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add(1, "robin"); // [hawk, robin]
        birds.add(0, "blue jay"); // [blue jay, hawk, robin]
        birds.add(1, "cardinal"); // [blue jay, cardinal, hawk, robin]
        System.out.println(birds); // [blue jay, cardinal, hawk, robin]
    }

    /**
     boolean remove(Object object)
     E remove(int index)
     */
    public void removeExample(){
        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        birds.add("hawk"); // [hawk, hawk]
        System.out.println(birds.remove("cardinal")); // prints false
        System.out.println(birds.remove("hawk")); // prints true
        System.out.println(birds.remove(0)); // prints hawk
        System.out.println(birds);
    }

    /** E set(int index, E newElement)
        -  replace*/

    public void setExample(){
        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        System.out.println(birds.size()); // 1
        birds.set(0, "robin"); // [robin]
        System.out.println(birds.size()); // 1
        birds.set(1, "robin"); // IndexOutOfBoundsException
    }

    /**
     boolean isEmpty()
     int size()
    */

    public void sizeExample(){
        List<String> birds = new ArrayList<>();
        System.out.println(birds.isEmpty()); // true
        System.out.println(birds.size());    // 0
        birds.add("hawk");                   // [hawk]
        birds.add("hawk");                   // [hawk, hawk]
        System.out.println(birds.isEmpty()); // false
        System.out.println(birds.size());    // 2
    }

    /**  void clear()  */

    public void clearExample() {
        List<String> birds = new ArrayList<>();
        birds.add("hawk");                   // [hawk]
        birds.add("hawk");                   // [hawk, hawk]
        System.out.println(birds.isEmpty()); // false
        System.out.println(birds.size());    // 2
        birds.clear();                       // []
        System.out.println(birds.isEmpty()); // true
        System.out.println(birds.size());    // 0
    }

    /**  boolean contains(Object object)
        This method calls equals() on each element of the ArrayList to see whether there are
        any matches. Since String implements equals(), this works out well.
     */
    public void containsExample() {
        List<String> birds = new ArrayList<>();
        birds.add("hawk"); // [hawk]
        System.out.println(birds.contains("hawk"));  // true
        System.out.println(birds.contains("robin")); // false
    }

    /**  boolean equals(Object object)  */

    public void equalsExample() {
        List<String> one = new ArrayList<>();
        List<String> two = new ArrayList<>();
        System.out.println(one.equals(two)); // true
        one.add("a");                        // [a]
        System.out.println(one.equals(two)); // false
        two.add("a");                        // [a]
        System.out.println(one.equals(two)); // true
        one.add("b");                        // [a,b]
        two.add(0, "b");                     // [b,a]
        System.out.println(one.equals(two)); // false
    }

    /** Convertion between list and array*/
    public void convertionFromALtoArray(){
        List<String> list = new ArrayList<>();
        list.add("hawk");
        list.add("robin");
        Object[] objectArray = list.toArray();
        System.out.println(objectArray.length); // 2
        String[] stringArray = list.toArray(new String[0]);
        System.out.println(stringArray.length); // 2
    }

    public void convertionFromArrayToList(){
        String[] array = { "hawk", "robin" };     // [hawk, robin]
        List<String> list = Arrays.asList(array); // returns fixed size list
        System.out.println(list.size());          // 2
        list.set(1, "test");                      // [hawk, test]
        array[0] = "new";                         // [new, test]
        for (String b : array) System.out.print(b + " "); // new test
        list.remove(1);                     // throws UnsupportedOperation Exception
    }

    /**Sorting*/

    public void arrayListSortingExample(){
        List<Integer> numbers = new ArrayList<>();
        numbers.add(99);
        numbers.add(5);
        numbers.add(81);
        Collections.sort(numbers);
        System.out.println(numbers); //[5, 81, 99]
    }
}
