//Q.Make a half pyramid pattern

package java_basic;

public class nested_pattern2 {
    public static void main(String[] args) {
        int n = 5;
        //outer loop
        // for (int i = 1; i<=n; i--) {

        //inner loop
        //for ( int j = 1;j<=i; j++)

        // {
        //  System.out.print("*");
        //  }
        //   System.out.println();
        // }
        // }
//}
// for (int i = n; i>=1; i--) for inverted half pyramid

// for 180 rotate half pyramid
        //for (int i = 1; i <= n; i++) {

        //inner loop for empty space
        // for (int j = 1; j <= n - i; j++) {
        //    System.out.print(" ");
        //  }
        //  {
        //      for (int j = 1; j <= i; j++)
        //          System.out.print("*");
        //      System.out.println();
        //  }
        // }
        //}}

// half pyramid with numbers

        // for (int i = 1; i<= n; i++) {
        //    for (int j = 1; j <= i; j++) {
        //    System.out.print(j + " ");

        //  }
        //  System.out.println();
        // }
        // }

//}

// fluid numbers
      //  int number = 1;

       // for (int i = 1; i <= n; i++) {
       //     for (int j = 1; j <= i; j++) {
        //        System.out.print(number+" ");
        //        number++;
        //    }
        //        System.out.println();
         //   }
      //  }
 //}

        // 0-1 triangle
     for (int i=1;i<=n;i++)
     {for (int j=1;j<=i;j++) {
         int sum = i + j;
         if (sum % 2 == 0) {
             System.out.print("1 ");
         } else {
             System.out.print("0 ");
         }

     }
         System.out.println();
     }
    }
}

