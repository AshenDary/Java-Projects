import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] inputChoices = {1, 2, 3};

        System.out.println("PLAY BATO BATO PICK WITH ME: USE 1 TO PLAY BATO," +
                " USE 2 TO PLAY PAPEL, AND USE 3 TO PLAY GUNTING: ");

        while (true) {
            System.out.print("INPUT: ");
            int userInput = Integer.parseInt(scanner.nextLine());

            boolean validInput = false;
            for (int choice : inputChoices) {
                if (userInput == choice) {
                    validInput = true;
                    break;
                }
            }

            if (!validInput) {
                System.out.println("Invalid input. Enter another input (1, 2 ,3): ");
                continue;
            }
            int enemyChoice = random.nextInt(3) + 1;
            System.out.println("ENEMY: " + enemyChoice);

            if (userInput == enemyChoice)
                System.out.println("IT'S A TIE");
            else if (userInput == 1 && enemyChoice == 3 || userInput == 2 && enemyChoice == 1)
                System.out.println("YOU WIN WOHOO");
            else
                System.out.println("YOU LOST WOMP WOMP");
            System.out.println("Do you want to continue playing? say yes/no: ");
            String answer = "";
            do {
                System.out.print("answer: ");
                answer = scanner.next().toLowerCase();
                if (answer.equals("yes") || answer.equals("no")) {
                    break;
                } else {
                    System.out.println("INVALID INPUT PLEASE PUT YES OR NO ONLY");
                }
            } while (true);

            if (answer.equals("no")) {
                System.out.println("Thank you for playing!");
                break;
            }
        } scanner.close();
    }
}