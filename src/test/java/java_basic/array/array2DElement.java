//Searching for an element x in a matrix.

package java_basic.array;

import java.util.Scanner;

public class array2DElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row and column number ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int[][] numbers = new int[rows][cols];
        System.out.println("Create a matrix based on the row and column you have mentioned ");
        //input
        //rows
        for (int i = 0; i < rows; i++) {
            //cols
            for (int j = 0; j < cols; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }
        System.out.println("consider a number from the matrix as X to find the location");
        int x = sc.nextInt();

        // find x element
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (numbers[i][j] == x) {
                    System.out.println("X found at location " + i + " , " + j );

                }

            }
        }
    }
}