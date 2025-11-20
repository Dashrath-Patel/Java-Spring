package Week1.Day4;

public class TraversalOnArrays {
public static void main(String[] args) {
    int[] num = {1,2,3,4,5};
    //Traversal on 1D arrays
    //For loop

    for(int i=0; i < num.length; i++){
        System.out.print(num[i]+ " ");
    }
    System.out.println();
    System.out.println();

    int[][] matrix ={{1,2,3,4,5},{6,7,8,9,10}};

    //Traversal on 2D arrays
    for(int i=0; i < matrix.length; i++){
        for(int j=0; j < matrix[i].length; j++){
            System.out.print(matrix[i][j]+ " ");
        }
        System.out.println();
    }
    System.out.println();

    // There are Jagged arrays in which the internal columns can have any no of elements
    // Example given below
    int[][] nums = new int[3][];
    nums[0] = new int[3]; // In this it stores 3 values in the first column
    nums[1] = new int[2]; //In this it stores 2 values in the second columns\
    nums[2] = new int[4]; // In this it stores 4 values in the third columns

    // This type of array are called Jagged arrays


    for(int i=0; i < nums.length; i++){
        for(int j=0; j < nums[i].length; j++){
            nums[i][j]=(int)(Math.random()*10);  //This is storing Random values in the arrays
        }
    }
    for(int n[] :nums){
        for(int j:n){
            System.out.print(j+" ");
        }
        System.out.println();
    }
}
}
