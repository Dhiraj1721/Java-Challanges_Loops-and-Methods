import java.util.Scanner;
 class AddoddNum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter N Number: \n");
        int num = input.nextInt();
       int result = oddSum(num);
        System.out.println("The add of odd num is: "+result);
    }

    public static int oddSum(int num){

        int i =1;
        int sum =0;
        while (i <= num){
                sum += i;
                 i +=2;
        }
        return sum;

    }
}

