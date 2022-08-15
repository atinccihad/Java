package i08_ifStatements;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        // Kullanicidan bir karakter girmesini isteyin
        // ve girilen karakterin harf olup olmadigini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");
        char krk = scan.next().charAt(0);
        if ((krk >= 'A' && krk <= 'Z') || (krk >= 'a' && krk <= 'z')) {
            System.out.println("Girilen karkter HARF");
        } else {
            System.out.println("Girilen karkter HARF DEGIL");
        }
    }
}
