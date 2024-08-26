//Make a function to check if a number is prime or not
package java_basic;

import java.util.Scanner;

public class Prime_Check_lec7 {


    public static int PrimeCheck(int n) {
        return n;
    }

    // Method to check if a number is prime
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true; // 2 is the only even prime number
        }
        if (number % 2 == 0) {
            return false; // 2 bade other even numbers are not prime
        }
        // 3+ gulo i*i diye borgomul kore ta jodi borgomul purno shongkha hoy tahole false otherwise true
        for (int i = 3; i* i <= number; i+=2) {
           if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();


        // Calculate
        int prime = PrimeCheck(n);


        if (isPrime(prime)) {
            System.out.println("The " + prime + " is a prime number.");
        } else {
            System.out.println("The " + prime + " is not a prime number.");


        }
    }
}