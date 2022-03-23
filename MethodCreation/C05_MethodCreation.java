package day14_15_methodCreation;

import java.util.Scanner;

public class C05_MethodCreation {

	public static void main(String[] args) {
		// Kullanicidan ismini ve soyismini isteyin 
		// iki farkli method olusturun methodlardan biri girilen kelimeleri concat(birleþtirsin)
        // Ilk harf buyuk, digerleri kucuk olacak sekilde birlestirsin
		// Ikinci method Isim ve soyIsmin ilk harfleri buyuk harf
		// kalan harfler * olacak sekilde birlestirin
		
		// Kullaniciya isminin acik olarak yazilmasi veya gizlenmesi tercihi sorun
		// ve programin kalan kisminda isim ve soyismi kullanicinin istedigi sekilde kullanin
		Scanner scan=new Scanner(System.in);
		System.out.println("Isminizi ve soyisminizi girin \nIsimden sonra enter'a basin");
		String isim=scan.next();
		String soyIsim=scan.next();
		
		//acikIsim(isim,soyIsim); // methodlari olustururken kullandik tamamlandiktan sonra yorum satiri haline veya siliyoruz 
		//isimGizle(isim,soyIsim);// methodlari olustururken kullandik tamamlandiktan sonra yorum satiri haline veya siliyoruz 
		
		System.out.println("Isminizin acik sekilde yazilmasini istiyorsaniz 1 "+"\nIlk harf haric gizli yazilmasini istiyorsaniz 2'e basin");
		
		int tercih=scan.nextInt();
		// bu satira kadar kullanicidan ismini, soyismini ve tercihini aldim
		String birlesmisIsim=null; // Emrah Saglam , E***** S*****
		
		
	    if (tercih==1) {
	    	birlesmisIsim=acikIsim(isim,soyIsim);
		} else if(tercih==2) {
            birlesmisIsim=isimGizle(isim,soyIsim);
		}else  {
			System.out.println("Lutfen 1 veya 2 secin");
		}
			
    	// Bu satirdan itibaren kullanicinin isim ve soyisimi kullanici tercihine bagli olarak kaydedildi	
	    
	    System.out.println("kullanicinin tercihi : "+birlesmisIsim);
		scan.close();
	}

	public static String isimGizle(String isim, String soyIsim) {
		isim=isim.substring(0, 1).toUpperCase()+isim.substring(1).replaceAll("\\w", "*");
		soyIsim=soyIsim.substring(0, 1).toUpperCase()+soyIsim.substring(1).replaceAll("\\w", "*");
		
		return isim+" "+soyIsim;
	}

	public static String acikIsim(String isim, String soyIsim) {
		isim=isim.substring(0, 1).toUpperCase()+isim.substring(1).toLowerCase();
		soyIsim=soyIsim.substring(0, 1).toUpperCase()+soyIsim.substring(1).toLowerCase();
		
		return isim+" "+soyIsim;
		
		
	}

	
}
