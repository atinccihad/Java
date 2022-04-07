package day24_25_arrayList;

import java.util.ArrayList;
import java.util.List;

public class C02_Add {

	public static void main(String[] args) {
		
		List<String> isimler=new ArrayList<>();
		System.out.println("Bos liste : "+isimler); // Bos liste : []
		
		isimler.add("Ali");
		System.out.println("Bir eleman : "+isimler); // Bir eleman : [Ali]
		
		isimler.add("Veli");
		System.out.println("Iki eleman : "+isimler);// Iki eleman : [Ali, Veli]
		
		// add methodu listenin sonuna ekleme yapar
		
		isimler.add("Mahmut");
		System.out.println("Uc eleman : "+isimler); // Uc eleman : [Ali, Veli, Mahmut]
		
		isimler.add(1, "Ayse");
		System.out.println("1. index e ayse ekledik : "+isimler);// Dort eleman : [Ali, Ayse, Veli, Mahmut]
		
		// isimler.add(5) declare ederken belirttigimiz data turu disinda bir data turunden ekleme yapamayiz
		
		List <String> liste2=new ArrayList<>();
		liste2.add("Gunter");
		liste2.add("Emrah");
		System.out.println("liste 2 : "+liste2);// [Gunter, Emrah]
		
		isimler.addAll(4,liste2);
		System.out.println("sona liste 2 yi ekledik : "+isimler); // liste 2 yi ekledik : [Ali, Ayse, Veli, Mahmut, Gunter, Emrah]
		
		isimler.addAll( liste2);
		System.out.println("index olmadan liste 2 yi tekrar ekledik"+isimler);
		
		
		
		
		
		
		
	}

}
