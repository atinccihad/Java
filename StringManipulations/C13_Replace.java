package day11_12_13_stringManipulations;

public class C13_Replace {

	public static void main(String[] args) {
		// String olarak verilen 10.000 sayisinin
		// binden buyuk olup olmadigini yazdirin
		
		String sonuc="10.000";
		
		sonuc=sonuc.replace(".", ""); // 10000 ' e cevirip sonuca assign ettik
		                              // = oldugu icin sonuc kalici olarak degisti
		//System.out.println(sonuc.replace(".", ""));// sonuca assign etmek degil yazdirmak oldugu icin hata verir
		
		if (Integer.valueOf(sonuc)>1000) { // String icinde int deger kabul etmez ve Integer.valueOf(sonuc) ile degistirip ona uyumlu hale getiririz 
			System.out.println("bulunan sonuc sayisi 1000 den cok");
		} else {
            System.out.println("bulunan sonuc sayisi 1000 den az");
		}
		
       // NOT: replace() methodu char icin de kullanilabilir
	}

}
