package Day_07_While_DoWhile;

import java.util.Scanner;

public class Q_13 {

	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args) {
		/*
         * Kullanicidan aldigi urunun adedini ve liste fiyatini alin, kullaniciya
         * musteri karti olup olmadigini sorun
         *
         * Musteri karti varsa ve 10 urunden fazla alirsa %20, yoksa %15 indirim yapin
         * Musteri karti yoksa ve 10 urunden fazla alirsa %15, 10 urunden az alirsa %10
         * indirim yapin
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen kaç adet ürün aldýðýnýzý giriniz: ");
        int adet=scan.nextInt();
        
        System.out.println("Lütfen ürünün liste fiyatini giriniz");
        int listeFiyat=scan.nextInt();
        
        System.out.println("musteri kartýnýz varsa true yoksa false giriniz");
        boolean musteriKarti=false;
        
        double toplamFiyat=0;
        
        if (adet>10 && musteriKarti==true) {
			toplamFiyat=toplamFiyat*80/100;
			System.out.println("%20indirim kazandiniz odemeniz gereken miktar: "+toplamFiyat);
		} else if (adet>10 && musteriKarti==false) {
			toplamFiyat=toplamFiyat*85/100;
			System.out.println("%15indirim kazandiniz odemeniz gereken miktar: "+toplamFiyat);
		} else {

		}{

		}
        
        
        
        
       

		
        
        
        
        
	}

}
