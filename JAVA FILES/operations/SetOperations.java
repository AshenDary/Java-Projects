package operations;

import java.util.Arrays;

public class SetOperations {
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

        return Arrays.copyOf(result, index);
    }

    public static String[] intersection(String[] set1, String[] set2) {
        String[] result = new String[set1.length];
        int index = 0;

        for (String color : set1) {
            if (contains(set2, color)) {
                result[index++] = color;
            }
        }

        return Arrays.copyOf(result, index);
    }

    public static String[] difference(String[] set1, String[] set2) {
        String[] result = new String[set1.length];
        int index = 0;

        for (String color : set1) {
            if (!contains(set2, color)) {
                result[index++] = color;
            }
        }

        return Arrays.copyOf(result, index);
    }

    public static String[] universalComplement(String[] set, String[] universalSet) {
        String[] result = new String[universalSet.length];
        int index = 0;

        for (String color : universalSet) {
            if (!contains(set, color)) {
                result[index++] = color;
            }
        }

        return Arrays.copyOf(result, index);
    }

    public static boolean contains(String[] array, String value) {
        for (String element : array) {
            if (element != null && element.equals(value)) {
                return true;
            }
        }
        return false;
    }
}