package day11_12_13_stringManipulations;

import java.util.Scanner;

public class C17_SifreSorusu {

	public static void main(String[] args) {
		// Soru 7) Kullanicidan ismini, soyismini ve kredi karti bilgisini isteyin
		// ve asagidaki gibi yazdirin
		// isim-soyisim : M***** B******
		// kart no : **** **** **** 1234
		Scanner scan=new Scanner(System.in);
		
		System.out.println("isminizi giriniz");
		String isim=scan.next();

		System.out.println("soyisminizi girin");
		String soyIsim=scan.next();
		
		System.out.println("16 haneli KK numarasi giriniz bosluk birakmadan");
		String kkNo=scan.next();
		
		String isimFormatli=isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w", "*");
		String soyIsimFormatli=soyIsim.substring(0, 1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w", "*");
		String kkFormatli="**** **** ****"+kkNo.substring(12);
		
		System.out.println("isim-soyisim : "+isimFormatli+" "+soyIsimFormatli);
        System.out.println("kart no : "+kkFormatli); 
		
	scan.close();	
	}

}
