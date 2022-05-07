package Day_07_While_DoWhile;

import java.util.Scanner;

public class Q_12 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Bir top belirli yükseklikten atýlmaktadýr.
	    // Atýldýktan sonra, atýldýðý yüksekliðin 3/4 u kadar yerden yukarý doðru zýplamaktadýr
	    // Top zýplama  yüksekliði 1 metrenin altýna indiðinde durmaktadýr.
	    // Bu ana kadar aldigi toplam yolu ve yere vurma sayýsýný bulan do while code blogu create ediniz.
		

		Scanner scan=new Scanner(System.in);
		System.out.println("biraktiginiz yuksekligi giriniz");
		double yukseklik=scan.nextDouble();
		double topuntoplamYol=0;
		
		int yereVurmaSayisi=0;
		
		
		do {
			
			yereVurmaSayisi++;
			topuntoplamYol+=yukseklik;
			yukseklik*=(0.75);
			topuntoplamYol+=yukseklik;
			
		} while (yukseklik>=1);
         
		System.out.println("topun vurma sayisi "+yereVurmaSayisi);
		System.out.println("topun aldigi toplam yol "+topuntoplamYol);
		
	}

}
