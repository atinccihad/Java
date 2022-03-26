package day16_17_forLoops;

import java.util.Scanner;

public class C11_ForLoop {

	public static void main(String[] args) {
		// Soru 10 ) Kullanicidan iki sayi isteyin.
		//           Girilen sayilar ve aralarindaki tum sayilari toplayip,sonucu yazdiran bir program yaziniz
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen aradaki tum sayilari toplamak icin iki tam sayi giriniz");

		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		
		int kucuk=0;
		int buyuk=0;
		
		if (sayi1>sayi2) {
			buyuk=sayi1;
			kucuk=sayi2;
		}else {
	    	kucuk=sayi1;
			buyuk=sayi2;
	    }
	    int toplam=0;
	    
	    for (int i = kucuk; i <= buyuk; i++) {
	    	
	    	toplam+=i;
			
		}
	      System.out.println("Girilen sayilar ve aralarindaki sayilarin toplami : "+toplam);
	      scan.close();
	}

}
