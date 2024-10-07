//Write a program to find if a number is a power of 2 or not.

package java_basic.Bit_manipulation;

import java.util.Scanner;

public class Task01 {
    public static boolean isPowerOfTwo(int n){
        return  n > 0 && (n & (n - 1)) == 0;
/* The key logic is the expression (n & (n - 1)) == 0.
This checks if only one bit is set in the binary representation of n,
which is true for powers of 2. The & operator performs a bitwise AND.
Example: For n = 8 (which is 1000 in binary):
    ->  n - 1 = 7 (which is 0111 in binary).
    ->  8 & 7 results in 0000, so 8 is a power of 2.
*/
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