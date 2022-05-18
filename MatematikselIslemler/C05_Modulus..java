package day05_matematiksel_islemler;

import java.util.Scanner;

public class C05_Modulus {

	public static void main(String[] args) {
	
		
		        //Kullanicidan 6 basamakli bir sayi alip
				//rakamlar taoplamini yazdirin
				
		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen6basamakli bir sayi giriniz");
		int sayi =scan.nextInt();
		
		
	
		int rakamlarToplami=0;
		int rakam=sayi%10;   
		rakamlarToplami+=rakam; 
		sayi/=10;
		
		
	   rakam=sayi%10;
		rakamlarToplami+=rakam; 
		sayi/=10;
		
		rakam=sayi%10;rakam=sayi%10;
		rakamlarToplami+=rakam; 
		sayi/=10;
		
		rakam=sayi%10;rakam=sayi%10;
		rakamlarToplami+=rakam; 
		sayi/=10;
		
		
		rakam=sayi%10;rakam=sayi%10;
		rakamlarToplami+=rakam; 
		sayi/=10;
		
		
		rakam=sayi%10;rakam=sayi%10;
		rakamlarToplami+=rakam; 
		sayi/=10;
		
		rakam=sayi%10;rakam=sayi%10;
		rakamlarToplami+=rakam; 
		sayi/=10;
		
		
		System.out.println("Girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);
		scan.close();
	}

}
