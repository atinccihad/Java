package iJavaConditionalStatement;

import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        /*
        Deseni elmas gibi görüntülemek için Java'da bir program yazın.

       Test Verileri
       Satır sayısını girin (elmasın yarısı): 7
       Beklenen Çıktı :


                         *
                        ***
                       *****
                      *******
                     *********
                    ***********
                   *************
                    ***********
                     *********
                      *******
                       *****
                        ***
                         *
         */
        int i, j, r;
        System.out.print("Input number of rows (half of the diamond) : ");
        Scanner scan = new Scanner(System.in);
        r = scan.nextInt();
        for (i = 0; i <= r; i++) {
            for (j = 1; j <= r - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for (i = r - 1; i >= 1; i--) {
            for (j = 1; j <= r - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2 * i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

    }
}
