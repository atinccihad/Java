package day14_15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		// Kullanicidan iki sayi isteyin
		// sayilarin karelerini ve küplerini toplayan iki ayri method yazdiran
		// kullaniciya üs sorun
		// 2 yazarsa kareleri toplamini yapan method
		// 3 yazarsa küpler toplamini yapan method calissin
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen iki sayiyi giriniz \nilk sayidan sonra enter'a basin");
		
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("girilen sayilarin kareler toplamini istiyorsaniz 2 \nkupler toplamini istiyorsaniz 3'e basin");
		int secim=scan.nextInt();
		
		switch(secim) {
		
		case 2:   kareTopla(sayi1,sayi2);
		   break;
		 
		case 3:   kupTopla(sayi1,sayi2);
		   break;
		default:
			System.out.println("Lutfen istenen tercihlerden birini yapin");
		}
		
		//kupTopla(sayi1,sayi2);methodu olusturmak icin kupTopla gibi bir degisken olusturmamiz gerekiyordu 
                              //methodu olusturduktan sonra ona gerek kalmadigi icin yorum satiri haline cevirdik
		
		
		//kareTopla(sayi1,sayi2);  methodu olusturmak icin kareTopla gibi bir degisken olusturmamiz gerekiyordu 
		                         //methodu olusturduktan sonra ona gerek kalmadigi icin yorum satiri haline cevirdik
		/*
		 * Bir method'u 4 adimda olustururuz
		 * 1- method'u javaya olusturtabilmek icin method call yapiyoruz
		 * 2- arguman ihtiyaci var mi belirleyelim
		 * 3- java'dan yardim larak method'u olusturalim
		 * 4- axcess modifier ve return type'a karar ver
		 * bundan sonra method'un yapacagi islevi gerceklestirecek kodlarimizi yazariz
		 */
		
		scan.close();
	}

	public static void kupTopla(double sayi1, double sayi2) {
		
		double kuplerToplami=sayi1*sayi1*sayi1+sayi2*sayi2*sayi2;
		System.out.println("Girilen sayilarin kuplerinin toplami= "+kuplerToplami);
		
		
	}

	public static void kareTopla(double sayi3, double sayi4) {
		// bizim arguman isimlerimizle parametre isimlerimiz ayni olmak zorunda degil
		// java isimlere degil degerlere bakar
		// bu bir zorunluluk degil imkandir, ýstedýgýmýzý tercýh edebiliriz
		
		double karelerToplami=sayi3*sayi3+sayi4*sayi4;
		System.out.println("Girilen sayilarin kareleri toplami= "+karelerToplami);
		
		
	}

}
