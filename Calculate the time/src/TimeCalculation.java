import java.util.Scanner;

public class TimeCalculation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // First user inputs the target number
        System.out.print("First user,Enter the target number: ");
        int targetNumber = scanner.nextInt();

        // Second user tries to guess
        System.out.println("Second user, try to guess the number!");
        int guess;
        int attempts = 0;

        // Record start time
        long startTime = System.currentTimeMillis();

        do {
            System.out.print("Enter your guess: ");
            guess = scanner.nextInt();
            attempts++;

            if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else if (guess > targetNumber) {
                System.out.println("Too high! Try again.");
            }
        } while (guess != targetNumber);

        // Record end time and calculate duration
        long endTime = System.currentTimeMillis();
        long timeTaken = (endTime - startTime) / 1000; // Convert to seconds

        System.out.println("Congratulations! You guessed the number in " + attempts + " attempts.");
        System.out.println("Time taken: " + timeTaken + " seconds");

        scanner.close();
    }
}
