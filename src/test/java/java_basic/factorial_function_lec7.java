package java_basic;

import java.util.Scanner;

public class factorial_function_lec7{
    public static void factorial(int n) {
        if (n<1) {
            System.out.println(" invalid");
           return;
        }


        int factorial = 1;


        for (int i = n; i >= 1; i--) {
            factorial = factorial * i;
        }

        System.out.println(factorial);


    }

        public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        factorial(n) ;

    }}
