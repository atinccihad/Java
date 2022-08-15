package iJavaConditionalStatement;

import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) {
        /*
        Tek doğal sayıların n terimlerini ve toplamlarını görüntülemek için Java'da bir program yazın.

        Test Verileri
        Terimlerin giriş sayısı: 5
        Beklenen Çıktı :

        Tek sayılar şunlardır :
        1
        3
        5
        7
        9
        9 Terimine kadar tek Doğal Sayının Toplamı: 25
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number to display the sum of the odd numbers up to the number you entered");
        int num = scan.nextInt();
        int sum = 0;

        for (int i = 0; i <= num; i++) {
            if (i % 2 == 1) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(num + " the Sum of odd Natural Numbers up to the number= " + sum);
    }
}
