import java.util.Scanner;

 class  Faactorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number for factorial: ");
        int num = input.nextInt();
        System.out.println("Factorial of Num is: "+Fact(num));

    }
    public static long Fact (int num){
        if(num < 2){
            return 1;
        }
        long fact = 1;
        int i =2;
        while (i <= num){
            fact *= i;
            i++;
        }
        return fact ;
    }
}
