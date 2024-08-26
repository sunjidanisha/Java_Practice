package java_basic;

import java.util.Scanner;

public class Fibonacci_lec8_Q10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number to see fibonacci series ");
        int n = sc.nextInt();
        int first_num = 0;
        int second_num = 1;
        int temp;

        {
            System.out.print(" " +first_num);
        }
        {
            if (n > 1) //  jate total number tay 1 theke count hoy
            {
                for (int i = 1; i <= n; i++){
                    {
                        System.out.print( " "+second_num);
                    }
                   // swapping concept
                     temp = second_num; //swapping to 2nd num then 1st number
                     second_num = first_num + second_num; // 0+1+1
                     first_num = temp; // same as
                  }


            System.out.println();
        }
            else System.out.println(" invalid");
    }
}}