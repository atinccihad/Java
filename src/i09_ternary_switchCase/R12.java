package i09_ternary_switchCase;

import java.util.Scanner;

public class R12 {
    public static void main(String[] args) {
        /*
        Kullanıcıya Adı, Soyadı ve kredi kartı numaralarını sorarak verilen formata ceviren java kodunu yaziniz.

        Input :

        John White

        1234234534561478

        Output : Name :

        J*** W****

        CCN  : **** **** **** 1478

        * Ilk Harfler Buyuk harf ile baslamalidir.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen Ad, Soyad ve kredi kartı numaranizi giriniz");
        String ad = scan.nextLine();
        String soyad = scan.next();
        String kkNo = scan.next();

        System.out.println("Name :\n" + ad.toUpperCase().charAt(0) + ad.substring(1).replaceAll("\\w", "*") + " " + soyad.toUpperCase().charAt(0) + soyad.substring(1).replaceAll("\\w", "*"));
        System.out.println("CCN  :\n" + kkNo.substring(0, 4).replaceAll("\\d", "*") + " "
                + kkNo.substring(4, 8).replaceAll("\\d", "*") + " "
                + kkNo.substring(8, 12).replaceAll("\\d", "*") + " "
                + kkNo.substring(12));
    }
}
