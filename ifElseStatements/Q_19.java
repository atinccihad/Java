package Day_03_IfElseStatements;

import java.util.Scanner;

public class Q_19 {

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
		System.out.println("urun adedi giriniz");
		int adet=scan.nextInt();
		System.out.println("liste fiyatini girin");
		double fiyat=scan.nextDouble();
		System.out.println("musteri kartiniz varsa Y yoksa N tuslauiniz");
		char card=scan.next().toUpperCase().charAt(0);
		
		if (card!='Y'&&card!='N' ) {
			System.out.println("kart varlýgý icin Y veya N giriniz");
		} else if (card=='Y') {
			      if (adet>10) {
					System.out.println("%20 indirim kazandiniz odemeniz gereken miktar"+(fiyat=fiyat*80/100));
				} else {
					System.out.println("%15 indirim kazandiniz odemeniz gereken miktar"+(fiyat=fiyat*85/100));
				}
		} else {
          if (card=='N') {
			if (adet>10) {
				System.out.println("%15 indirim kazandiniz"+(fiyat=fiyat*85/100));
			} else {
				System.out.println("%10 indirim kazandiniz"+(fiyat=fiyat*90/100));
			}
		} else {

		}
		
		}
scan.close();
	}

}
