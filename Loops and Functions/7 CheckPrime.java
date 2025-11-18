import java.util.Scanner;

class CheckPrime {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the num: ");
         int num = input.nextInt();
         boolean prime = isPrime(num);
         if(prime) {
             System.out.println("Num is prime");
         }else {
             System.out.println("num is not prime.");
         }
     }
     public static boolean isPrime(int num){
         int i =2 ;
         while (i < num){
             if (num % i ==0){
                 return false;
             }
             i++;
         }
         return true;

     }
}
