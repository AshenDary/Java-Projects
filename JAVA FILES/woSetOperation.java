//Noel, Jared L.
//COM244

import java.util.Scanner;

public class woSetOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String goAgain;

        System.out.print("\nEnter your name: ");
        String Name = sc.nextLine();

        String[] universalSet = {"red", "blue", "green", "yellow", "purple", "orange", "pink", "black", "white"};

        do {
            String[] set1 = new String[3];
            String[] set2 = new String[3];
            String choice;

            do {
                System.out.print("\nWhat set operation would " + Name + " like to use (UNION, INTERSECTION, DIFFERENCE, COMPLEMENT): ");
                choice = sc.nextLine().toUpperCase();

                if (!choice.equals("UNION") && !choice.equals("INTERSECTION") && !choice.equals("DIFFERENCE") && !choice.equals("COMPLEMENT")) {
                    System.out.println("Invalid choice. Please enter UNION, INTERSECTION, DIFFERENCE, or COMPLEMENT.");
                }
            } while (!choice.equals("UNION") && !choice.equals("INTERSECTION") && !choice.equals("DIFFERENCE") && !choice.equals("COMPLEMENT"));

            System.out.println("\nEnter three colors for the first set:");
            for (int i = 0; i < 3; i++) {
                System.out.print("Color " + (i + 1) + ": ");
                set1[i] = sc.nextLine().toLowerCase();
            }

            System.out.println("Enter three colors for the second set:");
            for (int i = 0; i < 3; i++) {
                System.out.print("Color " + (i + 1) + ": ");
                set2[i] = sc.nextLine().toLowerCase();
            }

            System.out.println("\nResult of " + Name + "'s colors:");

            if (choice.equals("UNION")) {
                String[] result = new String[6];
                int index = 0;

                for (int i = 0; i < 3; i++) {
                    boolean found = false;
                    for (int j = 0; j < index; j++) {
                        if (result[j].equals(set1[i])) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        result[index++] = set1[i];
                    }
                }

                for (int i = 0; i < 3; i++) {
                    boolean found = false;
                    for (int j = 0; j < index; j++) {
                        if (result[j].equals(set2[i])) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        result[index++] = set2[i];
                    }
                }

                System.out.print("Union: [");
                for (int i = 0; i < index; i++) {
                    System.out.print(result[i] + (i < index - 1 ? ", " : ""));
                }
                System.out.println("]");

            } else if (choice.equals("INTERSECTION")) {
                String[] result = new String[3];
                int index = 0;

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {
                        if (set1[i].equals(set2[j])) {
                            result[index++] = set1[i];
                            break;
                        }
                    }
                }

                System.out.print("Intersection: [");
                for (int i = 0; i < index; i++) {
                    System.out.print(result[i] + (i < index - 1 ? ", " : ""));
                }
                System.out.println("]");

            } else if (choice.equals("DIFFERENCE")) {
                String[] result = new String[3];
                int index = 0;

                for (int i = 0; i < 3; i++) {
                    boolean found = false;
                    for (int j = 0; j < 3; j++) {
                        if (set1[i].equals(set2[j])) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        result[index++] = set1[i];
                    }
                }

                System.out.print("Difference: [");
                for (int i = 0; i < index; i++) {
                    System.out.print(result[i] + (i < index - 1 ? ", " : ""));
                }
                System.out.println("]");

            } else if (choice.equals("COMPLEMENT")) {
                String[] result = new String[universalSet.length];
                int index = 0;

                for (int i = 0; i < universalSet.length; i++) {
                    boolean found = false;
                    for (int j = 0; j < 3; j++) {
                        if (universalSet[i].equals(set1[j])) {
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        result[index++] = universalSet[i];
                    }
                }

                System.out.print("Universal Complement: [");
                for (int i = 0; i < index; i++) {
                    System.out.print(result[i] + (i < index - 1 ? ", " : ""));
                }
                System.out.println("]");
            }

            System.out.print("\nWould you like to go again? (yes/no): ");
            goAgain = sc.nextLine().toLowerCase();
        } while (goAgain.equals("yes"));

        System.out.println("\nTHANK YOU BYE-BYE!");
        sc.close();
    }
}
