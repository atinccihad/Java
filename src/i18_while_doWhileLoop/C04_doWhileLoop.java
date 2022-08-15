package i18_while_doWhileLoop;

import java.util.Scanner;

public class C04_doWhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan tamsayilar alin
        Kullanici cift sayi girdigi muddetce sayilari yazdirin
        Tek sayi girdiginde islemi bitirin.
         */
        Scanner scan = new Scanner(System.in);
        int sayi = 0;

        // while ile
        /*
        Loop'larda kullanacagimiz variable'lari loop'dan once olusturmaliyiz
        while loop'da loop'dan once olusturdugumuz bu variable'a
        atayacagimiz degeri iyi dusunmeliyiz.
         */

        while (sayi % 2 == 0) {
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("Girilen sayi cift" + sayi);
            } else {
                System.out.println("Girilen sayi tek");
            }
        }

        // do while ile
        // do while loop'da onceden olusturulan variable'a
        // hangi deger atandiginin hicbir onemi yok
        // kodumuz her durumda calisir.
        /*
        do-while'in dez avantaji:
        ilk calistirma kontrolsuz oldugu icin
        loop'un body'sinde yanlis bir islem yapilmamasina dikkat etmek gerekir.
         */

        do {
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("Girilen sayi cift" + sayi);
            } else {
                System.out.println("Girilen sayi tek");
            }
        } while (sayi % 2 == 0);

    }
}
