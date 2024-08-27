package java_basic.array;

import java.util.Scanner;

public class spiral_matrix_2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and columns: ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        // matrix
        int[][] matrix = new int[rows][cols];
        System.out.println("Enter the elements of the matrix: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }

        // creating boundary
        int top = 0;
        int bottom = rows - 1;
        int left = 0;
        int right = cols - 1;

        System.out.println("The spiral order of the matrix is: ");

        while (top <= bottom && left <= right) {
            // top row
            for (int j = left; j <= right; j++) {
                System.out.print(matrix[top][j] + " ");
            }
            top++;

            // right column
            for (int i = top; i <= bottom; i++) {
                System.out.print(matrix[i][right] + " ");
            }
            right--;

            // bottom row
            {
                for (int j = right; j >= left; j--) {
                    System.out.print(matrix[bottom][j] + " ");
                }
                bottom--;
            }

            // left column
            {
                for (int i = bottom; i >= top; i--) {
                    System.out.print(matrix[i][left] + " ");
                }
                left++;
            }
        }
    }
}
