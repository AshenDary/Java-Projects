//Noel, Jared L.
//COM 244
//2d array

public class twodarray {
        
    public static void main(String[] args) {

        int[][] table = new int[10][10];


        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                table[i - 1][j - 1] = i * j;
            }
        }

        System.out.println();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.printf("%4d", table[i][j]);
            }
            System.out.println();
        }
    }
}
