package Day_01;

import java.util.Scanner;

public class Q_03 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
		 *kullanicinin ad soyad yas boy kilosunu alt alta yazdiriniz 
		 */

		Scanner scan=new Scanner (System.in);
		
		System.out.println("adinizi giriniz: "); //kullaniciya adini girmesinin bildirimini yazdirdik
		                                         //println yazdirilirsa kod alt satira yazar
		String name=scan.nextLine();                                        //print yazdirilirsa ayni satirda yazdirir 
		
		
		System.out.println("soyadinizi giriniz: ");
		String surName=scan.nextLine();
		
		System.out.println("yasinizi giriniz: ");
		int yas=scan.nextInt();
		
		
		System.out.println("boyunuzu giriniz: ");
		int boy=scan.nextInt();
		
		
		System.out.println("kilonuzu giriniz: ");
	    int kilo=scan.nextInt();
	    
	    System.out.println("benim adim ="+name+"\n"
	                      +"benim soyadým ="+surName+"\n"
	    		          +"benim yasim ="+yas+"\n"
	                      +"benim boyum ="+boy+"cm"+"\n"
	    		          +"benim kilom ="+kilo+"kg") ;
	    
	    /* adinizi giriniz: 
          Cihad
          soyadinizi giriniz: 
          Atinc
          yasinizi giriniz: 
          33
          boyunuzu giriniz: 
          179
          kilonuzu giriniz: 
          75
          benim adim =Cihad
          benim soyadým =Atinc
          benim yasim =33
          benim boyum =179cm
          benim kilom =75kg
 
	     */
	    
	    
	}

}
