import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int target = 15;

        System.out.print("Enter your guess (1-20): ");
        int guess = sc.nextInt();

        if (guess < target) {
            System.out.println("Guessed number is smaller than the target.");
        } 
        else if (guess > target) {
            System.out.println("Guessed number is larger than the target.");
        } 
        else {
            System.out.println("Guessed number is equal to target.");
        }

        sc.close();
    }
}