package i25_constructor;

import java.util.Scanner;

public class R02 {
    public static void main(String[] args) {
        /*
        Ana yöntemde bir öğrencinin değişkenlerini oluşturun
        ve bu değişkenleri atamayı kullanın Changename adında bir yöntem oluşturun,
        parametre olarak öğrenci bilgileri alın ve yöntemdeki tüm bilgileri değiştirin
        ve yeni bilgileri ekleyin yazdırın Rename yöntemini çağırdığımız satır 
        Ana yöntem hemen ardından öğrenci bilgilerini yeniden yazdırır changeSurname adında bir yöntem oluşturun,
        parametre değişkeni alırken bu yöntem "lastname" olur. Yöntemde, 
        kullanıcıdan yeni bir soyadı girmesini ve eski soyadını değiştirmesini isteyin (yani can).
         */

        String ogrenciIsim="Ali";
        String soyIsim="Can";

        System.out.println("Ilk basta "+ogrenciIsim+" olarak tanimlanan isim method calistiktan sonra: "+changeName(ogrenciIsim));
        System.out.println("Ilk basta "+soyIsim+" olarak tanimlanan soyisim method calistiktan sonra: "+changeSurname(soyIsim));

    }

    private static String changeSurname(String soyIsim) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Soyisim giriniz");
        soyIsim=scan.nextLine();

        return soyIsim;
    }

    private static String changeName(String ogrenciIsim) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Isim giriniz");
        ogrenciIsim=scan.nextLine();

        return ogrenciIsim;
    }


}
