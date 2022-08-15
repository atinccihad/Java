package iJavaConditionalStatement;

import java.util.Scanner;

public class Q19 {
    public static void main(String[] args) {
        /*
        Floyd'un Üçgenini yazdırmak için Java'da bir program yazın.

        Floyd'un üçgeni, bilgisayar bilimleri eğitiminde kullanılan dik açılı üçgen doğal sayılar dizisidir.
        Robert Floyd'un adını almıştır. Üçgenin satırlarını,
        sol üst köşedeki 1 ile başlayan ardışık sayılarla doldurarak tanımlanır:

        Test Verileri
        Giriş satır sayısı: 5
         */

        int numberOfRows;
        System.out.print("Input number of rows : ");
        Scanner scan = new Scanner(System.in);
        numberOfRows = scan.nextInt();
        int number = 1;
        for (int row = 1; row <= numberOfRows; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print(number + "  ");
                number++;
            }
            System.out.println();
        }
    }
}
