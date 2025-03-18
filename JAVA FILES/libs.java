
import java.util.Scanner;


public class libs {
    public static void main(String[] args) {

        String name;
        Scanner sc = new Scanner(System.in);

        System.out.print("What is your name of your hotdog");
        name = sc.nextLine();

        if (name.isEmpty()) {

            System.out.println("You did not enter a name");

        } else {

            System.out.println("Your name is: " + name);
        }


        sc.close();
    }
}
