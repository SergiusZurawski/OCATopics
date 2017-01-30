package oca.coreapi.String;

/** string is a sequence of characters and Java counts from 0 indexed */
public class Methods {
    public void listOfMethods() {
        String string = "animals";
                     //  0123456
        System.out.println(string.length()); // 7

        System.out.println(string.charAt(0)); // a
        System.out.println(string.charAt(6)); // s
        System.out.println(string.charAt(7)); // throws exception  java.lang.StringIndexOutOfBoundsException: String index out of range: 7

        /**
         int indexOf(char ch)
         int indexOf(char ch, index fromIndex)
         int indexOf(String str)
         int indexOf(String str, index fromIndex)
         */

        System.out.println(string.indexOf('a')); // 0
        System.out.println(string.indexOf("al")); // 4
        System.out.println(string.indexOf('a', 4)); // 4
        System.out.println(string.indexOf("al", 5)); // -1

        /**
         int substring(int beginIndex)
         int substring(int beginIndex, int endIndex)
         */
        System.out.println(string.substring(3)); // mals
        System.out.println(string.substring(string.indexOf('m'))); // mals
        System.out.println(string.substring(3, 4)); // m
        System.out.println(string.substring(3, 7)); // mals

        System.out.println(string.substring(3, 3)); // empty string
        System.out.println(string.substring(3, 2)); // throws exception
        System.out.println(string.substring(3, 8)); // throws exception

        /**
         String toLowerCase()
         String toLowerCase(Local)
         String toUpperCase()
         String toUpperCase(Local)
         */
        System.out.println(string.toUpperCase()); // ANIMALS
        System.out.println("Abc123".toLowerCase()); // abc123

        /**
         boolean equals(String str)
         boolean equalsIgnoreCase(String str)
         */
        System.out.println("abc".equals("ABC")); // false
        System.out.println("ABC".equals("ABC")); // true
        System.out.println("abc".equalsIgnoreCase("ABC")); // true

        /**
         boolean startsWith(String prefix)
         boolean endsWith(String suffix)
         */
        System.out.println("abc".startsWith("a")); // true
        System.out.println("abc".startsWith("A")); // false
        System.out.println("abc".endsWith("c")); // true
        System.out.println("abc".endsWith("a")); // false

        /**
         boolean contains(String str)
         */
        System.out.println("abc".contains("b")); // true
        System.out.println("abc".contains("B")); // false

        /**
         String replace(char oldChar, char newChar)
         String replace(CharSequence oldChar, CharSequence newChar)
         */
        System.out.println("abcabc".replace('a', 'A')); // AbcAbc
        System.out.println("abcabc".replace("a", "A")); // AbcAbc
        /**
         public String trim()
         */
        System.out.println("abc".trim()); // abc
        System.out.println("\t a b c\n".trim()); // a b c

        /** Method Chaining*/
        String start = "AniMaL ";
        String trimmed = start.trim(); // "AniMaL"
        String lowercase = trimmed.toLowerCase(); // "animal"
        String result = lowercase.replace('a', 'A'); // "Animal"
        System.out.println(result);
        result = "AniMaL ".trim().toLowerCase().replace('a', 'A');
        System.out.println(result);
    }
}
