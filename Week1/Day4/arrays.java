package Week1.Day4;

import java.lang.reflect.Array;

public class arrays {
    public static void main (String args[]){

        // There are three ways to declare an arrays
        // 1) To declare the array without size

        int[] num ;

        // 2) To declare with the size

        int [] numbers = new int[5];

        //  3) To declare the array and initialize with the values

        int [] arr = {1,2,3,4,5};

        // We can create arrays of all 8 primitive data types
         // like int,char , short , byte , double , long , char , String , float
        long[] arr1 = {111,2222,33333, 44444};
        String[] str = {"Hello","World"};
        double[] db = new double[5];
        char[] ch = new char[5];
        float[] f = new float[5];
        short[] s = new short[5];
        byte[] b = new byte[5];

        /*Different types of arrays
        1) One Dimensional Array
        2) Two Dimensional Array - 2d , 3d arrays
         */
        int[] num1 = {1,2,3,4,5};  // One Dimensional array
        int[][] matrix ={{1,2,3,4,5},{6,7,8,9}}; //2D array
        int[][][] matrix1 = new int[3][4][5];
    }
}
