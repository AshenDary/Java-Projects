import java.util.Scanner;

public class prac {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int score;

        System.out.print("Enter your score: ");
        score = sc.nextInt();

        String results = (score >= 90) ? "YOU PASSED" : "YOU FAILED";

        System.out.println(results);

        sc.close();
    } 
}

