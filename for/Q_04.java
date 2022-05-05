package Day_06_ForLoop;

import java.util.Iterator;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Q_04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 // Kullanýcýdan 5 adet sayý isteyiniz
        // Bu sayýlardan 5 ile 10 arasýndakiler hariç, diðerlerinin toplamýný bulunuz.
        // bu soruyu continue kullanarak çözünüz.
		Scanner scan=new Scanner(System.in);
		System.out.println("5 sayi girin");
		int toplam=0;
		
		for (int i = 1; i <= 5 ; i++) {
		
		System.out.println("sayi giriniz");
		int sayi=scan.nextInt();
		
		
		if (sayi>5 && sayi<10) {
			System.out.println("girdigin 5-10 arasi sayilar isleme girmeyecek ");
			continue;
		}
		
		
		toplam+=sayi;
		}
		System.out.println("girdigin sayilar toplami "+toplam);
	}

}
