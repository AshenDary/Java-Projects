//Noel, Jared L.
//COM 244
//1d array

import java.util.Scanner;

public class onedarray {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];

        System.out.print("\nWhat is the grade of the first student: ");
        arr[0] = sc.nextInt();

        System.out.print("What is the grade of the second student: ");
        arr[1] = sc.nextInt();

        System.out.print("What is the grade of the third student: ");
        arr[2] = sc.nextInt();

        System.out.print("What is the grade of the fourth student: ");
        arr[3] = sc.nextInt();

        System.out.print("What is the grade of the fifth student: ");
        arr[4] = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        double average = (double) sum / arr.length;
        System.out.println("\nThe average score is: " + average);

        int highest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > highest) {
                highest = arr[i];
            }
        }
        System.out.println("The highest score is: " + highest);

        
        int lowest = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < lowest) {
                lowest = arr[i];
            }
        }
        System.out.println("The lowest score is: " + lowest);

        sc.close();

    }
}
