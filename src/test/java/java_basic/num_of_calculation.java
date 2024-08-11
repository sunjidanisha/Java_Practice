package java_basic;

import java.util.Scanner;

public class num_of_calculation {

    public static void main(String[] args) {
        Scanner practice = new Scanner(System.in);
        System.out.println("enter a number");
        int a = practice.nextInt();

        System.out.println("enter another number");
        int b = practice.nextInt();

// number of calculation
        int summation =(a+b);
        int multiplication =(a*b);
        int division =(a/b);
        System.out.println("summation is" +summation);
        System.out.println("summation is" +multiplication);
        System.out.println("summation is" +division);

// area calculation
        System.out.println("radius");
        double radius = practice.nextDouble();



    }
}

