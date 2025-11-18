package Arrays;

class SumAvgOf2Darray {
    public static void main(String[] args) {
        int[][] myArr = ArrayUtility.input2DArray();
        long sum = sumOf2DArr(myArr);
        System.out.println("sum of 2D Array is: "+sum);
        double avg = avgOf2DArray(myArr);
        System.out.println("avg of 2D Array is: "+avg);
    }
    public static long sumOf2DArr(int[][] myArr){
        int sum =0;
        int i=0;
        while(i < myArr.length){
            int j =0;
            {
                while (j < myArr[i].length){
                    sum += myArr[i][j];
                    j++;
                }
            }
            i++;
        }
        return sum;
    }

    public static double avgOf2DArray(int [][] myArr){
        double sum = sumOf2DArr(myArr);
        if ( myArr.length == 0){
            return 0;
        }
        int row = myArr.length;
        int cols = myArr[0].length; // we are considering size would be homoginious
       double size = row * cols;
        return (sum / size);

    }
}
