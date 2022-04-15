package day31_dateAndTime;

import java.time.LocalTime;

public class C04_dateTime {

	
	public static void main(String[] args) {
		// bir string ve bir integer variable olusturalim
		// bir loop icerisinde bu variable lari 1000 kere degistirelim
		// ve islem surelerini kiyaslayalim?
		
		 
		// Verilen iki sayinin tarihinin hangisinin daha once oldugunu bulunuz
		
        LocalTime saat=LocalTime.now();
		
		System.out.println("baslangic saati"+saat);
		
		int sayi=10;
		System.out.println(sayi);
		
		for (int i = 0; i < 1000; i++) {
			sayi++;
		}
		
		LocalTime saatBitis=LocalTime.now();
		System.out.println("bitis saati"+saatBitis);
		
		double nano1=saat.getNano();
		double nanobitis=saatBitis.getNano();
		
		System.out.println("int For loop "+(nanobitis-nano1)+" nano saniyede tamamlandi");
		
		
		 LocalTime saatS=LocalTime.now();
			
			System.out.println("baslangic saati"+saat);
			
			String str="celil";
			System.out.println(str);
			
			for (int i = 0; i < 1000; i++) {
				str+=" ";
			}
			
			LocalTime saatBitisS=LocalTime.now();
			System.out.println("bitis saati"+saatBitis);
			
			double nanoS=saatS.getNano();
			double nanobitisS=saatBitisS.getNano();
			
			System.out.println("String For loop "+(nanobitisS-nanoS)+" nano saniyede tamamlandi");
			
			double stringSure=nanobitisS-nanoS;//3.997.800
			double intSure=nanobitis-nano1;//1.998.900
			
			System.out.println("int String den "+(stringSure-intSure)+" nano saniye daha hizli bitirdi");// int String den 1998900.0 nano saniye daha hizli bitirdi
		

	}

}
