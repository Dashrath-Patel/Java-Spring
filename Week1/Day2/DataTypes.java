package Week1.Day2;

public class DataTypes {
    public static void main(String args[]){
        int num = 456; //Range -2^31 to 2^31-1 
        byte by = 127;  //Range -128 to 127
        short sh = 327; //Range -2^15 to 2^15-1
        long lg = 4567891230L;     //Range -2^63 to 2^63-1
        float fl = 12.56f; //Range 1.4E-45 to 3.4E+38
        double db = 45.6789; //Range 4.9E-324 to 1.7E+308
        char ch = 'D'; //Range 0 to 65535 ,,Follow UNICODE standard UTF-16
        boolean bl = true; //Values true or false


        System.out.println("Integer value: " + num);
        System.out.println("Byte value: " + by);
        System.out.println("Short value: " + sh);
        System.out.println("Long value: " + lg);
        System.out.println("Float value: " + fl);
        System.out.println("Double value: " + db);
        System.out.println("Char value: " + ch);
        System.out.println("Boolean value: " + bl);

    }
   
    
}
