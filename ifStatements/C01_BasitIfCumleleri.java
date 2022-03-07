package day07_ýfStatements;

import java.util.Scanner;

public class C01_BasitIfCumleleri {

	public static void main(String[] args) {
		/*
		 * Soru 2) Kullanicidan gun isimlerinden birinin ilk harfini isteyin
		 * ve o harfle baslayan gun isimleri yazdirin
		 * Ornek: ilkHarf=P   output = "Pazar, Pazartesi veya Persembe"
		 * ilkHarf=S output="Sali"
		 * Buyuk kucuk  harf problem olmamasi icin toUpperCase methodunu kullanin
		 * ilkHarf=C  output=Carsamba,Cuma veya Cumartesi
		 */
		
		Scanner scan= new Scanner(System.in);
		System.out.println("Lutfen gun isimlerinden birinin ilk harfini yaziniz");
		// Kullanicinin girdigi verinin tamamini kucuk harf veya buyuk harf yapoabiliriz
		// scan.next()  ten sonra  toUpperCase yazarsak kelimeyi buyuk harfe 
		// toLowerCase yazarsak kelimenin tamamini kucuk harfe cevirmis oluruz
		
		char ilkHarf=scan.next().toUpperCase().charAt(0);
		
		if (ilkHarf=='P') {
		    System.out.println("Pazar, Pazartesi veya Persembe");
				}
		
		
		if (ilkHarf=='S') {
			System.out.println("Sali");
		}
		
		if (ilkHarf=='C' || ilkHarf=='c') {
			System.out.println("Carsamba,Cuma veya Cumartesi");
		}
		
		if (ilkHarf!='C' && ilkHarf!='P' && ilkHarf!='S') {
		System.out.println("Gecersiz harf girdiniz.Lutfen gun isimlerinden birinin basharfini yazin");
		
		scan.close();
			
		}
	}

}
