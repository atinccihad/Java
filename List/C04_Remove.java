package day24_25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C04_Remove {

	public static void main(String[] args) {
		List<String> harfler=new ArrayList<>();
 
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		
		System.out.println(harfler);
		
		//System.out.println(harfler.remove(1)); // Z "burada sildigi harfi yazdirmasini istedigimiz icin Z yazdirdi 
		                                       // yoksa boyle bir sey sart degil"
		
		harfler.remove(1); // bu satir gidip 1 indexindeki elemani remove eder
		                   // ve (delil olarak) remove ettigi elemani bize getirir
		
		// listenin kalanini gormek isterseniz listeyi yazdirabilirsiniz alt satirdaki gibi
		System.out.println(harfler); // [A, F, D]
		
		System.out.println(harfler.remove(2)); // D 
		
		System.out.println(harfler); // [A, F]
		
		System.out.println(harfler.remove("F"));   // gidip F yi remove eder ve true dondurur
		
		System.out.println(harfler.remove("B")); // listede B olmadigi icin remove yapamaz ve " false " dondurur
		                                                       // GOREVÝ YAPAMADÝGÝ ÝCÝN FALSE DONDURUR.
		
		System.out.println(harfler); // [A]
		
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		System.out.println(harfler); // [A, A, Z, F, D]
		
		System.out.println(harfler.remove("A"));
		System.out.println(harfler); // [A, Z, F, D] ilk buldugu A yi sildi 
		
		harfler.add("A");
		System.out.println(harfler);
		
		harfler.removeAll(harfler);       // verilen bir listeyi siler
		System.out.println(harfler); // []
		
		
		 
		harfler.add("A");
		harfler.add("Z");
		harfler.add("F");
		harfler.add("D");
		
		List<String> silinecekHarfler=new ArrayList<>();
		silinecekHarfler.add("A");
		silinecekHarfler.add("C");
		silinecekHarfler.add("F");
		
		System.out.println(harfler); // [A, Z, F, D]
		System.out.println(silinecekHarfler); // [A, C, F]
		
	    System.out.println(	harfler.removeAll(silinecekHarfler)); // true
	    
	    System.out.println(harfler);  // [Z, D]  > tamamini silmedi ama hicbisey silmeme yapmadigi icin iki harfi dondu
		System.out.println(silinecekHarfler); // [A, C, F]
		
		// eger listemiz integer'lardan olusuyorsa
		// Java remove (index) ve remove(object) method'lari karismasin diye
		// girilen sayiyi index olarak kabul eder
		
	    
		
		
		
	}

}
