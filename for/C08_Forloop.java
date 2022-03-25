package day16_17_forLoops;

import java.util.Scanner;

public class C08_Forloop {

	public static void main(String[] args) {
		// Soru 7) Interview Question Kullanicidan bir String isteyin ve Stringi tersten yazdirin
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen tersten yazdirmak icin bir yazi giriniz");
		String str=scan.nextLine();
		
		// cekoslavakyalilastiramadiklarimizdanmisiniz

		
		for (int i = str.length()-1; i>=0; i--) {
			System.out.print(str.substring(i, i+1));
	
		}
	scan.close();
	}
	

}
