package Day_07_While_DoWhile;

import java.util.Scanner;

public class Q_10 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Kullan�c�dan 5 say� isteyiniz, bu say�lardan en b�y���n� bularak yazd�r�n�z.
        Scanner scan = new Scanner(System.in);

        int enbSayi=0;
        int sayiAdedi=0;
        while(sayiAdedi<5) {
        	System.out.println("sayi giriniz: ");
            int sayi=scan.nextInt();
            if (sayi>enbSayi) {
				enbSayi=sayi;
				
			}
            sayiAdedi++;
        }
        System.out.println("enbuyuk sayi: "+enbSayi);
	}

}
