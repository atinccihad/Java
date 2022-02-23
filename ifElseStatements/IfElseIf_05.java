package day08_ifElseStatements;

import java.util.Scanner;

public class C05_IfElseIf {

	public static void main(String[] args) {
		// Soru &) Kullanicidan iki sayi isteyin,
		// Sayilarin ikisi de pozitif ise sayilarin toplamini yazdirin,
		// Sayilarin ikisi de negative ise sayilarin carpimini yazdirin,
		// Sayilarin ikisi de farkli isaretlere sahipse "farkli isaretlerde islem yapamazsin" yazdirin
		// Sayilardan sifira esit olan varsa "sifir carpmaya gore yutan elemandir" yazdirin.
		Scanner scan=new Scanner(System.in);
		System.out.println(" Lutfen iki sayi yaziniz \n ilk sayidan sonra diger sayi icin enter'a basin");
        
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		if (sayi1>0 && sayi2>0) {
			System.out.println("sayilarin toplami:"+(sayi1+sayi2));
		} else if (sayi1<0 && sayi2<0) {
			System.out.println("sayilarin carpimi:"+sayi1*sayi2);
		} else if (sayi1*sayi2<0) {
			System.out.println("farkli isaretlerde sayilarla islem yapamazsin");
		} else   
            System.out.println("sifir carpmaya gore yutan elemandir");
	scan.close();
	} 

		 

		
        
	}


