import java.util.Scanner;
class MultiplicationTable {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number for Multiplication: ");
        int num = input.nextInt();
        tableFormation(num);
    }
    public static void tableFormation(int num){
        int i = 1;
        while (i<=10){
            System.out.println(num * i);
            i++;
        }
    }
}
