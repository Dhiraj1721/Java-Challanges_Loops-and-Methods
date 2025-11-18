package Arrays;

class MaxMin {
     public static void main(String[] args) {
         int[] arr = ArrayUtility.inputArray();
         int max = maximum(arr);
         System.out.println("max num of array element is: "+max);
         int min = minimum(arr);
         System.out.println("min num of array element is: "+ min);
     }
     public static int maximum(int[] arr){
           if(arr.length == 0){
               return Integer.MIN_VALUE;
           }
            int max = arr[0];
            int i =1;
            while (i<arr.length){
                if(max < arr[i]){
                    max = arr[i];
                }
               i++;
            }
         return max;
     }
     public static int minimum(int[] arr){
         int min = Integer.MAX_VALUE;
         int i =0;
         while (i < arr.length){
             if(min > arr[i]){
                 min = arr[i];
             }
             i++;
         }
         return min;

     }

}
