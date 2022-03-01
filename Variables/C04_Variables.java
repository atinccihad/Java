package day04_IncrementDecrement;

public class C01_Variables {

	public static void main(String[] args) {
		
		/*
		 * 1-Farkli 3 data turunde variable olusturun ve bunlarý yazdýrýn
		 * 2-isim ve soyisim icin iki variable olusturun ve bunlarý
		 *      isminiz : Mehmet
		 *      soyisminiz : Bulutluoz     seklinde yazdirin
		 * 3-Iki farkli tamsayi data turunde 2 variable 
		 * olusturun bunlarýn toplamýný yazdýrýn
		 * 4-Bir tamsayý ve bir ondalikli variable olusturun ve bunlarýn toplamýný yazdirin
		 * 5-char data turunde bir variable olusturun vee yazdirin
		 * 6-Bir tamsayý, bir de char degisken olusturun
		 * ve bunlarýn toplamýný yazdirin.      
		 * 
		 */

		
		String ismim="Mehmet Bulutluoz";
		
		System.out.println(ismim);
		
		System.out.println(ismim);
		
		@SuppressWarnings("unused")
		char ilkHarf='S';
		
		@SuppressWarnings("unused")
		boolean anlasildiMi = true;
		
		String isminiz = "Ali";
		String soyisminiz = "Tuskan";
		
		//2 isminiz Mehmet = Ali
		
		System.out.println("isminiz : " + isminiz);
		
		//2 soyisminiz : Bulutluoz = Tuskan
		
		System.out.println("soyisminiz : " + soyisminiz);
		
		//3-Iki farkli tamsayi data turunde 2 variable  olusturun bunlarýn toplamýný yazdýrýn 
		
		int a=10;
		short b=20;
		System.out.println(a+b);  //30
		
		//6-Bir tamsayý, bir de char degisken olusturun ve bunlarýn toplamýný yazdirin.
		
		int sayi=25;
		char karakter='a';
		
		//char degiskenler matematiksel isleme sokulursa char degiskenin beindirdigi
		//karakerin ascii degeri isleme girer
		System.out.println(sayi + karakter); //122
		
		
		
		
		
		
		
	}

}
