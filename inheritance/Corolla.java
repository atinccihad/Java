package day35_36_37_encapsulation_inhertance;

public class Corolla extends Toyota {
	
	String renk;
	int fiyat;
	boolean elektrikliMi;
	int tekerSayisi=4;
	String uretimYeri="Turkiye";
	
	public static void main(String[] args) {
		

		      Corolla                  araba1        =          new         Corolla();
		//Class ismi && Data turu     Obje ismi   Assigment   keyword      Constructor
		
		// Java da obje olusturdugumuz her class ismi ayni zamanda bir data turudur //
		// Bu ornegimiz icin Corolla hem class adi hem de olusturdugumuz araba1 objesinin data type'idir.
		// Java'da obje uretilen her bir class atni zamanda non-primitive data turu olur 
		System.out.println(araba1.calisiyorMu);// true
	    System.out.println(araba1.tekerSayisi); // 4
	    System.out.println(araba1.uretimYeri);//Turkiye
	    
	    
		Toyota araba2=new Corolla(); 
		System.out.println(araba2.calisiyorMu);//true
		System.out.println(araba2.tekerSayisi);//0
		
		
		Araba araba3=new Corolla();
		System.out.println(araba3.calisiyorMu);//true
		
		
		
		
		
		
		
		
	}

}
