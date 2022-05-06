package Day_06_ForLoop;

import java.util.Scanner;

public class Q_11 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		 /*
        Bir sayinin mükemmel olup olmadiðini bulan bir program yaziniz.
        Mükemmel sayi : bir sayinin kendisi hariç bölenlerinin toplamý, kendisine eþitse o sayi mükemmeldir.
        ORNEK:
        INPUT     : 6
        OUTPUT : 1,2,3
                      1+2+3 = 6 = 6 (Mükemmel)
                      mukemmel sayi kontrolu
                      1. kullanicidan sayi alalim
                      2. bir toplam degiskeni olusturuyoruz
                      3. sayinin bolenleri bul
                      4. bolenleri toplamla topla
                      5. sayiyla toplamin esitligini kontrol et
        */
		Scanner scan=new Scanner(System.in);
		System.out.println("mukemmel oldugunu kontrol icin sayi girin ");
		int sayi=scan.nextInt();
		
		int bolenToplam=0;
		
		for (int i = 1; i < sayi; i++) {
			
		}
		
	}

}
