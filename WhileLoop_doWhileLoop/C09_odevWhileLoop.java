package day18_19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C09_odevWhileLoop {

	public static void main(String[] args) {
		// 3) Kullanicidan baslangic ve bitis degeri alin.
		// Baslangic degeri ve bitis degeri dahil aralarindaki tum cift tam sayilari 
		// while loop kullanarak yazdiriniz.
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen baslangýc degerini ardindan enter a basip bitis degerini giriniz");
		int baslangic=scan.nextInt();
		int bitis=scan.nextInt();
		
		while(baslangic!=bitis) {
			if (baslangic%2==0) {
				System.out.print(baslangic+" ");
			}baslangic++;
		}
scan.close();
	}

}
