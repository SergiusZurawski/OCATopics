package oca.bildbloks.FlowControl;

/**It is a single word that is proceeded by a colon (:)
 For readability, they are commonly expressed in uppercase, with underscores between words, to distinguish them from
 regular variables.
 */
public class OptionalLables {

    public void optionalLablesExample(){
        int[][] myComplexArray = {{5,2,1,3},{3,9,8,9},{5,7,12,7}};
        OUTER_LOOP: for(int[] mySimpleArray : myComplexArray) {
            INNER_LOOP: for(int i=0; i<mySimpleArray.length; i++) {
                System.out.print(mySimpleArray[i]+"\t");
            }
            System.out.println();
        }
    }

    public void brakingExample(){
        int x = 10;
        optionalLabel: while(x > 0) {
            // Body
            // Somewhere in loop
            break optionalLabel;
        }
    }

    public void searchSample(){
            int[][] list = {{1,13,5},{1,2,5},{2,7,2}};
            int searchValue = 2;
            int positionX = -1;
            int positionY = -1;
            PARENT_LOOP: for(int i=0; i<list.length; i++) {
                for(int j=0; j<list[i].length; j++) {
                    if(list[i][j]==searchValue) {
                        positionX = i;
                        positionY = j;
                        break PARENT_LOOP;
                    }
                }
            }
            if(positionX==-1 || positionY==-1) {
                System.out.println("Value "+searchValue+" not found");
            } else {
                System.out.println("Value "+searchValue+" found at: " +
                        "("+positionX+","+positionY+")");
            }
    }
}
