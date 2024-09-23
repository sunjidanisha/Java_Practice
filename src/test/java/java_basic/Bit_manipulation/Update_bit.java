package java_basic.Bit_manipulation;

import java.util.Scanner;

public class Update_bit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int oper = sc.nextInt();
        int n = 5; //binary 0101>>0111>> decimal 7
        int pos = 1;
        int bitMask = 1<<pos;
        if (oper == 1) {


            int NewNumber = bitMask | n;
            System.out.println(NewNumber);
        }
            else {
                int newBitMask = ~ (bitMask);
                int NewNumber = bitMask & n;
                System.out.println(newBitMask);
        }
        


    }
}
