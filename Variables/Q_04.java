package Day_01;

import java.util.Scanner;

public class Q_04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
	
		//kullanicicdan 2 tam sayi alip bu 2 tamsayinin dort islem sonucunu yazdiriniz
		
		Scanner scan=new Scanner(System.in);

		System.out.println("1.sayiyi giriniz: ");//kullaniciya 1.sayi girmesinin bildirimini yazdirdik
		int sayi1=scan.nextInt();
		
		
		System.out.println("2.sayiyi giriniz: ");//kullaniciya 2.sayi girmesinin bildirimini yazdirdik
		int sayi2=scan.nextInt();
		
		/*
	    System.out.println("Girilen sayilarin toplami :"+(sayi1+sayi2));
		System.out.println("Girilen sayilarin farki :"+(sayi1-sayi2));
		System.out.println("Girilen sayilarin carpimi :"+(sayi1*sayi2));
		System.out.println("Girilen sayilarin bolumu :"+(sayi1/sayi2));
		 */
		
		
		
		
		System.out.println("Girilen sayilarin toplami :"+(sayi1+sayi2)+"\n"+"Girilen sayilarin farki :"+(sayi1-sayi2)+"\n"+"Girilen sayilarin carpimi :"+(sayi1*sayi2)+"\n"+"Girilen sayilarin bolumu :"+(sayi1/sayi2));
		
	}

}
