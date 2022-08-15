package i21_i15_practice;

import java.util.Scanner;

public class Q02 {
    public static void main(String[] args) {
        /*    Kullanıcıdan 1'den büyük bir tam sayı girmesini isteyin
	        ve 1'den girilen tam sayıya kadar olan sayıların karelerinin toplamını
	        hesaplayan kodu yazınız.
	        Örnek Ekran Çıktısı
	        Girilen sayı=4
	        Kareler toplamı=14
	     */
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        System.out.println("1'den buyuk bir tamsayi giriniz");
        int num = scan.nextInt();
        if (num <= 1) {
            System.out.println("1'den buyuk sayi giriniz");
        }
        for (int i = 1; i < num; i++) {
            int ikare = i * i;
            toplam += ikare;
        }
        System.out.println("Girilen sayiya kadar olan sayilarin karelerinin toplami=> " + toplam);
    }
}
