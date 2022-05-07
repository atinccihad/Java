package Day_07_While_DoWhile;

import java.util.Scanner;

public class Q_05 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		/*
		 * sayinin basamak degerlerinin toplamini while loop ile yapin bir method create ediniz.
		 */
				Scanner scan = new Scanner(System.in);
				System.out.println("Lutfen bir sayi giriniz");
				int sayi = scan.nextInt();
				
				
				
				
	}

	@SuppressWarnings("unused")
	private static void basamakTopla(int sayi) {
		@SuppressWarnings("unused")
		int toplam=0;
		
		while (sayi!=0) {
			
			toplam+=sayi%10;
			sayi/=10;
		}
	
	}

}
