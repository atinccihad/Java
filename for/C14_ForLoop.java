package day16_17_forLoops;

import java.util.Scanner;

public class C14_ForLoop {

	public static void main(String[] args) {
		// Kullanicidan 2 tam sayi isteyin
		// ilk sayidan baslayarak, ikinci sayiya kadar ucer ucer, yazdirin
		// (ikinci dahil olmak zorunda degil)
		
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen aradaki sayilari ucer ucer yazdirmak icin iki tam sayi giriniz");
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();

		if (sayi1>sayi2) { //azalarak gidecek 
			for (int i =sayi1; i >= sayi2; i-=3) {
				System.out.print(i+" ");
			}
		} else if(sayi1<sayi2){ //artarak gidecek
            for (int i = sayi1; i <= sayi2; i+=3) {
            	System.out.print(i+" ");
			}
		}else {
			System.out.println("Girilen sayilar esit");
		}
		scan.close(); 
	}

}
