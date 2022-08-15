package i07_ifStatements;

import java.util.Scanner;

public class Q05 {
    public static void main(String[] args) {
        // Kullanicidan bir gun alin
        // Gun "Cuma" ise => "Muslumanlar icin kutsal gun"
        // Gun "Cumartesi" ise => "Yahudiler icin kutsal gun"
        // Gun "Pazar" ise => "Hristiyanar icin kutsal gun"
        // yazdiriniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen gun giriniz");
        String gun = scan.next().toLowerCase();

        if (gun == "cuma") {
            System.out.println("Muslumanlar icin kutsal gun");
        }
        if (gun == "cumartesi") {
            System.out.println("Yahudiler icin kutsal gun");
        }
        if (gun == "pazar") {
            System.out.println("Hristiyanar icin kutsal gun");
        }
    }
}
