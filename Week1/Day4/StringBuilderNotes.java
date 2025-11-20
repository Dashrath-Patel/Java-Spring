package Week1.Day4;

public class StringBuilderNotes {
    public static void main(String[] args) {
        /*
         * -------------------------------------------------------
         *  WHAT IS STRINGBUILDER?
         * -------------------------------------------------------
         * - StringBuilder is a mutable (changeable) sequence of characters.
         * - It works like StringBuffer but is FASTER.
         * - NOT synchronized → NOT thread-safe.
         * - Best for single-threaded applications where speed matters.
         */

        StringBuilder sb = new StringBuilder("Hello");

        /*
         * -------------------------------------------------------
         *  WHY USE STRINGBUILDER?
         * -------------------------------------------------------
         * - Faster than StringBuffer and String.
         * - Designed for heavy string modifications (append, delete).
         * - Does NOT create new objects on change (unlike String).
         * - Ideal for loops, builders, dynamic strings.
         */

        /*
         * -------------------------------------------------------
         *  IMPORTANT METHODS OF STRINGBUILDER
         * -------------------------------------------------------
         */

        // append() → add text at the end
        sb.append(" World");
        System.out.println(sb);  // Hello World

        // insert() → insert text at a specific index
        sb.insert(5, " Java");
        System.out.println(sb);  // Hello Java World

        // replace(start, end, text)
        sb.replace(6, 10, "Programming");
        System.out.println(sb);

        // delete(start, end)
        sb.delete(6, 17);
        System.out.println(sb);

        // reverse() → reverse the characters
        sb.reverse();
        System.out.println(sb);

        /*
         * -------------------------------------------------------
         *  CAPACITY & LENGTH
         * -------------------------------------------------------
         * - length()  → number of characters
         * - capacity() → total internal storage space
         * - Default capacity = 16 before dynamic resizing
         */

        StringBuilder sb2 = new StringBuilder();
        System.out.println("Length: " + sb2.length());
        System.out.println("Capacity: " + sb2.capacity());  // default = 16

        /*
         * -------------------------------------------------------
         *  STRINGBUILDER vs STRINGBUFFER
         * -------------------------------------------------------
         * StringBuilder:
         * - NOT synchronized → NOT thread-safe
         * - Fast
         * - Best for normal programs
         *
         * StringBuffer:
         * - Synchronized → thread-safe
         * - Slightly slower
         * - Used in multi-threading environments
         */

        /*
         * -------------------------------------------------------
         *  CONVERTING STRINGBUILDER TO STRING
         * -------------------------------------------------------
         * - Use toString()
         */

        String result = sb.toString();
        System.out.println("Converted to String: " + result);
    }

}
