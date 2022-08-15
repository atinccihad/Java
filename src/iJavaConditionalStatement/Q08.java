package iJavaConditionalStatement;

import java.util.Scanner;

public class Q08 {
    public static void main(String[] args) {
        /*
        Kullanıcının alfabeden tek bir karakter sağlaması için gereken bir Java programı yazın.
        Kullanıcı girdisine bağlı olarak Sesli harf veya Ünsüz yazdırın.
        Kullanıcı girişi bir harf değilse (a ve z veya A ve Z arasında) veya uzunluk> 1 dizesiyse, bir hata mesajı yazdırın.

        Test Verileri
        Bir alfabe girin: p
        Beklenen Çıktı :
        Giriş harfi Ünsüzdür
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("press a key to query from your keyboard");
        char key = scan.next().charAt(0);
        if (key >= 'a' && key <= 'z' || key >= 'A' && key <= 'Z') {
            if (key >= 'a' && key <= 'z') {
                if (key == 'a' || key == 'e' || key == 'i' || key == 'o' || key == 'u') {
                    System.out.println("the entered character is a small vowel letter");
                } else System.out.println("the entered character is a small consonant letter");
            } else if (key >= 'A' && key <= 'Z') {
                if (key == 'A' || key == 'E' || key == 'I' || key == 'O' || key == 'U') {
                    System.out.println("the entered character is a capital vowel");
                } else System.out.println("the entered character is a capital consonant letter");
            }
        } else {
            System.out.println("The entered character \n" +
                    "Not a letter");
        }
    }
}
