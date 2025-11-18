package Arrays;

 class PalindromeArray {
    public static void main(String[] args) {
        int[] originalArr = ArrayUtility.inputArray();
        boolean isArrayPalindrome = isArrayPalindrome(originalArr);
        if(isArrayPalindrome){
            System.out.println("your Array is palindrome ");
        }else{
            System.out.println("Your array is not palindrome ");
        }
    }
    public static boolean isArrayPalindrome(int[] myArr){

        int i =0;
        while (i < myArr.length / 2) {
            if (myArr[i] != myArr[myArr.length - 1 - i]) {
                return false;
            }
            i++;
        }
        return true;
    }
}
