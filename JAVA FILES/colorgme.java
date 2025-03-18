import java.util.Random;
import java.util.Scanner;

@SuppressWarnings("unused")
public class colorgme {
    
    public static void main(String[] args) {
        
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int red = 1;
        int green = 2;
        int white = 3;
        int blue = 4;
        int yellow = 5;
        int pink = 6;
        int colorBet;
        int moneyBet;
        String userChoice;

        System.out.println("\n====================================");
        System.out.println("    Welcome to the color game!");
        System.out.println("====================================\n");

        do {
        System.out.print("How much money do you want to bet: P");
        moneyBet = scanner.nextInt();

        System.out.print("\nPLACE YOUR BETS!(TYPE THE NUMBER) CHOOSE A COLOR \n1. Red\n2. Green\n3. White\n4. Blue\n5. Yellow\n6. Pink\nColor bet: ");
        colorBet = scanner.nextInt();

        System.out.print("\nThe colors are rolling");

        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
                System.out.print(".");
                System.out.flush();
            } catch (InterruptedException e) {
                System.out.println("Sleep interrupted");
            }
        }

        System.out.println();

        int prizeMoney = colorRoller(red, green, white, blue, yellow, pink, colorBet, moneyBet);

        if (prizeMoney > 0) {
            System.out.println("\n====================================");
            System.out.println("Your prize money is: P" + prizeMoney);
            System.out.println(" ");
        } else {
            System.out.println("\nYou did not win anything!");
            System.out.println("====================================\n");
        }

        System.out.print("Do you want to play again? (yes/no): ");
        userChoice = scanner.next();

        } while (userChoice.equals("yes"));

        scanner.close();
    }

    public static int colorRoller(int red, int green, int white, int blue, int yellow, int pink, int colorBet, int moneyBet) {

        Random random = new Random();

        int color1 = random.nextInt(6) + 1;
        int color2 = random.nextInt(6) + 1;
        int color3 = random.nextInt(6) + 1;

        System.out.println("\nRolled Colors: " + getColorName(color1) + ", " + getColorName(color2) + ", " + getColorName(color3));

        int prizeMoney = 0;

        if (colorBet == color1 || colorBet == color2 || colorBet == color3) {
            System.out.println("\nYOU JUST WON!!");
                if (colorBet == color1 && colorBet == color2) {
                    System.out.println("\nYOUR BET HIT TWO OF THE COLORS!!");
                    prizeMoney = moneyBet * 3;            
                } else if (colorBet == color2 && colorBet == color3) {
                    System.out.println("\nYOUR BET HIT TWO OF THE COLORS!!");
                    prizeMoney = moneyBet * 3;
                } else if (colorBet == color1 && colorBet == color3) {
                    System.out.println("\nYOUR BET HIT TWO OF THE COLORS!!");
                    prizeMoney = moneyBet * 3;
                } else if (colorBet == color1) {
                    System.out.println("\nYOUR BET HIT ONE OF THE COLORS!!");
                    prizeMoney = moneyBet * 2;
                } else if (colorBet == color2) {
                    System.out.println("\nYOUR BET HIT ONE OF THE COLORS!!");
                    prizeMoney = moneyBet * 2;
                } else if (colorBet == color3) {
                    System.out.println("\nYOUR BET HIT ONE OF THE COLORS!!");
                    prizeMoney = moneyBet * 2;
                } else if (colorBet == color1 && colorBet == color2 && colorBet == color3) {
                    prizeMoney = moneyBet * 4; 
                    System.out.println("\nYOUR BET HIT ALL OF THE COLORS!!\n");
                } 
        } else {
            System.out.println("\nYou lost the game WOMPWOMP! :((");
            }

            return prizeMoney;            
    }

    public static String getColorName(int color) {
        return switch (color) {
            case 1 -> "Red";
            case 2 -> "Green";
            case 3 -> "White";
            case 4 -> "Blue";
            case 5 -> "Yellow";
            case 6 -> "Pink";
            default -> "Unknown";
        };
    }
}