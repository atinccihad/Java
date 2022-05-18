package day05_matematiksel_islemler;

public class C01_MatematikselIslemler {

	public static void main(String[] args) {

		
		System.out.println(4*(2+5)/2);
		
		System.out.println(4*(2+5)/3); //28/3=9,333   virgülden sonrasýný yok sayar oncesini yazdirir

		//sonucu virgullu yazdýrmak istersek
		
		double sonuc=4*(2+5)/3;
		
		System.out.println(sonuc); //9.0 
		
		sonuc=(double)(4*(2+5)/3);
		
		System.out.println(sonuc);//9.0
		
		
		sonuc=(double)4*(2+5)/3;
		
		System.out.println(sonuc);//9.333333334
		
		
		int sayi1=5;
		int sayi2=2;
		double sayi3=2;
		
		
		System.out.println(sayi1/sayi2); //  5/2=2
		
		System.out.println(sayi1/sayi3); //   5/2=2.5
		
		System.out.println(sayi1+sayi3/sayi2); // 6.0
		
		
		
		
		
		
	}

}
