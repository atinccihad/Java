package day16_17_forLoops;

import java.util.Scanner;

public class C13_NestedForLoop {

	public static void main(String[] args) {
		// 1'den 4'e kadar sayilari yan yana aralarinda bir bosluk birakarak yazdirin
		Scanner scan=new Scanner(System.in);
	    
		for (int satir = 1; satir <=4 ; satir++) {
			
			for (int i = 1; i <= 4; i++) {
				System.out.print(satir*i+" ");
			}
		System.out.println("");
		}
	scan.close();
	}

}
