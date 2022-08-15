package iJavaConditionalStatement;

import java.util.Scanner;

public class Q26 {
    public static void main(String[] args) {
        /*
         Tamsayı okuyan bir Java programı yazın ve negatif,
         sıfır veya pozitif olup olmadığını kontrol edin.

         Test Verileri
         Bir sayı girin: 7
         Beklenen Çıktı :

         Sayı pozitif
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number: ");
        int n = scan.nextInt();

        if (n > 0) {
            System.out.println("Number is positive");
        } else if (n < 0) {
            System.out.println("Number is negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}
