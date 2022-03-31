package day18_19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C15_odevDoWhileLoop {

	public static void main(String[] args) {
		// 3) Kullanicidan toplamak uzere pozitif sayilar isteyin
		// islemi bitirmek icin 0 a basmasini soyleyin.
		// Kullanici 0'a bastiginda toplam kac pozitif sayi girdigini
		// ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.
		Scanner scan=new Scanner(System.in);
		int sayi=1;
		int sayac=0;
		int toplam=0;
		
		do {
			System.out.println("toplamak uzere sayilar girin bitirmek icin 0 a basin");
			sayi=scan.nextInt();
			toplam+=sayi;
			sayac++;
			
		} while (sayi!=0);
          System.out.println("girdiginiz "+(sayac-1)+" adet sayinin toplami "+toplam);
	scan.close();
	}

}
