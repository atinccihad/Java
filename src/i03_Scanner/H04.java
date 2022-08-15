package i03_Scanner;

import java.util.Scanner;

public class H04 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Kullanicidan prizmanin uzun,kisa kenarlarini ve tuksekligini isteyip
        //        prizmanin hacmini hesaplayip yazdirin
        System.out.println("Lutfen  prizmanin uzun,kisa kenarlarini ve tuksekligini sirasiyla giriniz");
        double uzunKenar = scan.nextDouble();

        double kisaKenar = scan.nextDouble();
        double prizmaYukseklik = scan.nextDouble();

        System.out.println("Prizma hacmi=> " + (uzunKenar * kisaKenar / 2) * prizmaYukseklik);

    }
}
