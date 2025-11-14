package Week1.Day3;

 /*
        We need to create a class which will acts as a blueprint or a design for the objects.
        JVM creates teh objects in Java , So to create the objects we need to create a class file (Design so that
        objects can be created based on that.

        The class file is compiled in to a byte code

        Best example for class and objects are

        Example - As we see the Apple mobiles , on the backside of their box , there is something written about the device
        that this is being  designed in california , but manufactured in China ,
        So here manufacturer is JVM that creates the objects amd the design part is the class.

        Every object has properties and methods.
        If I want to perform any action , then we will use methods.

        so methods syntax is

        access specifier | return type | Method Name {
        --actions need to perform by methods --
        }

        Class consists of methods and variables known as instance variables
        To use the methods of the class , we need to create  an instance (object).

        */

//I am creating a class name calculator
class Calculator{
    public int add(int n1 , int n2){
        return n1+n2;
    }
    public int sub(int n1 , int n2){
        return n1-n2;
    }
    public int mul(int n1 , int n2){
        return n1*n2;
    }
    public int div(int n1 , int n2){
        return n1/n2;
    }
}


public class objects {
    public static void main(String args[]){
       int result = 0;
       int n1 = 5;
       int n2 = 5;
        // To call the calculator functions like add , sub , mul , div , we need to create an instance (object) so that we can call them
        Calculator calc = new Calculator();
        result = calc.add(n1, n2);
        System.out.println(result);
        result = calc.sub (n1,n2);
        System.out.println(result);
        result = calc.mul(n1, n2);
        System.out.println(result);
        result = calc.div(n1,n2);
        System.out.println(result);
    }
}
