package i09_ternary_switchCase;

import java.util.Scanner;

public class R01 {
    public static void main(String[] args) {
        /*
        Bir aydaki gün sayısını bulmak için bir Java programı yazın.
        (Kullanım Anahtarı Durum) (Mülakat Soru/Sızıntı Yıl)

       Örnek:

        giriş:

        Bir ay numarası girin: 2

        Giriş yılı: 2016

        çıktı :Şubat 2016'da 29 gün var
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir ay numarası girin: ");
        int ayNo=scan.nextInt();

        System.out.println("Yil giriniz");
        int yilNo=scan.nextInt();

        if (yilNo%100!=0&&yilNo%4==0){

        }
    }
}
