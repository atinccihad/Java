package day16_17_forLoops;

import java.util.Scanner;

public class C16_ForLoop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen rakamlari toplamini bulmak icin pozitif bir tam sayi giriniz");
		int sayi=scan.nextInt(); // 345 data turu int
		
		
		int rakamlarToplami=0;
		int rakam=0;
		
		
		// for loop ile yapalim
		
			 
				String sayiStr=""+sayi; // 345 data turu String
				// int olarak verilen bir sayinin basamak sayisini bulmak istersek kisa yoldan o sayiyi String e cevirip,
				// str.length() method'unu kullanabiliriz
				
				
				for (int i = 0; i < sayiStr.length() ; i++) {
					 rakam=sayi%10;
						rakamlarToplami+=rakam;
						sayi/=10;
				}
				System.out.println("girdiginiz sayinin rakamlar toplami = "+rakamlarToplami);
				
		
		
		
	scan.close();	
	}

}
