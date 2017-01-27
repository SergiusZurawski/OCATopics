package oca.bildbloks.FlowControl;

/**Ternary Operator  booleanExpression ? expression1 : expression2 */

public class Ternary {
    public void ternaryOperator(){
        int y = 10;
        final int x;
        if(y > 5) {
            x = 2 * y;
        } else {
            x = 3 * y;
        }
        // can be folded to
        int a = 10;
        int b = (a > 5) ? (2 * a) : (3 * a);

        // There is no requirement that second and third expressions in ternary operations have the same data type
        System.out.println((y > 5) ? 21 : "Zebra");
        //int animal = (y < 91) ? 9 : "Horse"; // DOES NOT COMPILE

        // only one of the right-hand expressions of the ternary operator will be evaluated at runtime
        int c = 1;
        int d = 1;
        final int e = c<10 ? c++ : d++;
        System.out.println(c+","+d); // Outputs 2,1

        c = 1;
        d = 1;
        final int f = y>=10 ? c++ : d++;
        System.out.println(c+","+d); // Outputs 1,2

    }
}
