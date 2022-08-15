package i08_ifStatements;

import java.util.Scanner;

public class Q07 {
    public static void main(String[] args) {
        // Kullanicidan bir sifre girmesini isteyin
        // Eger ilk harf buyuk harf ise "A" olup olmadigini kontrol edin
        // Ilk harf "A" ise "Gecerli Sifre" degilse "Gecersiz Sifre" yazdirin
        // Eger ilk harf kucuk harf ise "z" olup olmadigini kontrol edin.
        // Ilk harf "z" ise "Gecerli sifre" degilse "Gecersiz Sifre" yazdirin.
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sifre giriniz");
        String sifre = scan.nextLine();
        char ilkHarf = sifre.charAt(0);

        if (ilkHarf == 'A') {
            System.out.println("Gecerli Sifre");
        } else if (ilkHarf == 'z') {
            System.out.println("Gecerli Sifre");
        } else {
            System.out.println("Gecersiz Sifre");
        }
    }
}
