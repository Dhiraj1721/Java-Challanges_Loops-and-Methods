package Arrays;

public class DiagonalSum2DArray {
    public static void main(String[] args) {
        int[][] myArr = ArrayUtility.input2DArray();
        long sum = diagonalSum(myArr);
        System.out.println("Diagonal sum 2D array is: "+ sum);
    }
    public static long diagonalSum(int[][] myArr){
        long leftSum = leftDiagonalSum(myArr);
        long rightSum = rightDiagonalSum(myArr);
        long sum = leftSum + rightSum;

        if(myArr.length % 2 != 0){
            int midIndex = myArr.length / 2;
            sum -= myArr[midIndex][midIndex];
        }
        return sum;
    }
    public static long leftDiagonalSum(int[][] myArr){
        long sum =0;
        int i =0;
        while (i < myArr.length){
            sum += myArr[i][i];
            i++;
        }
        return sum;
    }
    public static long rightDiagonalSum(int[][] myArr){
        long sum =0;
        int i =0;
        while (i < myArr.length){
            int col = myArr.length - 1 - i;
            sum += myArr[i][col];
            i++;
        }
        return sum;
    }
}
