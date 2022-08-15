package i03_Scanner;

import java.util.Scanner;

public class H07 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Kullanicidan ismini alip isminin bas harfini yazdirin.
        System.out.println("Isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("Isminizin bas harfi=> " + isim.charAt(0));
    }
}
