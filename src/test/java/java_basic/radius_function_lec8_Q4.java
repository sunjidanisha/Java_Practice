//Write a function that takes in the radius as input and returns the circumference of a circle.

package java_basic;

import java.util.Scanner;

import static java.lang.Math.PI;

public class radius_function_lec8_Q4 {
    public static double calculateRadius(double radius) {
        return 2 * PI * radius;
    }


public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    {
        System.out.println(" Enter the number ");
    }
    double radius = sc.nextDouble();

    double circumference = calculateRadius ( radius);
        {
            System.out.println("the radius " + circumference);

        }

    }
}
