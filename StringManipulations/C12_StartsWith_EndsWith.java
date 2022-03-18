package day11_12_13_stringManipulations;

import java.util.Scanner;

public class C12_StartsWith_EndsWith {

	public static void main(String[] args) {
		// Kullanicidan bir cumle ve bir kelime alin
		// verilen kelime(char squence) ile baslayip baslamadigini
		// ve bitip bitmedigini yazdirin
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen bir cumle girin");
		String cumle=scan.nextLine();
		
		System.out.println("Lutfen bir kelime girin");
		String kelime=scan.next();
		
		if (cumle.startsWith(kelime)) {
			System.out.println("Girilen cumle"+kelime+"ile basliyor");
		} else {
			System.out.println("Girilen cumle"+kelime+"ile baslamiyor");
		}

		if (cumle.endsWith(kelime)) {
			System.out.println("Girilen cumle"+kelime+"ile bitiyor");
		} else {
			System.out.println("Girilen cumle"+kelime+"ile bitmiyor");
		}
		scan.close();
	}

}
