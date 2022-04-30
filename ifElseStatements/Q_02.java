package Day_03;

import java.util.Scanner;

public class Q_02 {

	public static void main(String[] args) {
		/*
		 *Kullanicidan alacaginiz iki sayiyi yine kullaniciya sectireceginiz
		 *dort islemden biri ile isleme koyup sonucunu yazdiriniz 
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("2 sayiyi girin");
		double sayi1=scan.nextDouble();
	    double sayi2=scan.nextDouble();
	    
	    System.out.println("toplama icin1\ncýkarma icin2\ncarpma icin3\nbolme icin4");
	    int secim=scan.nextInt();
	    
	    if (secim==1) {
			System.out.println("girdiginiz sayilarin toplami :"+(sayi1+sayi2));
		} else if (secim==2) {
			System.out.println("girdiginiz sayilarin farki :"+(sayi1-sayi2));
		} else if (secim==3) {
			System.out.println("girdiginiz sayilarin carpimi :"+(sayi1*sayi2));
		} else if (secim==4) {
			System.out.println("girdiginiz sayilarin bolumu :"+(sayi1/sayi2));
		} else {
            System.out.println("1  2  3  veya 4 seciniz");
		}{

		}
		scan.close();
	}

}
