package day18_19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C07_odevWhileLoop {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
		
		// While loop kullanarak 3 den 13 e kadar tum tek sayilari yazdirin
		
		int sayi=3;
		
		while(sayi<=13) {
			if (sayi%2==1) {
				System.out.print(sayi+" ");
				
			}
			sayi++;
			scan.close();
		}
		
		
		
	    /*
	     * 
	     * Scanner scan=new Scanner(System.in);
		System.out.println("birinci sayi");
		
		int x=scan.nextInt();
		
		System.out.println("ikinci sayi");
		int y=scan.nextInt();
		
				if (x%2!=0) {
					while (x<y) {
						System.out.println(x);
						x+=2;
					}
		}else {
			System.out.println("tek sayi gir");
		}
	     */
	}

}
