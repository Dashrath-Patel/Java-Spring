package Week1.Day2;

public class SwitchCase {
    public static void main(String[] args) {

        // We can use if else statements for many conditions
        // Like If we want to get the name of the day according to a  day number

        int n = 7 ;
        if(n==1){
            System.out.println("Monday");
        }
        else if(n==2){
            System.out.println("Tuesday");
        }
        else if(n==3){
            System.out.println("Wednesday");
        }
        else if(n==4){
            System.out.println("Thursday");
        }
        else if(n==5){
            System.out.println("Friday");
        }
        else if(n==6){
            System.out.println("Saturday");
        }
        else {
            System.out.println("Sunday");
        }

        // But it makes the code too long , we can perform any action with the particular case
        // Based on the value , It will execute the case statement

        // Earlier Switch case statement
        switch (n){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }

        //  Now in newer version of switch case statement we can use switch as an expression , means it will return some
        // value based on the input , like a function
        // Also , In earlier switch case we can match the integer values , only we can match the String types too

        String day = "Wednesday";

        switch (day){
            case "Saturday","Sunday":
                System.out.println(" You need to wake up at 8am");
                break;
            case "Monday","Tuesday","Wednesday","Thursday","Friday":
                System.out.println("You need to wake up at 6am");
                break;
            default:
                System.out.println("Invalid Input");
        }

        // Now if you don't need to write break statements , and  " : " punctuation , then in newer version
        // We can use " -> " arrow function to get the result and also not need to write the break statement too

        switch (day){
            case "Saturday","Sunday" -> System.out.println("You need to wake up at 8am");
            case "Monday","Tuesday","Wednesday","Thurshday","Friday" -> System.out.println("You need to wake up at 6am");
            default -> System.out.println("Invalid Input");
        }

        // This make the switch case statement more short , and much readable

        // Now to get values as an expression from the switch case stataments
        int marks =30;
         String result = switch (marks) {
            case 90 -> result ="Awesome Marks";
            case 80 -> result ="Better Marks";
            case 70 -> result ="Good Marks";
            case 50 -> result ="Can get better Marks";
            case  40 -> result ="Just passing  Marks";
            case 30 -> result ="Failed";
            default -> result ="Invalid Input";

        };
        System.out.println(result);

        // If I want to use Switch as an Expresssion , but if I don't want to use the arrow -> keyword then ,
        // We need to use "yield" keyword

        result = switch(day){
            case "Saturday","Sunday" : yield "You can sleep more";
            case  "Monday","Tuesday" : yield "Wake up you bastard";
            default: yield "Sorry Enter correct day";

        };
        System.out.println(result);
  }
}

