package iJavaConditionalStatement;

import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        /*
        Doğal sayıların n terimlerini ve toplamlarını görüntülemek için Java'da bir program yazın.

        Test Verileri
        Numarayı girin: 2
        Beklenen Çıktı :

        Giriş numarası:
        2
        İlk n doğal sayılar şunlardır :
        1
        2
        n terimine kadar olan Doğal Sayının Toplamı :
        3
         */
        Scanner scan = new Scanner(System.in);
        int sum = 0;
        System.out.println("enter a number to find the sum of the numbers up to the entered natural number");
        int num = scan.nextInt();

        if (num >= 0) {
            for (int i = 0; i <= num; i++) {
                sum += i;
            }
        } else {
            for (int i = num; i <= 0; i++) {
                sum += i;
            }
        }
        System.out.println("the sum of the natural numbers up to the term= " + sum);
    }
}
