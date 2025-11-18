package Arrays;

class ReverseAnArray {
    public static void main(String[] args) {
        int[] myArr = ArrayUtility.inputArray();
        reverse(myArr);
        ArrayUtility.Display(myArr);
    }
    public static int[] reverse(int[] myArr){
        int i =0 ;
        while(i< myArr.length /2){
            int swap = myArr[i];
            myArr[i] = myArr[(myArr.length-1)-i];
            myArr[(myArr.length-1)-i] = swap;
            i++;
        }
        return myArr;
    }
}
