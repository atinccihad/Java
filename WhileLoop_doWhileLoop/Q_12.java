package Day_07_While_DoWhile;

import java.util.Scanner;

public class Q_12 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Bir top belirli y�kseklikten at�lmaktad�r.
	    // At�ld�ktan sonra, at�ld��� y�ksekli�in 3/4 u kadar yerden yukar� do�ru z�plamaktad�r
	    // Top z�plama  y�ksekli�i 1 metrenin alt�na indi�inde durmaktad�r.
	    // Bu ana kadar aldigi toplam yolu ve yere vurma say�s�n� bulan do while code blogu create ediniz.
		

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
