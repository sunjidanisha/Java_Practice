package java_basic.Bit_manipulation;

public class Set_bit {
    public static void main(String[] args) {
        int n =  8 ;
        int pos = 1; // means 2nd no position e set korbe.
        int bitmask = 1<<pos; // n er sathe positon compare korte hobe

        int newNumber = bitmask | n;
        System.out.println(newNumber);

    }

}
