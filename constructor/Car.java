package day27_28_constructor_constructorCall_staticKeyWord;

public class Car {
    // Java biz bir class olusturdugumuzda o class'dan obje uretecegimizi bilir
	// ve her class a default bir constructor yerlestirir
	// Java'nin class'a koydugu bu default constructor gorulmez
	// ama obje uretmek uzere kod yazdýgýmýzda otomatik olarak devreye girer
	
	// bir constructor olusturmak cok kolaydir
	// method a benzer ama method'dan farklidir
	// 1- Constructor ismi class ismi ile ayni olmalidir
	// class isimleri buyuk harfle basladigi icin Constructor ismi de buyuk harfle baslar
	// (method dan 1. farki budur, method'lar kucuk harfle baslar)
	// 2- Constructor larin return type 'i olmaz
	//  (method dan 2. farki budur, method'larin mutlaka return type 'i olmalidir)
	
	public Car() {
		
	}
	// Java'nin her class'da olusturdugu constructor budur
	
	int yýl=2000;
	String renk;
	String model;
	int km;
	boolean satilikMi;
	
	// Bugun itibariyle class'larda main method olma mecburiyeti kaldirilmistir
	// Ancak bildigimiz gibi main method olmayan bir class direk calistirilamaz
	// Main methodu olmayan class lar baska class lardan obje olusturularak kullanilmak uzere
	// ihtiyac duyulan variable ve methodlari sakladigimiz bir depo gibidir
	
	
	
}
