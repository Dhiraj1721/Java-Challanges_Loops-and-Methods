package Arrays;

import java.util.Scanner;

class Searchin2DArray {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Welcome to 2D array \n");
         int[][] numArr = ArrayUtility.input2DArray();
         System.out.print("now enter the number you want to search: ");
         int num = input.nextInt();
         boolean isFound = search(numArr,num);
         if (isFound){
             System.out.println("Number was found in 2D Array.");
         }
         else {
             System.out.println("Number was not found ");
         }
     }
     public static boolean search (int[][] numArr, int num){
         int i =0;
         while (i< numArr.length){
           int j=0;
           while (j < numArr[i].length){
               if (numArr[i][j]==num){
                   return true;
               }
               j++;
           }
             i++;
         }
         return false;
     }
}
