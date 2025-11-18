import java.util.Scanner;

class PrintFibbonacci {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the certain num for fibonacci series: ");
         int num = input.nextInt();
         System.out.println("Fibonacci series are: ");
         fibonacciSeries(num);
     }
     public static void fibonacciSeries(int num){
        if (num < 0) return;
        System.out.print("0 ");
        if(num == 0) return;
        System.out.print("1 ");

        int first = 0 ,second = 1;
        while (first + second <= num){
            int third = first + second;
            System.out.print(third + " ");
            first = second;
            second = third;
        }
     }
}
