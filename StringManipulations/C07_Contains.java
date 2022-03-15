package day11_12_stringManipulations;

import java.util.Scanner;

public class C07_Contains {

	public static void main(String[] args) {
		// Soru2) Kullanicidan bir cumle isteyin.
		// Cumle "buyuk" kelimesi iceriyorsa tum cumleyi buyuk harf olarak yazdirin,
		// "kucuk" kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin
		// Ýki kelimeyi de icermiyorsa "Cumle kucuk yada buyuk kelimesi icermiyor" yazdirin.
		// Ýki kelimeyi de iceriyorsa "kucuk mu buyuk mu karar ver"
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen bir cumle giriniz");
		
		String cumle=scan.nextLine();
		
		if (cumle.contains("kucuk")&&cumle.contains("buyuk")) {
			      System.out.println("kucuk mu buyuk mu karar ver");
		} else if (cumle.contains("kucuk")) {
			      System.out.println(cumle.toLowerCase());   
		} else if (cumle.contains("buyuk")) {
	              System.out.println(cumle.toUpperCase());
		} else {
		      System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");  
		}
		
		scan.close();
	}
	

}
