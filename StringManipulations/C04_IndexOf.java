package day11_stringManipulations;

public class C04_IndexOf {

	public static void main(String[] args) {
		// Parametre olarak girilen bir char veya String'in
		// ilk index'ini verir
		
		String str="Calisirsaniz, Java ogrenmek cok kolay";
		
		System.out.println(str.indexOf('s')); // 4
		System.out.println(str.indexOf("J")); // 14
		
		int index=str.indexOf("r"); // indexof() method'u bize her zaman int bir deger doner
		
		System.out.println(index); // 6
		
		System.out.println(str.indexOf('q')); //-1 
		// Bir String icinde olmayan bir karakter veya kelime ararsak java -1 sonucunu dondurur
		
		System.out.println(str.indexOf('A')); // -1 
		
		System.out.println(str.indexOf("va og")); // 16
		// aradigimiz charSquence anlamli veya anlamsiz bir kelime olabilir 
		//bu durumda java aradigimiz CS(CharSquence)'i tek bir paket gibi dusunur ve o paketin baslangic indexini verir
		
		System.out.println(str.indexOf('e',15)); // 22
		                              // 15inci indexten sonraki ilk 'e' nin indexini verir
		
	}

}
