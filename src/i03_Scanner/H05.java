package i03_Scanner;

import java.util.Scanner;

public class H05 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Kullanicidan ismini ve soyismini isteyip asagidaki sekilde yazdirin
        //         Isminiz : Mehmet
        //         Soyisminiz : Bulut
        //         Kursumuza katiliminiz alinmistir, tesekkur ederiz
        System.out.println("Lutfen isminizi giriniz ve ENTER a basin \n, soyisminizi giriniz ve ENTER a basin");
        String isim = scan.nextLine();
        String soyIsim = scan.nextLine();

        System.out.println("Isminiz : " + isim + "\nSoyisminiz : " + soyIsim + "\nKursumuza katiliminiz alinmistir, tesekkur ederiz");
    }
}
