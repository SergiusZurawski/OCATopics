package oca.bildbloks.FlowControl;
import java.util.List;
/**
    Since Java 5.0 for and for-each
    for(initialization; booleanExpression; updateStatement)
    for(datatype instance : collection)
        The right-hand must be a built-in Java array or an object whose class implements java.lang.Iterable,
        which includes most of the Java Collections framework
        left-hand side has a matching type

    for-each is syntatic sugar. It is turned into for statment during compilation .
 */
public class ForStatment {
    public void infiniteLoop(){
        for( ; ; ) {
            System.out.println("Hello World");
        }
    }

    public void multipleTerms(){
        int x = 0;
        for(long y = 0, z = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        System.out.print(x);
    }

    public void redeclaringAVariableInTheInitializationBlock(){
        int x = 0;
        //for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) { // DOES NOT COMPILE
        //    System.out.print(x + " ");
        //}
    }

    public void reAssigningAVariableInTheInitializationBlock(){
        int x = 0;
        long y = 10;
        for(y = 0, x = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(x + " ");
        }
    }

    public void incompatibleDataTypes(){
        /*for(long y = 0, int x = 4; x < 5 && y<10; x++, y++) { // DOES NOT COMPILE
            System.out.print(x + " ");
        }*/
    }

    public void loopVariableOutSideTheLoop(){

        for(long y = 0, x = 4; x < 5 && y < 10; x++, y++) {
            System.out.print(y + " ");
        }
        //System.out.print(x); // DOES NOT COMPILE
    }

    public void forEachExample(){
        final String[] names = new String[3];
        names[0] = "Lisa";
        names[1] = "Kevin";
        names[2] = "Roger";
        for(String name : names) {
            System.out.print(name + ", ");
        }
    }

    public void forEachExample2() {
        java.util.List<String> values = new java.util.ArrayList<String>();
        values.add("Lisa");
        values.add("Kevin");
        values.add("Roger");
        for(String value : values) {
            System.out.print(value + ", ");
        }
    }

    public void arrayBasedTransformation(String[] names){
        for(String name : names) {
            System.out.print(name + ", ");
        }
        for(int i=0; i < names.length; i++) {
            String name = names[i];
            System.out.print(name + ", ");
        }
    }

    public void iterableBasedTransformation(List<Integer> values){
        for(int value : values) {
            System.out.print(value + ", ");
        }
        for(java.util.Iterator<Integer> i = values.iterator(); i.hasNext(); ) {
            int value = i.next();
            System.out.print(value + ", ");
        }
    }
}
