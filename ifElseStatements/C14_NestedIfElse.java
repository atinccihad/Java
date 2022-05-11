package day07_08_09_ifStatements_ifElseStatements_NestedIfElse;

import java.util.Scanner;

public class C14_NestedIfElse {

	public static void main(String[] args) {
		// Soru 12) Kullanicidan 4 basamakli bir sayi girmesini isteyin.
		// Girdigi sayi 5'e bolunuyorsa sonrakamýný kontrol edin
		// Son rakami 0 ise ekrana "5'e bolunen cift sayi" yazdirin.
		// Son rakami 0 degil ise "5'e bolunen tek sayi" yazdirin.
		// Girdigi password 5'e bolunmuyorsa ekrana "Tekrar deneyin" yazdirin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen 4 basamakli bir sayi giriniz");
		int sayi=scan.nextInt();
		
		if (sayi<1000 || sayi>9999) {
			System.out.println("4 basamakli pozitif sayi girmelisiniz");
		} else { // 4 basamakli sayilari yakalayacak
			
			if (sayi%5==0) { //bese tam bolunenler
				
				if (sayi%10==0) { //son rakamý 0 olanlarý çektik
					
					System.out.println("Bese tam bolunen cift sayi");
				} else { // son rakamý 5
                    System.out.println("Bese tam bolunen tek sayi");
				}
				
			} else {// bese tam bolunmeyenler 
                    System.out.println("Tekrar deneyiniz");
			}

		}
		
		
		
		scan.close();
	}

}
