package Day_06_ForLoop;

import java.util.Scanner;

public class Q_12 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*  Kullan�c�dan 1'den b�y�k bir tam say� girmesini isteyin
        ve 1'den girilen tam say�ya kadar olan say�lar�n karelerinin toplam�n�
        hesaplayan kodu yaz�n�z.
        �rnek Ekran ��kt�s�
       Girilen say�=4
       Kareler toplam�=30
    */


       Scanner scanner = new Scanner(System.in);

       System.out.print("Bir tamsay� giriniz: ");
       int sayi = scanner.nextInt();
       int toplam = 0;

       for (int i = 1; i < sayi; i++) {

           toplam = (i * i) + toplam;

       }
       System.out.println("Say�lar�n kareleri toplam�: " + toplam);
	}

}
