package Arrays;

class SortedArray {
    public static void main(String[] args) {
        System.out.println("Welcome to Sorted check Post");
        int[] myArr = ArrayUtility.inputArray();
        boolean isIncreasing = isIncreasingOrder(myArr);
        boolean isDecreasing = isDecreasingOrder(myArr);
        if (isIncreasing || isDecreasing) {
            System.out.println("Your given array is sorted.");
        }else {
            System.out.println("Array is not sorted");
        }
    }
    public static boolean isIncreasingOrder(int[] array) {
        int i = 1;
        while (i < array.length) {
            if (array[i] < array[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static boolean isDecreasingOrder(int[] array) {
        int i = 1;
        while (i < array.length) {
            if (array[i] > array[i - 1]) {
                return false;
            }
            i++;
        }
        return true;
    }
}