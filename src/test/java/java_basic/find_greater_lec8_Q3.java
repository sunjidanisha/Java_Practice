//Write a function which takes in 2 numbers and returns the greater of those two

package java_basic;


public class find_greater_lec8_Q3{
    public static int findGreater(int a, int b) {

        return Math.max(a, b);

    }

public static void main(String[] args) {
    int a = 7;
    int b= 12;
    int greater = findGreater(a,b);
    System.out.println("greater number is " +greater);


}}
