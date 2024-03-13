import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for matrices: ");
        int row = scanner.nextInt();
        System.out.print("Enter the number of columns for matrices: ");
        int column = scanner.nextInt();

        int[][] matrix1 = new int[row][column];
        int[][] matrix2 = new int[row][column];
        int[][] sum = new int[row][column];

        System.out.println("Enter elements of the first matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Enter elements of the second matrix: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print("Enter element [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                sum[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Sum of two matrices:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}