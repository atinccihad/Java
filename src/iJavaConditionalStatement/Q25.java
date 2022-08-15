package iJavaConditionalStatement;

import java.util.Scanner;

public class Q25 {
    public static void main(String[] args) {
        /*
         Aşağıdaki karakter eşkenar dörtgen yapısını görüntülemek için bir Java programı yazın.

         Test Verileri
         Numarayı girin: 7
         Beklenen Çıktı :

                        A
                       ABA
                      ABCBA
                     ABCDCBA
                    ABCDEDCBA
                   ABCDEFEDCBA
                  ABCDEFGFEDCBA
                 ABCDEFGHGFEDCBA
                ABCDEFGHIHGFEDCBA
                 ABCDEFGHGFEDCBA
                  ABCDEFGFEDCBA
                   ABCDEFEDCBA
                    ABCDEDCBA
                     ABCDCBA
                      ABCBA
                       ABA
                        A
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = scan.nextInt();
        int count = 1;
        int count2 = 1;
        char c = 'A';

        for (int i = 1; i < (n * 2); i++) {
            for (int spc = n - count2; spc > 0; spc--)
            //print space
            {
                System.out.print(" ");
            }
            if (i < n) {
                count2++;
            } else {
                count2--;
            }
            for (int j = 0; j < count; j++) {
                System.out.print(c);//print Character
                if (j < count / 2) {
                    c++;
                } else {
                    c--;
                }
            }
            if (i < n) {
                count = count + 2;
            } else {
                count = count - 2;
            }
            c = 'A';

            System.out.println();
        }
    }
}
