import java.util.Scanner;

public class MatrixTranspose {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows and columns: ");
        int r = sc.nextInt(), c = sc.nextInt();

        int[][] a = new int[r][c];
        int[][] t = new int[c][r];

        System.out.println("Enter " + (r * c) + " elements:");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                a[i][j] = sc.nextInt();
                t[j][i] = a[i][j];
            }
        }

        System.out.println("\nOriginal Matrix:");
        for (int[] row : a) {
            for (int x : row) {
                System.out.print(x + "\t");
            }
            System.out.println();
        }

        System.out.println("\nTransposed Matrix:");
        for (int[] row : t) {
            for (int x : row) {
                System.out.print(x + "\t");
            }
            System.out.println();
        }
    }
}
