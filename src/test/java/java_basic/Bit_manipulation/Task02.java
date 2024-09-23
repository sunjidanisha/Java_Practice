//Write a program to toggle a bit a position = “pos” in a number “n”.
package java_basic.Bit_manipulation;

public class Task02 {
    public static void main(String[] args) {
        int n =  4 ; //0100
        int pos = 1;
        int bitmask = 1<<pos; // This will be 2 (binary 0010)

        int newNumber = n ^ bitmask ; //Toggle the bit in n at position pos will be>> 110 >> 6 in decimal
        System.out.println(newNumber);

    }
}
