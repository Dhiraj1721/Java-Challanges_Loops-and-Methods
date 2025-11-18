package Arrays;
import java.util.Scanner;

class NumberOfOccurance {
    public static void main(String[] args) {
        int[] numArray = ArrayUtility.inputArray();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to check its occurrence: ");
        int number = input.nextInt();
        int result = findOccurrence(numArray,number);
        System.out.println(number + " occurred in given array for "+result+ " time");

    }
    public static int findOccurrence(int[] numArray, int num){
        int count = 0;
        int i =0;
        while(i < numArray.length)
        {
            if(numArray[i] == num){
                count++;
            }
            i++;
        }
        return count;
    }
}
