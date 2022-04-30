package Day_02_Scanner;

import java.util.Scanner;

public class Q_11 {
	 public static void main(String[] args) {
	        /*
	        TechProEd spor salonu için kullanıcıdan isim soyisim, yaş, kilo, boy, salona devam edeceği ay süresini
	        bilgilerini alıp aylık $20 olarak toplam ücretini yazdırınız.
	         */
	        @SuppressWarnings("resource")
			Scanner scanner = new Scanner(System.in);

	        System.out.println("TechProEd Salonu'na hoşgeldiniz!");

	        System.out.print("İsim Soyisim: ");
	        @SuppressWarnings("unused")
			String isim = scanner.nextLine();

	        System.out.print("Yaşınız: ");
	        @SuppressWarnings("unused")
			int yas = scanner.nextInt();

	        System.out.print("Kilo: ");
	        @SuppressWarnings("unused")
			double kilo = scanner.nextDouble();

	        System.out.print("Boy: ");
	        @SuppressWarnings("unused")
			double boy = scanner.nextDouble();

	        System.out.print("Kaç aylık kaydolacaksınız: ");
	        int aylik = scanner.nextInt();

	        int aylik_ucret = 20;

	        int toplam_tutar = aylik_ucret * aylik;

	        System.out.print("Toplam Tutar: " + toplam_tutar + " Euro");

	    }
}
