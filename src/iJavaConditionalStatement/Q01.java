package iJavaConditionalStatement;

import java.util.Scanner;

public class Q01 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir numara almak için bir Java programı yazın ve pozitif mi yoksa negatif mi olduğunu yazdırın.

        Test Verileri
        Giriş numarası: 35
        Beklenen Çıktı :
        Sayı pozitif
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter an integer to check for positive and negative.");
        int num = scan.nextInt();
        if (num > 0) {
            System.out.println("Pozitive");
        } else if (num < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Number is zero");
        }
    }
}
