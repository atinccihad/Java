package day08_ifElseStatements;

import java.util.Scanner;

public class C01_IfElse {

	public static void main(String[] args) {
		// Soru 1) Kullanicidan dikdortgenin kenar uzunluklarini isteyin 
		//          ve dikdortgenin kare olup olmadigini yazdirin
		
        Scanner scan=new Scanner(System.in);
		
		System.out.println("Lutfen dikdortgenin bir kenar uzunlugunu girin");
		
		double kenar1=scan.nextDouble();
		
		System.out.println("Lutfen dikdortgenin diger kenar uzunlugunu girin");
		
		double kenar2=scan.nextDouble();
		
		if (kenar1==kenar2) {
			System.out.println("Girilen dikdortgen kare");
		} else System.out.println("Girilen dikdortgen kare degil");
		{

		}
		
		
  scan.close();  
  
  
	}

}
