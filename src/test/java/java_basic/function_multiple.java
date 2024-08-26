package java_basic;

import java.util.Scanner;

public class function_multiple {
    public static int calculateMultiple(int a,int b) {
        int  multiply = a * b;
        return multiply;


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int multiply = calculateMultiple( a, b);
        {
            System.out.println(" total number " +multiply);

    }
}}
