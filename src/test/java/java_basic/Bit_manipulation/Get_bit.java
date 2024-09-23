package java_basic.Bit_manipulation;

public class Get_bit {

           public static void main(String args[]) {
              int n = 6; //1101
               int pos = 3;
              int bitMask = 1<<pos;


               if((bitMask & n) == 0) {
                   System.out.println("bit was 0");
                } else {
                   System.out.println("bit was 1");
             }
          }
        }


