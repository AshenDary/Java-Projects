//Noel, Jared L.
//COM 244
//rev1d array

import java.util.Scanner;

public class rev1darray {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int[] numbers = new int[5];
        
        System.out.println("\n=====================================");
        System.out.println("\nPlease enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        
        int[] originalArray = numbers.clone();
        
        int[] revArray = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            revArray[i] = numbers[numbers.length - 1 - i];
        }

        System.out.println("\nOriginal array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        
        System.out.println("\nReversed array:");
        for (int num : revArray) {
            System.out.print(num + " ");
        }

        System.out.println("\n\n=====================================\n");
        
        sc.close();
 
    }
}
