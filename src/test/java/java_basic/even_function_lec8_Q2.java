//Make a function to check if a given number n is even or not
//Make a function to print the table of a given number n.
package java_basic;

import java.util.Scanner;

public class even_function_lec8_Q2{
    public static int evenNumber (int n){
        return n;
    }

    public static boolean IsEven (int number) {
        if (number % 2 == 0) {
            return true;
        }
return false;

}



public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number:");
    int n = sc.nextInt();

    int even = evenNumber(n);
    
    if (IsEven(even)){
        System.out.println(" even ");
    } else {
        System.out.println("odd ");

       }
    }
}