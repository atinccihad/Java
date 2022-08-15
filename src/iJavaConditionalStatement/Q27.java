package iJavaConditionalStatement;

import java.util.Scanner;

public class Q27 {
    public static void main(String[] args) {
        /*
        Kayan noktalı sayı okuyan bir Java programı yazın. Sayı sıfır ise "sıfır" yazdırır, aksi takdirde "pozitif" veya "negatif"yazdırır. Sayının mutlak değeri 1'den küçükse "küçük" veya 1.000.000'u aşarsa "büyük" ekleyin. Editöre git

        Test Verileri
        Bir numara girin: -2534
        Beklenen Çıktı :

        Olumsuz
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("Input a number: ");
        double n = scan.nextDouble();

        if (n > 0) {
            if (n < 1) {
                System.out.println("Positive small");
            } else if (n > 1000000) {
                System.out.println("Positive large");
            } else {
                System.out.println("Positive");
            }
        } else if (n < 0) {
            if (Math.abs(n) < 1) {
                System.out.println("Negative small");
            } else if (Math.abs(n) > 1000000) {
                System.out.println("Negative large");
            } else {
                System.out.println("Negative");
            }
        } else {
            System.out.println("Zero");
        }
    }
}
