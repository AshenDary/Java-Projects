import java.util.Scanner;

public class bankingSystem  {
    static float balance = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        String userChoice;

        do {
            System.out.println("\n=========================================");
            System.out.println("   WELCOME TO BANK BANKER BANKEST!!  ");
            System.out.println("=========================================\n");
            accountChecking();
            System.out.print("Would you like to perform another transaction? (yes/no): ");
            userChoice = sc.next().toLowerCase();
        } while (userChoice.equals("yes"));
        System.out.println("\n\"BBB is right where you should be.\"");
        System.out.println("Thank you for banking with us! Please bank again later!!\n");
    }

    public static void bankBalance() {
        System.out.print("Enter your bank balance: ");
        balance = sc.nextFloat();
        System.out.print("Enter how much you want to deposit: PHP");
        float deposit = sc.nextFloat();
        balance += deposit;
        System.out.println("Updated Balance: " + balance);
    }

    public static void withdraw() {
        try {
            System.out.print("\nEnter withdrawal amount: ");
            float withdrawal = sc.nextFloat();
            if (withdrawal > balance) {
                throw new Exception("\nInsufficient funds! Withdrawal amount exceeds balance.");
            }
            balance -= withdrawal;
            System.out.println("\nWithdrawal successful! Updated balance: " + balance);
        } catch (Exception e) {
            System.out.println("\nError: " + e.getMessage());
        }
    }

    public static void accountChecking() {
        int accChoice;

        System.out.println("Do you have an account in BANK BANKER BANKEST?");
        System.out.println("1. Yes, I have an account in BBB");
        System.out.println("2. No, I want to create an account");
        System.out.println("3. Exit");
        System.out.print("Choose an option: ");
        accChoice = sc.nextInt();
        sc.nextLine();

        switch (accChoice) {
            case 1:
                System.out.println("\n===== Welcome to BBB! =====");
                performTransaction();
                break;
            case 2:
                createAccount();
                performTransaction();
                break;
            case 3:
                System.out.println("\nThank you for banking with us! Please bank again later!!\n");
                System.exit(0);
                break;
            default:
                System.out.println("\nUnexpected Error! Please try again.");
        }
    }

    public static void createAccount() {
        
        sc.nextLine();
        System.out.print("\n======= Create your account at BBB =======\n");
        System.out.print("Enter your bank number: ");
        String bankNumb = sc.nextLine();

        System.out.print("Enter your password: ");
        String password = sc.nextLine();

        System.out.print("Confirm your password: ");
        String confirmPass = sc.nextLine();

        while (!password.equals(confirmPass)) {
            System.out.println("\nPasswords do not match. Please try again.");
            System.out.print("Enter your password: ");
            password = sc.nextLine();
            System.out.print("Confirm your password: ");
            confirmPass = sc.nextLine();
        }
        System.out.println("\nYou have successfully created your account at BBB!");
        bankBalance();
    }

    public static void performTransaction() {
        String choice;
		
        do {
            System.out.println("\nWhat transaction would you like to perform?\n");
            System.out.println("Type 'deposit' to deposit money");
            System.out.println("Type 'withdraw' to withdraw money");
            System.out.println("Type 'check balance' to view your balance");
            System.out.println("Type 'exit' to finish transactions\n");
            System.out.print("Enter your choice: ");
            choice = sc.nextLine().toLowerCase();

            switch (choice) {
                case "deposit":
                    System.out.print("Enter deposit amount: ");
                    float deposit = sc.nextFloat();
                    sc.nextLine();
                    balance += deposit;
                    System.out.println("\nDeposit successful! Updated balance: PHP" + balance);
                    break;
                case "withdraw":
                    withdraw();
                    sc.nextLine();
                    break;
                case "check balance":
                    System.out.println("Your current balance is: PHP" + balance);
                    break;
                case "exit":
                    System.out.println("\nExiting transactions.");
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }
        } while (!choice.equals("exit"));
    }
}

