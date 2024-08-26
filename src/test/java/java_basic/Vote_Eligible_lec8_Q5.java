//Write a function that takes in age as input and returns if that person is eligible to vote or not.
// A person of age > 18 is eligible to vote.

package java_basic;

import java.util.Scanner;

public class Vote_Eligible_lec8_Q5 {
    public static boolean isEligible(int age) {
        return age > 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("Enter your age  ");
        }
        int age = sc.nextInt();
        boolean eligible = isEligible(age);
        if (eligible) {
            System.out.println(" this person is eligible to vote");
        }
            else {
            System.out.println("this person is not eligible to vote");


        }
    }
}
