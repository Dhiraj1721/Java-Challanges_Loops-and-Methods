package Arrays;

import java.util.Scanner;

 class CreateNewArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] myArr = ArrayUtility.inputArray();
        System.out.print("Enter Number to delete from array: ");
        int numToDelete = input.nextInt();
        int[] newArray = deleteNumber(myArr,numToDelete);
        System.out.print("new array element are: ");
        ArrayUtility.Display(newArray);
    }
    public static int[] deleteNumber(int[] myArr, int numToDelete){
        int occ = NumberOfOccurance.findOccurrence(myArr,numToDelete);
        if(occ == 0){
            return myArr;
        }
        int size =myArr.length - occ;
        int[] newArray = new int[size];

        int i =0, j=0;
        while (i < myArr.length){
            if (myArr[i] != numToDelete){
                newArray[j] = myArr[i];
                j++;
            }
            i++;
        }
        return newArray;
    }
}
