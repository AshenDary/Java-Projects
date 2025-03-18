import java.util.Random;
import java.util.Scanner;


public class guesss {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int number;
        int guess;

        number = random.nextInt(1, 100);

        do {
        System.out.print("\nGuess the number: ");
        guess = scanner.nextInt();

        if (guess == number) {
            System.out.println("You guessed the number!\n");
        } else if (guess > number) {
            System.out.println("The number is lower than your guess.");
        } else {
            System.out.println("The number is higher than your guess.");
        }

        } while (guess != number);
    }
}
