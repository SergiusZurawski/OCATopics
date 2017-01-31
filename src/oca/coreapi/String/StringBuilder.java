package oca.coreapi.String;

/**StringBuilder is mutable*/
public class StringBuilder {
    public void hugeAmountOfStrings(){
        String alpha = "";
        for(char current = 'a'; current <= 'z'; current++) {
            alpha += current;
        }
        System.out.println(alpha);  // 27 String objects are created
    }

    public void sbExample(){
        java.lang.StringBuilder alpha = new java.lang.StringBuilder();
        for(char current = 'a'; current <= 'z'; current++)
            alpha.append(current);
        System.out.println(alpha);
    }

    public void sbChaning(){
        java.lang.StringBuilder sb = new java.lang.StringBuilder("start");
        sb.append("+middle"); // sb = "start+middle"
        java.lang.StringBuilder same = sb.append("+end"); // "start+middle+end"
    }

    public void sbChaning2(){
        java.lang.StringBuilder a = new java.lang.StringBuilder("abc");
        java.lang.StringBuilder b = a.append("de");
        b = b.append("f").append("g");
        System.out.println("a=" + a);  //"abcdefg"
        System.out.println("b=" + b);  //"abcdefg" The same object
    }
    public void creatingSB(){
        java.lang.StringBuilder sb1 = new java.lang.StringBuilder();
        java.lang.StringBuilder sb2 = new java.lang.StringBuilder("animal");
        java.lang.StringBuilder sb3 = new java.lang.StringBuilder(10);
    }

    /**Size vs. Capacity
     String - The number of characters appearing in the String is both the size and capacity.
     StringBuilder - default capacity 16
     SB capacity is increased automatically by default.
     */

    /**methods*/
    /**charAt(), indexOf(), length(), and substring()*/

    public void sbMethods(){
        java.lang.StringBuilder sb = new java.lang.StringBuilder("animals");
        String sub = sb.substring(sb.indexOf("a"), sb.indexOf("al"));
        int len = sb.length();
        char ch = sb.charAt(6);
        System.out.println(sub + " " + len + " " + ch);
    }

    /** StringBuilder append(String str) */

    public void sbAppend(){
        java.lang.StringBuilder sb = new java.lang.StringBuilder().append(1).append('c');
        sb.append("-").append(true);
        System.out.println(sb); // 1c-true
    }

    /** StringBuilder insert(int offset, String str) */

    public void sbInsert(){
        java.lang.StringBuilder sb = new java.lang.StringBuilder("animals");
        sb.insert(7, "-"); // sb = animals-
        sb.insert(0, "-"); // sb = -animals-
        sb.insert(4, "-"); // sb = -ani-mals
        System.out.println(sb);
    }

    /**
     StringBuilder delete(int start, int end)
     StringBuilder deleteCharAt(int index)
     */

    public void sbDelete(){
        java.lang.StringBuilder sb = new java.lang.StringBuilder("abcdef");
                                                                //012345
        sb.delete(1, 3); // sb = adef
        sb.deleteCharAt(5); // throws an exception

    }

    /** StringBuilder reverse() */
    public void sbReverse(){
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ABC");
        sb.reverse();
        System.out.println(sb);
    }

    /** String toString() */
    public void sbToString(){
        java.lang.StringBuilder sb = new java.lang.StringBuilder("ABC");
        String s = sb.toString();
    }

    /**
     StringBuilder vs. StringBuffer
     StringBuilder was added in Java 5.
     StringBuffer is slower because it is thread safe.
     */
}
