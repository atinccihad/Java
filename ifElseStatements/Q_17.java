package Day_03_IfElseStatements;

import java.util.Scanner;

public class Q_17 {

	public static void main(String[] args) {
		/*Kullanici tarafindan girilen bir sayinin
		 *mutlak degerini yazdirmak icin bir program yazin.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi giriniz");
		double sayi=scan.nextDouble();
		
		if (sayi>0) {
			System.out.println("girilen sayinin mutlak degeri"+sayi);
		} else {
			System.out.println("girilen sayinin mutlak degeri"+(-1)*sayi);
		}
		
scan.close();
	}

}
