//Find the maximum & minimum number in an array of integers.
package java_basic.array;

import java.util.Scanner;

public class array1D_MinMax{
    public static void main(String[] args) {
        System.out.println("Enter 2 ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number[] = new int[n];
        System.out.println("Enter two values to compare min max");
        //input
        for (int i =0;i<n;i++){
            number[i] = sc.nextInt();
        }

        int max = Integer.MAX_VALUE;
        int min = Integer.MIN_VALUE;

        // output
        for (int i=0;i< number.length;i++) {
            if (number[i] > min) {
                min = number[i];
            }
            if (number[i] < max) {
                max = number[i];
            }
            }
            System.out.println("Largest number is : " + min);
            System.out.println("Smallest number is : " + max);


    }}
