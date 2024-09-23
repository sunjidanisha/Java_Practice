package java_basic.Bit_manipulation;

public class Clear_bit {
    public static void main(String[] args) {
        int n = 5; // 0101 binary
        int pos = 2; // means 3rd position e change korbe
        int bitMask = 1<<pos;
        int notBitMask = ~(bitMask); // not korte  ~ diye bitmask k change kore so 0101 will be 1010

        int NewNumber = notBitMask & n;
        System.out.println(NewNumber);
    }
}
