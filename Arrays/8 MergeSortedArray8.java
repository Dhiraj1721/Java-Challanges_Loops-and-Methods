package Arrays;

class MergeSortedArray {
    public static void main(String[] args) {
         int[] arr1 = ArrayUtility.inputArray();
         int[] arr2 = ArrayUtility.inputArray();
         int[] SortedArray = newSortedArr(arr1,arr2);

        System.out.println("your Sorted Array are: ");
        ArrayUtility.Display(SortedArray);
    }

    public static int[] newSortedArr(int[] arr1, int[] arr2){
        int newSize = arr1.length + arr2.length;
        int[] newArray = new int[newSize];
        int i =0, j=0,k=0;  // i is for arr1 and j is for arr2 and k is for newArr , this will work as index for these three array
        while (i < arr1.length || j < arr2.length){
            if(j == arr2.length ||
                    (i < arr1.length && arr1[i] < arr2[j])){
                newArray[k] = arr1[i];
                i++;
                k++;
            }
            else {
                newArray[k] = arr2[j];
                k++;
                j++;
            }
        }



        return newArray;

    }
}
