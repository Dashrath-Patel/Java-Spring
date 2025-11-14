package Week1.Day3;

/*
       Method overloading means you can create the same methods name , that will have same functionality
       but have different no of  parameters , or different types of parameters.

 */

// Let's see with the example of method overloading

import org.w3c.dom.ls.LSOutput;

class calculator{
    // Here in this Scenario , methods name are same , but have different no of parameters , if I call add with three parameters
    // then add with three parameters would return the value, if I call with two parameters , then add with two parameters
    // would be executed.

    public int add(int a, int b){
        return a+b;
    }
    public int add (int a , int b , int c ){
        return a+b+c;
    }
    public int add (int a , int b , int c , int d){
        return a+b+c+d;
    }

    // In next scenario , type of parameters is changed

    public double add(double a, double b){
        return a+b;
    }
    public float add(float a, float b){
        return a+b;
    }

}

public class MethodOverloading {
    public static void main(String[] args) {
        int result = 0;

        // Let's create the instance to call the add function from the calculator class
        calculator c = new calculator();
        result = c.add(1,2);
        System.out.println(result);
        result = c.add(1,2,3);
        System.out.println(result);
        result = c.add(1,2,3,4);
        System.out.println(result);

        double result2 = c.add(5.5,4.5);
        System.out.println(result2);
        result2 = c.add(5.5f, 3.5f);
        System.out.println(result2);

        /*
        so first method accepts two parameters whereas second same method accepts three parameters , 4 parameters
        , so even if you change no of parameters or the type of parameters , it doesn't matter . This scenario is called
        Method overloading.
         */
    }
}

