import java.util.Scanner;

class SumofDigit {
    public static void main(String[] args) {
        Scanner input = new Scanner( System.in);
        System.out.print("Enter the digit: ");
        int num = input.nextInt();
        int result = sumDigitprg(num);
        System.out.println("Sum of digit is : "+ result);
    }

    public static int sumDigitprg(int num){
        int sum = 0;
        while (num > 0 ){
            sum += num % 10 ;
            num /=10 ;
        }
        return sum ;
    }
}
