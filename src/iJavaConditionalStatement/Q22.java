package iJavaConditionalStatement;

import java.util.Scanner;

public class Q22 {
    public static void main(String[] args) {
        /*
         Aşağıdaki *üçgenini oluşturmak için bir java programı yazın.

         Test Verileri
         Numarayı girin: 6
         Beklenen Çıktı :

               ******
                *****
                 ****
                  ***
                   **
                    *
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Input the number: ");
        int n = scan.nextInt();
        for (int i = n; i > 0; i--) {
            for (int spc = n - i; spc > 0; spc--) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
