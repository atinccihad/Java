package day05_matematiksel_islemler;

import java.util.Scanner;

public class C03_Modulus {

	public static void main(String[] args) {
	
		//kullanýcýdan 3 basamaklý bir sayý alýp rakamlar toplamýný yazfýran bir program yaziniz
		
		Scanner scan =new Scanner (System.in);
		System.out.println("Lutfen 3 basamakli bir sayi giriniz");
		int sayi =scan.nextInt();
		
		
		//sayi 573 olsun 
		int rakamlarToplami=0;
		
		int rakam=sayi%10;   //bana birler basamagýný verir rakam=3
		
		rakamlarToplami+=rakam;  //rakamlar toplami 3 oldu
		
		//sayimiz hala 573
		// 3 ten kurtulmak istiyorum cunku 3 ile isim bitti
		//sayiyi 57 haline getirin
		
		sayi/=10;
		
        //sayim artik 57
		//7 yi nasil alirim
		rakam=sayi%10;
		
		rakamlarToplami+=rakam;
		
		//sayi hala 57
		// 7 den de kurtulalim
		sayi/=10;
		//sayi artik 5
		
		rakamlarToplami+=sayi;
		
		System.out.println("Girdiginiz sayinin rakamlar toplami : " + rakamlarToplami);
		
		scan.close();
		
		
		
		
		
		
		
		

	}

}
