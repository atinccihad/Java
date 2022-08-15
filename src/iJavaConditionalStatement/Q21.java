package iJavaConditionalStatement;

import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        /*
        Pascal'ın üçgenini görüntülemek için bir Java programı yazın. Editöre git

        Test Verileri
        Giriş satır sayısı: 5
        Beklenen Çıktı :

                 Giriş satır sayısı: 5
                  1
                  1 1
                  1 2 1
                  1 3 3 1
                  1 4 6 4 1
         */
        int no_row, c = 1, blk, i, j;
        System.out.print("Input number of rows: ");
        Scanner scan = new Scanner(System.in);
        no_row = scan.nextInt();
        for (i = 0; i < no_row; i++) {
            for (blk = 1; blk <= no_row - i; blk++)
                System.out.print(" ");
            for (j = 0; j <= i; j++) {
                if (j == 0 || i == 0)
                    c = 1;
                else
                    c = c * (i - j + 1) / j;
                System.out.print(" " + c);
            }
            System.out.print("\n");
        }
    }
}
