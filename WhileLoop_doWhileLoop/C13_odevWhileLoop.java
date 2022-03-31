package day18_19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C13_odevWhileLoop {

	public static void main(String[] args) {
		// 7) Kullanicidan bir sayi alin ve bu sayinin rakamlari toplamini yazdirin

		Scanner scan=new Scanner(System.in);
		System.out.println("bir sayi giriniz");
		int sayi=scan.nextInt();
		int rakam=0;
		int rakamlarToplami=0;
		
		while (sayi!=0) {
		   rakam=sayi%10;
		   sayi=sayi/10;
		   rakamlarToplami+=rakam;
		}System.out.println("rakamlar toplami "+rakamlarToplami);
		scan.close();
	}

}
