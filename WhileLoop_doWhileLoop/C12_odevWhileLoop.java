package day18_19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C12_odevWhileLoop {

	public static void main(String[] args) {
		// Kullanicidan bir sayi alin ve bu sayiyi tam bolen sayilari ve 
		// toplam lac tane olduklarini yazdirin
		Scanner scan=new Scanner(System.in);
		System.out.println("bir rakam giriniz");
		int sayi=scan.nextInt();
		int bolen=1;
		int sayac=0;
		
		while (bolen<=sayi) {
			if (sayi%bolen==0) {
				System.out.print(bolen+" ");
				sayac++;
				
			} bolen++;
		}System.out.println("");
		System.out.print(sayi+" sayisinin tam bolen sayilarin adedi "+sayac);
	    
scan.close();
	}

}
