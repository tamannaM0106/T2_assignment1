import java.util.Scanner;

public class FibonacciSeries {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms: ");
        int numberOfTerms = scanner.nextInt();
        scanner.close();

        if (numberOfTerms <= 0) {
            System.out.println("Number of terms should be positive.");
        } else {
            long[] fibonacciSeries = new long[numberOfTerms];
            fibonacciSeries[0] = 0;
            fibonacciSeries[1] = 1;

            for (int i = 2; i < numberOfTerms; i++) {
                fibonacciSeries[i] = fibonacciSeries[i - 1] + fibonacciSeries[i - 2];
            }

            System.out.println("Fibonacci series:");
            for (long number : fibonacciSeries) {
                System.out.print(number + " ");
            }
        }
    }
}