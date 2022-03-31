package day18_19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C16_odevDoWhileLoop {

	public static void main(String[] args) {
		// 3) Kullanicidan toplamak uzere pozitif sayilar isteyin
				// islemi bitirmek icin 0 a basmasini soyleyin.
		        // Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin
		        // ve "Negatif sayi giremezsiniz" yazdirip basa donun
				// Kullanici 0'a bastiginda toplam kac pozitif sayi girdigini
				// ve girdigi pozitif sayilarin toplaminin kac oldugunu yazdirin.  System.out.println("girdiginiz "+(sayac-1)+" adet sayinin toplami "+toplam);
		
		
		Scanner scan = new Scanner(System.in);
		double sayi=5;
		int count=0;
		double sayilarToplami=0;
		
		do {
			System.out.println("Lutfen toplamak icin pozitif sayilar girin "
					+ "\nislemi bitirmek icin 0'a basin");
			sayi=scan.nextDouble();
			
			// kullanicidan aldigim sayiyi pozitif mi diye kontrol edelim
			if (sayi>0) {
				
				sayilarToplami+=sayi;
				count++;
				
			} else if(sayi<0){
				System.out.println("pozitif sayi girmeliydiniz "
						+ "\nbu sayi negatif oldugu icin yok sayiyorum");
			}
			
			
			
		} while(sayi!=0);
		
		System.out.println("girdiginiz sayilardan " + count + " tanesi pozitifdi "
				+ "\nve pozif sayilarin toplami : " + sayilarToplami);
		
		
		
			scan.close();
	
	
			/*
				
				
	
	
	*/
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
