//For a given matrix of N x M, print its transpose.
package java_basic.array;

import java.util.Scanner;

public class array2D_transpose {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a row and column ");
        int n = sc.nextInt();
        int m = sc.nextInt();

        int [][] matrix = new int[n][m];

        System.out.println("Enter matrix numbers ");

        //input
        for (int i=0; i<n;i++) {
            for (int j = 0; j < m; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }
        //transpose = ulta hobe matrix
        System.out.println("The matrix transpose ");
        for (int j=0; j<m; j++){
            for (int i=0; i<n; i++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }


        }
    }

