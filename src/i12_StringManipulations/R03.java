package i12_StringManipulations;

import java.util.Scanner;

public class R03 {
    public static void main(String[] args) {
        /*
        Verilen iki sayının (sıfırdan büyük veya sıfıra eşit) toplamını hesaplayan ve yazdıran bir Java programı yazın.
        Verilen tamsayılar veya toplam 10'dan fazla basamakli olursa, "OverFlow" yazdırın.

        Ornek:

        INPUT      :

        25

        46

        OUTPUT :

        Numaralarin Toplami: 71
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Toplanmasini istediginiz sayilari giriniz");
        Integer sayi1 = scan.nextInt();
        Integer sayi2 = scan.nextInt();

        if (sayi1 <= 0 || sayi2 <= 0) {
            System.out.println("Program negative sayilar icin tasarlanmadi");
        } else if (sayi1 + sayi2 < 100000000) {
            System.out.println(sayi1 + sayi2);
        } else {
            System.out.println("OverFlow");
        }
    }
}
