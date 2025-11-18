package Arrays;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){ // I created array utility function this class can used in other class till we have this static
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no or size for array: ");
        int size = input.nextInt();
        int[] myArr = new int[size];
        int i =0;
        while (i < size) {
            System.out.print("Enter the element no " + (i + 1) + ": ");
            myArr[i] = input.nextInt();
            i++;
        }
        return myArr;
    }
 // to take input from 2d array
    public static int[][] input2DArray(){ // I created array utility function this class can used in other class till we have this static
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the no of rows for array: ");
        int rows = input.nextInt();
        System.out.print("Enter the no of column for array: ");
        int columns = input.nextInt();
        int[][] numArr = new int[rows][columns];

        int i =0;
        while (i < rows) {
            int j =0;
            while (j < columns){
                System.out.print("Enter the element rows " + (i + 1)
                        + ", columns: " + (j+1) + " : ");
                numArr[i][j] = input.nextInt();
                j++;
            }
            i++;
        }
        return numArr;
    }

    public static void Display(int[] myArr){
        int i =0;
        while (i < myArr.length){
            System.out.print(myArr[i] + " ");
        i++;
        }
        System.out.println();
    }
}
