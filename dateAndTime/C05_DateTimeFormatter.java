package day31_dateAndTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class C05_DateTimeFormatter {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat=LocalDateTime.now();
		
		System.out.println(tarihSaat);//2022-01-14T20:00:30.635343900
		
		// Eger tarih veya saati kendi istedigimiz bicimde yazdirmak istersek
		// gun / ay / yil  saat:dakika
		
		DateTimeFormatter duzenle=DateTimeFormatter.ofPattern("dd / MM / YYYY  HH : mm");
		
		System.out.println(duzenle.format(tarihSaat));// 14 / 01 / 2022  20 : 07
		
		/*
		 * format olustururken gun icin 
		 * d : basta  0 varsa onu yazmadan gun numarasi
		 * dd : tek haneli gunleri 01 gibi basina 0 yazarak
		 * DDD : yilin kacinci gunu
		 * E,EE,EEE :  gun isminin ilk uc harfi
		 * EEEE : isminin tamami
		 * 
		 * AY (Ay icin M, dakika icin m kullanilir)
		 * M : basta 0 varsa onu yazmadan ay numarasi
		 * MM: tek haneli aylari 01 gibi basina sifir yazarak ay numarasi
		 * MMM : Ay isminin ilk 3 harfi
		 * MMM : Ay isminin tamami
		 * 
		 * YY : yilin son iki rakamini
		 * YYYY : yilin tamamini
		 * 
		 * Saat : (24 saat uzerinden istiyorsak H, 12 saat duzeninde istiyorsak h)
		 * 
		 * HH : saat in tamami, tek rakamli saat olursa 02 gibi
		 * H  : tek rakamli saat olursa sadece saati
		 * 
		 * a yazarsak AM veya PM yaziyor
		 */

		
	}

}
