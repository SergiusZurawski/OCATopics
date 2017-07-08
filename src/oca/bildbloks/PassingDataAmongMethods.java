package oca.bildbloks;


/** Java is a “pass-by-value” language. This means that a copy of the variable is made and the
    method receives that copy. Assignments made in the method do not affect the caller
 */
public class PassingDataAmongMethods {
    public static void passbyValues() {
        int num = 4;
        newNumber(5);
        System.out.println(num); // 4
    }
    public static void newNumber(int num) {
        num = 8;
    }

    public static void passbyValuesRefferenceTypes() {
        String name = "Webby";
        speak(name);
        System.out.println(name);  // Webby
    }
    public static void speak(String name) {
        name = "Sparky";
    }

    /**
     s is a copy of the variable name . Both point to the same StringBuilder,
     which means that changes made to the StringBuilder are available to both references.
     */
    public static void passbyValuesRefferenceTypesAndCallAMethod() {
        StringBuilder name = new StringBuilder();
        speak(name);
        System.out.println(name); // Webby
    }

    public static void speak(StringBuilder s) {
        s.append("Webby");
    }

    public static void exchangeOfPrimitives() {
        int original1 = 1;
        int original2 = 2;
        swap(original1, original2);
        System.out.println(original1); // 1
        System.out.println(original2); // 2
    }
    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

}
