import java.util.Scanner;

class FindLCM {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Num: ");
        int first = input.nextInt();
        System.out.println("Enter second Num: ");
        int second = input.nextInt();
        int result = lcm(first, second);
        System.out.println("Lcm of 2 Num is: "+result);
    }
    public static int lcm (int first , int second){
        int i =1;
        while (i <= second) {   // while (true ) will give us infinite loop in this cond we can use to not return 0
                                // because that is unreachable we are getting lcm at if condition
            int factor = first * i;
            if(factor % second == 0)
            {
                return factor;  // this is the final lcm of two num after checking all cond
            }
            i++;
        }
        return 0;
    }
}
