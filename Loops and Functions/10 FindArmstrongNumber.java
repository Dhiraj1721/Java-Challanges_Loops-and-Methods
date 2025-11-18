import java.util.Scanner;

class FindArmstrongNumber {
     public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         System.out.println("Enter the Num for Armstrong Num: ");
         int num = input.nextInt();
         boolean isArmstrong = isArmstrong(num);
         if(isArmstrong){
             System.out.println("Num is Armstrong Num..");
         }else {
             System.out.println("Number is not Armstrong..");
         }

     }
     public static boolean isArmstrong(int num){
         int noOfDigit = digit(num);
         int numCopy = num;
         int finalNumber = 0;
         while (num >0){
             int lastDigit = num % 10;
             num /=10;
             finalNumber += power(lastDigit,noOfDigit);
         }
         return finalNumber == numCopy ;
     }

     public static int power(int num1, int num2){
         int result = 1;
         int i =0;
         while(i < num2){
             result *= num1 ;
             i++;
         }
         return result;
     }
     public static int digit (int num){
         int digit = 0;
         while (num > 0){
             digit++;
             num /= 10;
         }
         return digit;
     }
}
