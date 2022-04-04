package day20_21_22_23_scope_arrays_MDArrays;

import java.util.Arrays;

public class C08_Split {

	public static void main(String[] args) {
		// "Java ogrenmek cok guzel"
		// cumlesininin kelimelerini ters sirada yazdirin
		
		String cumle="Java ogrenmek cok guzel";
		
		String kelimeler[]=cumle.split(" ");
		
		System.out.println(Arrays.toString(kelimeler)); // [Java, ogrenmek, cok, guzel]
		
		for (int i =kelimeler.length-1; i >=0 ; i--) {
			
			System.out.print(kelimeler[i]+" "); // guzel cok ogrenmek Java 
		}
		

	}

}
