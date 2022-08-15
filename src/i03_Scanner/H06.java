package i03_Scanner;

import java.util.Scanner;

public class H06 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Kullanicidan ismini ve soyismini isteyip aralarinda bosluk olusturarak asagidaki sekilde yazdirin
        //         Isim - soyisim : Mehmet Bulut
        System.out.println("Isminizi ,ardindan soyisminizi giriniz ");
        String isim = scan.nextLine();
        String soyIsim = scan.nextLine();
        System.out.println("Isim - soyisim : " + isim + " " + soyIsim);
    }
}
