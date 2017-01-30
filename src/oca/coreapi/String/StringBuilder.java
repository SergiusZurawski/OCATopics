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
}
