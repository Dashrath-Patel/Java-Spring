package Week1.Day2;

public class Ternary {
    public static void main(String args[]){

        //Using if Else

        int age = 20;
        if(age >18){
            System.out.println("You are now Adult");
        }
        else{
            System.out.println("You are Child");
        }

        //Using Ternary Operators

        String result = age>18 ? "Adult" : "Child";
        System.out.println(result);

        //Output - Adult
        age = 18;
        result = age>18 ? "Adult" : "Child";
        System.out.println(result);


    }
}

