package i07_ifStatements;

import java.util.Scanner;

public class C05_ifElseStatements {
    public static void main(String[] args) {
        // Kullanicidan bir karakter girmesini isteyin ve girilen karakterin harf olup olmadigini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Harf olup olmadigini sorgulamak icin bir karakter giriniz");
        char krk = scan.next().charAt(0);

        if ((krk >= 'a' && krk <= 'z') || (krk >= 'A' && krk <= 'Z')) {
            System.out.println("Girdiginiz karakter HARF");
        } else {
            System.out.println("Girdiginiz karakter HARF DEGIL");
        }

    }
}
