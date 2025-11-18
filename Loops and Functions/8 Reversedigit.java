import java.util.Scanner;

class Reversedigit {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a Num for reversing");
        int num = input.nextInt();
        int reverse = reverseNum(num);
        System.out.println("Reverse num is :"+reverse);
    }
        public static int reverseNum(int num){
           int newNum = 0;
           while(num > 0){
               int digit = num % 10 ;
               newNum = newNum * 10 + digit ;
               num /= 10;
           }
           return newNum;
        }
}

