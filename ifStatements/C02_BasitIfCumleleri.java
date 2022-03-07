package day07_ýfStatements;

import java.util.Scanner;

public class C02_BasitIfCumleleri {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan bir tamsayi isteyin ve sayinin tek veya cift oldugunu yazdirin
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Lutfen bir tamsayi giriniz");
        int sayi=scan.nextInt();
        
        if (sayi%2==0) {
			System.out.println("girdiginiz sayi cift bir sayi");
		}
        
        if (sayi%2==1) {
			System.out.println("girdiginiz sayi tek bir sayi");
		}
        
        
        
     
        scan.close();
	}

	
	
	
	
	

}
