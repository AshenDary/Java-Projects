import java.util.Scanner;

public class hotdog {

    public static void main(String[] args) {
        
        double width;
        double height;
        double area;
        String color;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the width of the hotdog: ");
        width = sc.nextDouble();
        sc.nextLine();

        System.out.print("Enter your favorite color: ");
        color = sc.nextLine();

        System.out.print("Enter the height of the hotdog: ");
        height = sc.nextDouble();

        area = width * height;

        System.out.println("\nThe area of the hotdog is: " + area);
        System.out.println("The color of the hotdog is: " + color);


       sc.close();

    }
}