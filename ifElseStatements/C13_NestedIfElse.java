package day07_08_09_ifStatements_ifElseStatements_NestedIfElse;

import java.util.Scanner;

public class C13_NestedIfElse {

	public static void main(String[] args) {
		// Soru 11) Nested If kullanarak asagidaki soruyu cozen kodu yaziniz
		// Kullanicidan bir sifre girmesini isteyiniz
		// Eger ilk harf buyuk harf ise 
		//"A" olup olmadigini kontrol edin.
		//Ilk harf A ise "Gecerli Sifre"
		// Eger ilk harf kucuk harf ise 
		//"z" olup olmadigini kontrol edin.
		//Ilk harf z ise "Gecerli Sifre"

		Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen sifrenizi giriniz");
		char ilkKarakter=scan.next().charAt(0);
		
		
		if (ilkKarakter>='A' && ilkKarakter<='Z') { //buyuk harfleri secmis olacak
			if (ilkKarakter=='A') {
				System.out.println("Gecerli sifre");
			} else {
					System.out.println("Gecersiz sifre");
			}
			
		} else if(ilkKarakter>='a' && ilkKarakter<='z') { //kucuk harfleri secmis olacak
			if (ilkKarakter=='z') {
				System.out.println("Gecerli sifre");
			} else {
				System.out.println("Gecersiz sifre");
			}

		}else { //buyuk ve kucuk harf harici geriye kalan tum karakterler
			
			System.out.println("Gecerli sifre olmasi icin harf ile baslayiniz");
		}
		
		
		
		scan.close();
		
	}

}
