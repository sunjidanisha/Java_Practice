// Take an array of names as input from the user and print them on the screen.

package java_basic.array;

import java.util.Scanner;

public class array1D_input_output {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of names ");
        int size = sc.nextInt();

        String names[] = new String[size];

        System.out.println("enter the names ");
        //input
        for(int i=0; i<size; i++) {
            names[i] = sc.next();
        }

        //output
        for(int i=0; i<names.length; i++) {
            System.out.println("name " + (i+1) +" is : " + names[i]);
        }

    }

}
