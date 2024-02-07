import java.util.Scanner;

public class PrimeRange {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the lower limit of the range: ");
        int lowerLimit = scanner.nextInt();
        System.out.println("Enter the upper limit of the range: ");
        int upperLimit = scanner.nextInt();
        scanner.close();

        if (lowerLimit < 2) {
            lowerLimit = 2;
        }

        System.out.println("Prime numbers between " + lowerLimit + " and " + upperLimit + " are: ");
        generatePrimeNumbers(lowerLimit, upperLimit);
    }

    private static void generatePrimeNumbers(int lowerLimit, int upperLimit) {
        for (int number = lowerLimit; number <= upperLimit; number++) {
            if (isPrime(number)) {
                System.out.print(number + " ");
            }
        }
        System.out.println();
    }

    private static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        for (int i = 3; i <= Math.sqrt(number); i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}