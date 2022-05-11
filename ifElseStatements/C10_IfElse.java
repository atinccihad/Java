package day07_08_09_ifStatements_ifElseStatements_NestedIfElse;

import java.util.Scanner;

public class C10_IfElse {

	public static void main(String[] args) {
		// Soru 2) Kullanicidan bir karakter girmesini isteyin ve
		//    girilen karakterin harf olup olmadigini yazdirin
		
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen bir karakter giriniz");
		
		char karakter=scan.next().charAt(0);
		
		if ((karakter>='A' && karakter<='Z')||(karakter>='a'&&karakter<='z')) {
			System.out.println("girdiginiz : "+ karakter +" bir harftir");
			
		} else {
                System.out.println("girdiginiz: "+ karakter +" bir harf degildir");
		}
		
		scan.close();
	}

}
