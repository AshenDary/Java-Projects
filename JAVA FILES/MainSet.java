//Noel, Jared L.
//COM244

import java.util.Arrays;
import java.util.Scanner;

class SetOperations {
    public static String[] union(String[] set1, String[] set2) {
        String[] result = new String[set1.length + set2.length];
        int index = 0;

        for (String color : set1) {
            if (!contains(result, color)) {
                result[index++] = color;
            }
        }

        for (String color : set2) {
            if (!contains(result, color)) {
                result[index++] = color;
            }
        }

        return trimArray(result, index);
    }

    public static String[] intersection(String[] set1, String[] set2) {
        String[] result = new String[set1.length];
        int index = 0;

        for (String color : set1) {
            if (contains(set2, color)) {
                result[index++] = color;
            }
        }

        return trimArray(result, index);
    }

    public static String[] difference(String[] set1, String[] set2) {
        String[] result = new String[set1.length];
        int index = 0;

        for (String color : set1) {
            if (!contains(set2, color)) {
                result[index++] = color;
            }
        }

        return trimArray(result, index);
    }

    public static String[] universalComplement(String[] set, String[] universalSet) {
        String[] result = new String[universalSet.length];
        int index = 0;

        for (String color : universalSet) {
            if (!contains(set, color)) {
                result[index++] = color;
            }
        }

        return trimArray(result, index);
    }

    public static boolean contains(String[] array, String value) {
        for (String element : array) {
            if (element != null && element.equals(value)) {
                return true;
            }
        }
        return false;
    }

    private static String[] trimArray(String[] array, int length) {
        return Arrays.copyOf(array, length);
    }
}

public class MainSet {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String goAgain;

        System.out.print("\nPlease enter your name: ");
        String name = sc.nextLine();

        String[] universalSet = {"red", "blue", "green", "yellow", "purple", "orange", "pink", "black", "white"};

        do {
            String[] set1 = new String[3];
            String[] set2 = new String[3];
            String choice;

            do {
                System.out.print("\nWhat set operation would you like to use (UNION, INTERSECTION, DIFFERENCE, COMPLEMENT): ");
                choice = sc.nextLine().toUpperCase();

                if (!choice.equals("UNION") && !choice.equals("INTERSECTION") && !choice.equals("DIFFERENCE") && !choice.equals("COMPLEMENT")) {
                    System.out.println("Invalid choice. Please enter UNION, INTERSECTION, DIFFERENCE, or COMPLEMENT.");
                }
            } while (!choice.equals("UNION") && !choice.equals("INTERSECTION") && !choice.equals("DIFFERENCE") && !choice.equals("COMPLEMENT"));

            System.out.println("\nEnter three colors for the first set:");
            for (int i = 0; i < 3; i++) {
                while (true) {
                    System.out.print("Color " + (i + 1) + ": ");
                    String color = sc.nextLine().toLowerCase();
                    if (SetOperations.contains(universalSet, color)) {
                        set1[i] = color;
                        break;
                    } else {
                        System.out.println("Hello");
                        System.out.println("Invalid color. Please enter a valid color from the universal set.");
                    }
                }
            }

            System.out.println("Enter three colors for the second set:");
            for (int i = 0; i < 3; i++) {
                while (true) {
                    System.out.print("Color " + (i + 1) + ": ");
                    String color = sc.nextLine().toLowerCase();
                    if (SetOperations.contains(universalSet, color)) {
                        set2[i] = color;
                        break;
                    } else {
                        System.out.println("Invalid color. Please enter a valid color from the universal set.");
                    }
                }
            }

            System.out.println("\nResult:");
            if (choice.equals("UNION")) {
                System.out.println("Union: " + Arrays.toString(SetOperations.union(set1, set2)));
            } else if (choice.equals("INTERSECTION")) {
                System.out.println("Intersection: " + Arrays.toString(SetOperations.intersection(set1, set2)));
            } else if (choice.equals("DIFFERENCE")) {
                System.out.println("Difference: " + Arrays.toString(SetOperations.difference(set1, set2)));
            } else if (choice.equals("COMPLEMENT")) {
                System.out.println("Universal Complement: " + Arrays.toString(SetOperations.universalComplement(set1, universalSet)));
            }

            System.out.print("\nWould you like to go again? (yes/no): ");
            goAgain = sc.nextLine().toLowerCase();
        } while (goAgain.equals("yes"));

        System.out.println("\nBABAYE " + name + "!!");
        sc.close();
    }
}
