package day29_staticBlock_passByValue;

import java.util.ArrayList;
import java.util.List;

public class C04_PassByValueList {

	public static void main(String[] args) {
		// bir list olusturalim
		// sonra list elemanlarini degistir method'u yazip orada
		// list elemanlarindan bazilarini degistirelim
		// method void olsun 
		// main method'a dondukten sonra yeniden list'i yazdiralim
		
		List<String> harfler=new ArrayList<>();
		harfler.add("A");
		harfler.add("B");
		harfler.add("C");
		
		
		listElemanlarDegistir(harfler);//  [D, B, C]
		System.out.println("Method'a donunce list: "+harfler);// Method'a donunce list: [D, B, C]
		
		// Java'da List ve Array gibi objeler icinde pass by Value gecerlidir
		// Yani farkli bir method'da array veya list'e yeni deger atamasi yaparsaniz
		// orjinal array veya list degismez
		
		listDegistir(harfler);// method'da yeni deger atadigim halde harfler listesi degismedi
		System.out.println("list'e yeni list atadiktan sonra Method'a donunce list: "+harfler);// list'e yeni list atadiktan sonra Method'a donunce list: [D, B, C]
	}

	private static void listDegistir(List<String> harfler) {
	harfler=new ArrayList<>();
		System.out.println("List'e yeni deger atayinca"+harfler);// []
	}

	private static void listElemanlarDegistir(List<String> harfler) {
	
		harfler.set(0, "D");
		System.out.println("Method'da degistirdigimiz list: "+harfler);// Method'da degistirdigimiz list: [D, B, C]
		
	}

}
