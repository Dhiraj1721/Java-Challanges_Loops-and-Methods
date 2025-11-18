import java.util.Scanner;

class SumandAvgOfArray {
     public static void main(String[] args) {
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
         long sum = sum(myArr);
         System.out.println("total sum of array element is: "+sum);
         double avg =avarage(myArr);
         System.out.println("Total avg of array element is: "+ avg);
     }
     public static long sum(int[] myArr){
         int sum = 0;
         int i =0;
         while(i < myArr.length){
             sum += myArr[i];
             i++;
         }
         return sum;
     }
     public static double avarage(int[] myArr){
         double sum = sum(myArr);
         return (sum / myArr.length);
     }
}
