package Week1.Day4;

public class StringBufferNotes {
    public static void main(String[] args) {
        /*
         * -------------------------------------------------------
         *  WHAT IS STRINGBUFFER?
         * -------------------------------------------------------
         * - StringBuffer is a mutable (changeable) sequence of characters.
         * - Unlike String, when you modify a StringBuffer,
         *   it does NOT create a new object.
         *
         * Example:
         * StringBuffer sb = new StringBuffer("Hello");
         */

        StringBuffer sb = new StringBuffer("Hello");

        /*
         * -------------------------------------------------------
         *  WHY USE STRINGBUFFER?
         * -------------------------------------------------------
         * - For heavy string modifications (append, insert, delete, reverse)
         * - To avoid creation of multiple new objects (like String does)
         * - Thread-safe (synchronized methods)
         * - Useful when multiple threads modify the same string
         */

        /*
         * -------------------------------------------------------
         *  IMPORTANT METHODS OF STRINGBUFFER
         * -------------------------------------------------------
         */

        // append() → adds text at the end
        sb.append(" World");
        System.out.println(sb);  // Hello World

        // insert() → inserts text at a given position
        sb.insert(5, " Java");
        System.out.println(sb);  // Hello Java World

        // replace(start, end, text)
        sb.replace(6, 10, "Programming");
        System.out.println(sb);

        // delete(start, end)
        sb.delete(6, 17);
        System.out.println(sb);

        // reverse() → reverse the string
        sb.reverse();
        System.out.println(sb);

        /*
         * -------------------------------------------------------
         *  CAPACITY & LENGTH
         * -------------------------------------------------------
         * - length() → number of characters in buffer
         * - capacity() → total space before resizing (default 16 + initial string size)
         */

        StringBuffer sb2 = new StringBuffer();
        System.out.println("Length: " + sb2.length());
        System.out.println("Capacity: " + sb2.capacity()); // default = 16

        /*
         * -------------------------------------------------------
         *  THREAD SAFETY
         * -------------------------------------------------------
         * - All StringBuffer methods are synchronized.
         * - Only ONE thread can access a StringBuffer method at a time.
         * - This makes it safe in multithreaded environments but slower.
         */

        /*
         * -------------------------------------------------------
         *  STRINGBUFFER vs STRINGBUILDER
         * -------------------------------------------------------
         * 1. StringBuffer → synchronized (thread-safe), slower
         * 2. StringBuilder → not synchronized, faster
         * 3. Both are mutable
         * 4. Used for heavy string manipulation
         */

        /*
         * -------------------------------------------------------
         *  CONVERTING STRINGBUFFER TO STRING
         * -------------------------------------------------------
         * - Use toString()
         */

        String finalString = sb.toString();
        System.out.println("Converted to String: " + finalString);
    }
}
