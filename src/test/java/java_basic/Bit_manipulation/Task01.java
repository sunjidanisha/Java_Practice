//Write a program to find if a number is a power of 2 or not.

package java_basic.Bit_manipulation;

import java.util.Scanner;

public class Task01 {
    public static boolean isPowerOfTwo(int n){
        return  n > 0 && (n & (n - 1)) == 0;

    }

    public static void main(String[] args) {


    Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
    int number = sc.nextInt();

        if (isPowerOfTwo(number)) {
        System.out.println(number + " is a power of 2.");
    } else {
        System.out.println(number + " is not a power of 2.");
    }

}
}