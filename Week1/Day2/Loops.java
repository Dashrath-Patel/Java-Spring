package Week1.Day2;

public class Loops {
    public static void main (String args[]) {

        /* As we know loops are used to do something based on some condition or some finite
         There are generally three loops in many of the programming languages
         1) For loop
         2) While loop
         3) Do while loop
         */

        // For loop
        for (int i = 0; i <= 5; i++) {
            System.out.println("Hi " + i);
        }
        //(Initialization ; Condition ; increment or decrement )-> statements

        // While loop
        int num = 10 ;
        int counter = 0;
        while(num%2==0){
                counter++;
                num = num/2;
        }
        System.out.println("counter : " + counter);

        //do while loop

        boolean a = false;
        do {
            System.out.println("Even the condition is false , still the statement is been executed first ");
        }while(a);

    }
}
