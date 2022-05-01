package Day_03_IfElseStatements;

import java.util.Scanner;

public class Q_11 {

	public static void main(String[] args) {
		
		/*
		 * SORU 1
		 * 
		 * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
		 * musteri karti olup olmadigini sorun
		 * 
		 * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin 
		 * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az
		 * alirsa %10 indirim yapin
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("urun adedi girin");
		int urun=scan.nextInt();
		System.out.println("liste fiyati girin");
		double listeFiyati=scan.nextDouble();
		System.out.println("musteri kartiniz var mi");
		boolean kart=scan.nextBoolean();
		
		if (kart==true) {
			if (urun>=10) {
				System.out.println(listeFiyati=listeFiyati-listeFiyati*20/100);
			} else {
				System.out.println(listeFiyati=listeFiyati-listeFiyati*15/100);  
			}
		} else if (urun>10) {
			    System.out.println(listeFiyati=listeFiyati-listeFiyati*15/100); 
		} else {
			    System.out.println(listeFiyati=listeFiyati-listeFiyati*10/100);
		}
		scan.close();
	}

}
