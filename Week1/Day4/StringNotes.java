package Week1.Day4;

public class StringNotes {
    public static void main(String[] args) {

        /*
         * -------------------------------------------------------
         *  WHAT IS A STRING IN JAVA?
         * -------------------------------------------------------
         * - String is a class in java.lang package.
         * - String represents a sequence of characters.
         * - Strings in Java are IMMUTABLE (cannot be changed once created).
         */

        String name = "Jack";  // stored in String Constant Pool (SCP)

        /*
         * -------------------------------------------------------
         *  IMMUTABILITY OF STRINGS
         * -------------------------------------------------------
         * When you modify a string, Java does NOT change the original.
         * Instead, it creates a NEW string.
         */

        String greeting = "Hello";
        greeting = greeting + " World";  // original "Hello" is not modified

        System.out.println(greeting); // Hello World


        /*
         * -------------------------------------------------------
         *  WAYS TO CREATE STRINGS
         * -------------------------------------------------------
         * 1. Using String Literal  (stored in SCP)
         *      String s1 = "Java";
         *
         * 2. Using 'new' keyword   (stored in Heap)
         *      String s2 = new String("Java");
         *
         * Difference:
         * - Literal: JVM reuses existing string if already present.
         * - new: Always creates a new string object.
         */

        String s1 = "Java";
        String s2 = "Java";              // reused, no new object
        String s3 = new String("Java");  // new object created in heap

        /*
         * -------------------------------------------------------
         *  STRING METHODS (IMPORTANT)
         * -------------------------------------------------------
         */

        String str = "Programming";

        System.out.println(str.length());        // length of string
        System.out.println(str.toUpperCase());   // convert to UPPERCASE
        System.out.println(str.toLowerCase());   // convert to lowercase
        System.out.println(str.charAt(3));       // get character at index 3
        System.out.println(str.substring(3));    // substring from index 3
        System.out.println(str.substring(3, 7)); // substring( start , end )

        /*
         * -------------------------------------------------------
         *  STRING COMPARISON
         * -------------------------------------------------------
         * == compares references (memory addresses)
         * equals() compares actual string values
         */

        String a = "Hello";
        String b = "Hello";
        String c = new String("Hello");

        System.out.println(a == b);        // true (same object in SCP)
        System.out.println(a == c);        // false (different objects)

        System.out.println(a.equals(b));   // true (same value)
        System.out.println(a.equals(c));   // true (same value)


        /*
         * -------------------------------------------------------
         *  CONCATENATION
         * -------------------------------------------------------
         */

        String first = "Java";
        String second = "Language";

        String result = first + " " + second;  // concatenation
        System.out.println(result);

        /*
         * + operator uses StringBuilder internally because String is immutable
         */

        /*
         * -------------------------------------------------------
         *  STRINGBUILDER & STRINGBUFFER
         * -------------------------------------------------------
         * - Mutable versions of String (can change without creating new objects)
         * - StringBuilder → Faster, NOT thread-safe
         * - StringBuffer  → Slower, thread-safe
         */

    }
}
