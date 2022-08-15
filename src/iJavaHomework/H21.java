package iJavaHomework;

import java.util.Scanner;

public class H21 {
    public static void main(String[] args) {
        /*
        bulundugunuz yerden, bir yere yolculuk edeceksiniz.
        1. Köln veya Frankfurta gidebilirsiniz.
        2. Bilet fiyatı hesabı = Her 20 Km başına 5 euro. örn: (100 km yol. Bilet parası  (100/20)* 5 =25 euro
İPUCU:  toplamTutar, işlem, FrankfurtKm, KmBirimFiyat   gibi sabit veri tipleri oluşturabilirsiniz. İşlemlerde direkt bunları cağırabilirsiniz.
        İLK OLARAK;
        "Nereye yolculuk etmek istiyorsunuz? (Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..)    yazısı gelsin.
    1.    Frankfurt veya Köln olarak bir giriş yapın. (Girdiğiniz sehrin harfleri , girildikten sonra büyük hale gelsin.
       Frankfurt girildiyse,
        örn: girdi= Frankfurt
                case=FRANKFURT:
      Rota = Frankfurt yazdırın.
      Frankfurt km hesabı işlemi yapın.
      son olarak konsolda: Frankfurt 15 Euro         yazsın.
       case: KÖLN ise
      "Rota = Köln" yazdırın.
       km hesabına göre işlemi yapınız.
       son olarak konsolda:  Köln   20 Euro             yazsın.
       2.  Sistem bize "Kaç kişilik bilet istiyorsunuz? (Max 2 kişilik olabilir):   "   sorusunu sorsun.
       case:1  ise
        " 1 kişilik " yazdırın. (1 kişilik seçerseniz bir işlem yapmanıza gerek kalmaz, bilet ücreti yukarıda çoktan belirlenmiş olur.)
        case:2 ise
        "2 kişilik " yazdırın
        2 kişi için bilet fiyatını hesaplayın.
          Son olarak yolculugunuzu check edin;
        konsolda örn:   Frankfurt  - 2 Kişilik    yazsın.
        1.Bakiyemi belirtin.
        2.Toplam Tutarı belirtin.
        3.double paraUstu oluşturun ve hesaplayın.
        4.Double para üstünü yazdırın.
         */
        int kisiSayisi = 0;
        int price = 1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Nereye yolculuk etmek istiyorsunuz? \n(Frankfurt : 60 KM          ---         Köln : 80 KM ---       (20 KM başına 5 euro bilet parası alınmaktadir..) ");
        String rota = scan.next().toUpperCase();


        if (rota.equals("FRANKFURT")) {
            System.out.println("Kisi sayisini giriniz");
            kisiSayisi = scan.nextInt();
            if (kisiSayisi > 2 || kisiSayisi <= 0) {
                System.out.println("1 veya 2 kisilik tercih edebilirsiniz");
            } else {
                price = 15;
                System.out.println("Rota = Frankfurt");
                System.out.println("price = " + kisiSayisi * price);
            }
        } else if (rota.equals("KOLN")) {
            System.out.println("Kac kisilik bilet istiyorsunuz?(Max 2 kişilik olabilir)");
            kisiSayisi = scan.nextInt();
            if (kisiSayisi > 2 || kisiSayisi <= 0) {
                System.out.println("1 veya 2 kisilik tercih edebilirsiniz");
            } else {
                price = 20;
                System.out.println("Rota = Köln");
                System.out.println("price = " + kisiSayisi * price);
            }
        } else {
            System.out.println("Frankfurt veya Köln olarak bir giriş yapın.");
        }


    }
}
