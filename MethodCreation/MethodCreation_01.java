package day15_methodCreation;

import java.util.Scanner;

public class C02_MethodCreation {

	public static void main(String[] args) {
		/*
		 *Soru2) Kullaniciya kac sayi toplamak istedigini sorun.
		 *Kullanici 2,3 veya 4 degerini girerse,
		 *kullanicidab bu sayilari girmesini isteyin
		 *ve sayilarin toplamini yazdirin. 
		 *Kullanici toplamak istedigi sayi adedini 42den buyuk girerse
		 *"Cok sayi girdiniz, ben toplayamam" yazdirin 
		 */

	    Scanner scan=new Scanner(System.in);
	    
	    System.out.println("Lutfen kac sayi toplamak istediginizi girin 2,3 veya 4 den birini secin");
	    
	    int tercih=scan.nextInt();
	    if(tercih>4) {
	    	tercih=5;
	    }
	    switch(tercih) {
	    
	    case 2:
	    	ikisayiTopla();
	    	break;
	    case 3:
	    	ucsayiTopla();
	    	break;
	    case 4:
	    	dortsayiTopla();
	    	break;
	    case 5:
	    	System.out.println("Cok sayi girdiniz, ben toplayamam");
	    	break;
	    default:
	    	System.out.println("Gecersiz tercih");
	    }
	   scan.close(); 
	}

	private static void dortsayiTopla() {
		Scanner scan=new Scanner(System.in );	
		System.out.println("Lutfen 4 sayi girin \nher sayidan sonra enter a basin");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		double sayi4=scan.nextDouble();
		
		System.out.println("Girdiginiz sayilarin toplami : "+(sayi1+sayi2+sayi3+sayi4));
		scan.close();
	} 

	private static void ucsayiTopla() {
		Scanner scan=new Scanner(System.in );
		System.out.println("Lutfen 3 sayi girin \nher sayidan sonra enter a basin");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		double sayi3=scan.nextDouble();
		
		System.out.println("Girdiginiz sayilarin toplami : "+(sayi1+sayi2+sayi3));
		scan.close();
	}

	private static void ikisayiTopla() {
		Scanner scan=new Scanner(System.in );
		System.out.println("Lutfen 2 sayi girin \nher sayidan sonra enter a basin");
		double sayi1=scan.nextDouble();
		double sayi2=scan.nextDouble();
		
		System.out.println("Girdiginiz sayilarin toplami : "+(sayi1+sayi2));
		scan.close();
	}

}
