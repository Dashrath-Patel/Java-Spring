package Week1.Day4;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

class Student{
	int rollno;
	String name;
    int marks;
}

public class forEach {
    public static void main(String[] args) {

        // Why we need the forEach loop
        /*
            In Earlier for loops , we need a counter to traverse to length and specify the index
            but in forEach loop , it will iterate between all the values , give one value at a time.
         */

        int[] nums = {1,2,3,4,5,6};
        for(int n : nums){
            System.out.print(n+" ");
        }
        System.out.println();

        //now traversal on objects

        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.rollno = 1;
        s1.name = "Jack";
        s1.marks = 10;

        s2.rollno = 2;
        s2.name = "Jill";
        s2.marks = 15;

        s3.rollno = 3;
        s3.name = "Jane";
        s3.marks = 20;


        Student[] students={s1,s2,s3};
//        So if you want an array that stores Student objects,
//        the array's type must be Student[]

//        Think of it like this:
//        int[] → stores integers
//        String[] → stores strings
//        double[] → stores doubles
//        Student[] → stores Student objects
//        Because each element in the array is actually a Student reference.

//        If you create a class named Demo, and you want an array that stores Demo objects, then the array type must be:
//        Demo d1 = new Demo();
//        Demo d2 = new Demo();
//        Demo d3 = new Demo();
//
//        Demo[] arr = { d1, d2, d3 }
//        So traversal on array of objects
        for(Student str : students){
            System.out.println(str.name + ": " + str.rollno + ": " +str.marks);
        }
    }
}
