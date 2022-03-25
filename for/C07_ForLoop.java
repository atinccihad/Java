package day16_17_forLoops;

import java.util.Scanner;

public class C07_ForLoop {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in); 
		System.out.println("sayi gir");
		int sayi=scan.nextInt();
		
		for (int i = 1; i <= sayi; i++) {
			
			if (i%15==0) {
				System.out.print("java guzeldir ");
			
			} else if (i%5==0){
				System.out.print("Guzeldir ");
			
			}else if (i%3==0) {
				System.out.print("java ");
			
			}else {
				System.out.print(i);
			}
		}
scan.close();
	}

}
