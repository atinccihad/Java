package iJavaConditionalStatement;

import java.util.Scanner;

public class Q04 {
    public static void main(String[] args) {
        /*
        Kayan noktalı bir sayı okuyan ve sayı sıfır ise "sıfır" yazan bir Java programı yazın.
        Aksi takdirde, "pozitif" veya "negatif" yazdırın. Sayının mutlak değeri 1'den küçükse "küçük"
        veya 1.000.000'u aşarsa "büyük" ekleyin.

        Test Verileri
        Bir sayı girin: 25
        Beklenen Çıktı :
        Giriş değeri: 25
        Pozitif sayı
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Write a Java program that reads a floating-point number and prints\n\"zero\" if the number is zero. Otherwise, print \"positive\" or \"negative\". \nAdd \"small\" if the absolute value of the number is less than 1, or \"large\" \nif it exceeds 1,000,000. Go to the editor");
        double input = scan.nextDouble();

        if (input > 0) {
            if (input < 1) {
                System.out.println("Positive small number");
            } else if (input > 1000000) {
                System.out.println("Positive large number");
            } else {
                System.out.println("Positive number");
            }
        } else if (input < 0) {
            if (Math.abs(input) < 1) {
                System.out.println("Negative small number");
            } else if (Math.abs(input) > 1000000) {
                System.out.println("Negative large number");
            } else {
                System.out.println("Negative number");
            }
        } else {
            System.out.println("Zero");
        }
    }
}
