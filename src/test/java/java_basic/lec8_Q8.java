// Q.Two numbers are entered by the user, x and n. Write a function to find the value of
// one number raised to the power of another i.e. x^n.Try to convert it into a function on your own.

package java_basic;

import java.util.Scanner;

public class lec8_Q8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        System.out.println(" Enter x ");
        int n = sc.nextInt();
        System.out.println(" Enter n");

        int result = 1;
        for (int i = 0; i < n; i++) {
//On the first iteration, result is 1, so result = 1 * x (which equals x).
//On the second iteration, result is now x, so result = x * x (which equals x^2).
//On the third iteration, result is x^2, so result = x^2 * x (which equals x^3).
            result = result * x;
        }

        System.out.println("x to the power " + result);
    }
}
