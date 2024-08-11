// Q: Make a Calculator. Take 2 numbers (a & b) from the user and an operation as follows :
// 1 : + (Addition) a + b
//2 : - (Subtraction) a - b
//3 : * (Multiplication) a * b
//4 : / (Division) a / b
//5 : % (Modulo or remainder) a % b
//Calculate the result according to the operation given and display it to the user.


package java_basic;

import java.util.Scanner;

public class simple_calculator {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        {
            System.out.println("enter the first number");
        }
        int  a = sc.nextInt();
        {
            System.out.println("enter the second number");
        }
        int b = sc.nextInt();


        System.out.println("choose a operation");
        System.out.println("1 : + ( a + b)");
        System.out.println("2 : - (a - b)");
        System.out.println("3 : * (a * b)");
        System.out.println("4 : / (a / b)");
        System.out.println("5 : % ( a % b)");

        int operation = sc.nextInt();

        int result = 0;

        switch (operation) {
            case 1:
                result = a + b;
                System.out.println("the result  " + a + "+" + b + "is:" + result);
                break;
            case 2:
                result = a - b;
                System.out.println("the result  " + a + "-" + b + "is:" + result);
                break;
            case 3:
                result = a * b;
                System.out.println("the result  " + a + "*" + b + "is:" + result);
                break;
            case 4:
                if (a != 0) {
                    result = a / b;
                    System.out.println("the result  " + a + "/" + b + "is:" + result);
                } else {
                    System.out.println("error");
                }
                    break;
                    case 5:
                        if (a != 0) {
                            result = a % b;
                            System.out.println("the result  " + a + "%" + b + "is:" + result);
                        } else {
                            System.out.println("error");

                        }

                }
        }
    }