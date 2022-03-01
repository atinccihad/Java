package day03_scanner;

import java.util.Scanner;

public class C02_Scanner {

	public static void main(String[] args) {
	
		//Kullanicidan ismini alip bas harfini yazdiririn

		Scanner scan =new Scanner(System.in);
		//Kullaniciya mesaj ver
		System.out.println("lutfen isminizi yaziniz");
		
		char ilkHarf=scan.next().charAt(0);
		//scan. next ile ismi al,sonra o ismin ilk harfini bana ver
		//scan 0  ilk harftir scanner da 1 den degil 0 dan baslar
		//kodun anlamý ilk harfi bana getirdir , 0 dan baslar 1 den degil
		
		//isminizin ilk harfi : M         þeklinde yazdýralým
		System.out.println("isminizin ilk harfi : " + ilkHarf);
		
		scan.close();
	}

}
