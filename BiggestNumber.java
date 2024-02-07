import java.util.Scanner;

public class BiggestNumber {
    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        System.out.print("Number 1: ");
        int num1 = Scanner.nextInt();
        System.out.print("Number 2: ");
        int num2 = Scanner.nextInt();
        System.out.print("Number 3: ");
        int num3 = Scanner.nextInt();

        int biggest = findBiggest(num1, num2, num3);
        System.out.println("The biggest number is: " + biggest);
    }

    public static int findBiggest(int num1, int num2, int num3) {
        if (num1 > num2 && num1 > num3) {
            return num1;
        } else if (num2 > num1 && num2 > num3) {
            return num2;
        } else {
            return num3;
        }
    }
}