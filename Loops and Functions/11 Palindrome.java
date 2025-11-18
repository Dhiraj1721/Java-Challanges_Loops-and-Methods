import java.util.Scanner;

class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        boolean isPalindrome = isPalindrome(num);
        if(isPalindrome){
            System.out.println("Given number is palindrome..");
        }
        else {
            System.out.println("given Number is not palindrome");
        }
    }
    public static boolean isPalindrome(int num){
        int reverseNum =0;
        int numCopy = num;
        while(num >0){
            int rem = num % 10;
            reverseNum = (reverseNum * 10) + rem;
            num /= 10;
        }
        return numCopy == reverseNum;
    }
}
