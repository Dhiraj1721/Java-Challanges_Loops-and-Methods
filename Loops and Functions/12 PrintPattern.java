import java.util.Scanner;

class PrintPattern {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number upto we want to print pattern: ");
        int num = input.nextInt();
         printFirstPattern(num);
        System.out.println("Below is Pattern Second");
         printSecondPattern(num);
        System.out.println("Below is third Pattern");
        printThirdPattern(num);
    }
    public static void printFirstPattern(int num){
        int rows = 0;
        while(rows < num){
            System.out.print("* ");
            int i =0;
            while(i < rows){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows++;
        }

    }
    public static void printSecondPattern(int num){
        int rows = num;
        while(rows > 0){
            int i=0;
            while (i < rows){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }
    }

    public static void printThirdPattern(int num){
        int rows = num;
        while (rows > 0){
            int j =0;
            while(j < rows -1){
                System.out.print("  ");
                j++;
            }
            // this loop prints the stars
            int i = 0;
            while(i <= (num - rows)){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }

    }
}
