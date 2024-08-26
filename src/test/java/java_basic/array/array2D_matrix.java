//Taking a matrix as an input and printing its elements like rows and columns

package java_basic.array;

import java.util.Scanner;

public class array2D_matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [][] numbers = new int [rows][cols]; //2D array


        //inputs
        //rows
        for (int i =0;i<rows;i++){

            //cols
            for (int j=0;j<cols;j++) {
                numbers[i][j] = sc.nextInt();
            }

        }

        for (int i =0;i<rows;i++){
            for (int j=0;j<cols;j++) {
                System.out.print(numbers[i][j] + " ");

            }
            System.out.println();
    }

}

}
