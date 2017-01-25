package oca.bildbloks;

import static java.lang.System.out;

public class VariableInitialization {

    public void initializeLocalVarInBranches(boolean check){
        int initLocal;

        if(check)
            initLocal = 1;
        //out.println(initLocal); // Compiler Err; Compiller tracks that check could be false

        if(true)
            initLocal = 1;
        out.println(initLocal);  // No error; If always executed.

        int initLocal2;
        if(check)
            initLocal2 = 1;
        else
            initLocal2 = 2;

        out.println(initLocal2);  // No error; All branches covered.
    }
}
