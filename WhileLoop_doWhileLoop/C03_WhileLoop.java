package day18_19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {

	public static void main(String[] args) {
		// Kullanicidan toplanmak uzere sayilar isteyin
		// sayi adedi 10 u gecerse veya toplam 500'u gecerse
		// "Bu kadar sayi yeter"
		// .. adet sayi girdin , toplami ..  yazdirin
		
		  Scanner scan=new Scanner(System.in);
	      
		
	        int sayi=100;   
	        int toplam=0;
	        int sayac=0;
	        
	         while (sayi!=0) {
				 System.out.println("Lutfen toplama eklemek icin bir tamsayi yazin\nbitirmek icin 0 a basin");
	        	 sayi=scan.nextInt();
	        	 toplam+=sayi;
	        	 sayac++;
	        	 
	        	 if (sayac>10 || toplam>500) {
						sayi=0;
	        		 System.out.println("Bu kadar sayi yeter");
					} else {

					}
	        	 
			}
	         
	         System.out.println("girilen sayi adedi : "+(sayac-1));
	         System.out.println("girilen sayilarin toplami : "+toplam);
		
		
		
	scan.close();

	}

}
