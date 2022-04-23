package day40_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C02_Exception {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Kullanicidan istedigi kadar sayi alip
		// bu sayilari toplayan bir program yapiniz
		// sayi girisini bitirmek icin q'ya basiniz
		
		int sayi=0;
		int toplam=0;
		//String secim="";
		int count=0;
		
		Scanner scan=new Scanner(System.in);
		// InputMismatchException
		
		try {
			while(count<10000){
				System.out.println("lutfen toplamak icin bir sayi yaziniz\nbitirmek icin sayi disinda bir tusa basiniz");
		sayi=scan.nextInt();
		toplam+=sayi;
		count++;
			}
       }catch (InputMismatchException e) {
    	   System.out.println(count+" adet sayinin toplami: "+toplam);
		}
		
		
		
		
	}

}
