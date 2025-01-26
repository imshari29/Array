import java.util.Scanner;
public class Seive {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Input N
            System.out.println("Enter a number:");
            int N = scanner.nextInt();

            // Initialize an array to mark primes
            int[] arr = new int[N + 1]; // Array of size N+1, all values are 0 by default

            // Apply Sieve of Eratosthenes
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (arr[i] == 0) { // If i is prime
                    for (int j = i * i; j <= N; j += i) {
                        arr[j] = 1; // Mark multiples of i as non-prime
                    }
                }
            }

            // Print all prime numbers
            for (int i = 2; i <= N; i++) {
                if (arr[i] == 0) { // If still marked as prime
                    System.out.print(i + " ");
                }
            }
        }
}
