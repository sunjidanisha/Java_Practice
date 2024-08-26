//make a function to add 2 numbers and return to the sum
package java_basic;

import java.util.Scanner;

public class function_sum {
    public static int CalculateSum(int a,int b) {
        int sum = a+b;
        {
            System.out.println("loading...... ");
        }
        return sum;

}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
    int sum = CalculateSum(a, b);
        System.out.println("the total number of sum is " +sum);
    }

}
