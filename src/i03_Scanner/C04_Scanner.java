package i03_Scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // Kullanicidan ismini isteyin
        // girilen ismi
        // isminiz : Ismail seklinde yazdirin

        // insanlarin dunyasindan kod'larimizin bulundugu class'a deger almak icin
        // Scanner classWini kullaniriz

        // 1- Scanner objesi olusturalim
        Scanner scan = new Scanner(System.in);

        // 2- Kullaniciya ne istedihimizi soyleyelim
        System.out.println("Lutfen isminizi giriniz");

        // 3- Olusturdugumuz scan objesi ile kullanicinin girdigi degeri alip
        //    olusturacagimiz uygun bir variable'a atayalim

        String kullaniciIsmi = scan.next();

        System.out.println("Isminiz : " + kullaniciIsmi);
    }
}
