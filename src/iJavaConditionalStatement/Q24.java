package iJavaConditionalStatement;

import java.util.Scanner;

public class Q24 {
    public static void main(String[] args) {
        /*
        Sayı eşkenar dörtgen yapısını görüntülemek için bir Java programı yazın.

       Test Verileri
       Numarayı girin: 7
       Beklenen Çıktı :


                     1
                    212
                   32123
                  4321234
                 543212345
                65432123456
               7654321234567
                65432123456
                 543212345
                  4321234
                   32123
                    212
                     1
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number:  ");
        int n = scan.nextInt();
        int count = 1;
        int no_of_spaces = 1;
        int start = 0;

        for (int i = 1; i < (n * 2); i++) {

            for (int spc = n - no_of_spaces; spc > 0; spc--) {
                System.out.print(" ");
            }
            if (i < n) {
                start = i;          //for number
                no_of_spaces++;    //for spaces
            } else {
                start = n * 2 - i;   //for number
                no_of_spaces--;      //for space
            }
            for (int j = 0; j < count; j++) {
                System.out.print(start);
                if (j < count / 2) {
                    start--;
                } else {
                    start++;
                }
            }
            if (i < n) {
                count = count + 2;
            } else {
                count = count - 2;
            }

            System.out.println();
        }
    }
}
