// Taking an array as an input and printing its elements

package java_basic.array;
import java.util.Scanner;

public class array1D_input {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int n= sc.nextInt();
                int numbers[] = new int[n];


                for(int i=0; i<n; i++) {
                    numbers[i] = sc.nextInt();
                }


                //print the numbers in array
                for (int i=0; i<numbers.length; i++) {
                    System.out.print(numbers[i]+" ");
                }
            }
        }


