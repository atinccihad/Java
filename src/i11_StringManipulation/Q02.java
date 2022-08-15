package i11_StringManipulation;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        /*
        Kullanicidan bir cumle ve bir kelime isteyin
        kelimenin cumledeki kullanimina bakarak asagidaki 3 cumleden uygun olani yazdirin
           - Girilen kelime cumlede kullanilmamis.
           - Girilen kelime cumlede 1 kere kullanilmis
           - Girilen kelime cumlede 1'den fazla kullanilmis
         */
        System.out.println("Lutfen bir cumle  giriniz\nArdindan bir kelime girin");
        String cumle = scan.nextLine();
        String kelime = scan.next();

        int kelimeIndex = cumle.indexOf(kelime);
        int sonrakiKelimeIndex = cumle.indexOf(kelime, kelimeIndex + 1);

        if (cumle.indexOf(kelime) < 0) {
            System.out.println("Girilen kelime cumlede kullanilmamis.");
        } else if (cumle.indexOf(kelime) >= 0) {
            if (sonrakiKelimeIndex > kelimeIndex) {
                System.out.println("Girilen kelime cumlede 1'den fazla  kullanilmis.");
            } else {
                System.out.println("Girilen kelime cumlede 1 kere kullanilmis.");
            }
        }

    }
}
