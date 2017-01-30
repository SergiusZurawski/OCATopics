package oca.bildbloks.FlowControl;

/** causes fl ow to fi nish the execution of the current loop

        Allows optional labels    Allows break   Allows continue
 if        Yes *                      No               No
 while     Yes                        Yes              Yes
 do while  Yes                        Yes              Yes
 for       Yes                        Yes              Yes
 switch    Yes                        Yes              No
 * Labels are allowed for any block statement, including those that are preceded with an if-then statement.




 */
public class Contitnue {
    public void exampleOfContinue(){
        boolean booleanExpression = true; //usaully it is expression
        optionalLabel: while(booleanExpression) {
            // Body
            // Somewhere in loop
            continue optionalLabel;
        }

    }
    public void exampleOfContinueInnerLoops(){
        FIRST_CHAR_LOOP: for (int a = 1; a <= 4; a++) {
            for (char x = 'a'; x <= 'c'; x++) {
                if (a == 2 || x == 'b')
                    //{}
                    //continue FIRST_CHAR_LOOP;
                    continue;
                System.out.print(" " + a + x);
            }
        }
    }

}
