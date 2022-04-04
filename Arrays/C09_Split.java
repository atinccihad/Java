package day20_21_22_23_scope_arrays_MDArrays;

import java.util.Arrays;

public class C09_Split {

	public static void main(String[] args) {
		// "Java ogrendim,  #cok para ?kazandim.,"
		// cumlesinin kelimelerini, ozel karakterler ve noktalama isasretleri olmadan 
		// harf sirasina gore yazdiralim
		
		String cumle="Java ogrendim,  #cok para ?kazandim.,";
		
		String kelimeler[]=cumle.split(" ");
		
		System.out.println(Arrays.toString(kelimeler)); // [Java, ogrendim,, , #cok, para, ?kazandim.,]
		
		for (int i = 0; i < kelimeler.length; i++) {
			kelimeler[i]=kelimeler[i].replaceAll("\\W", "");
			
			System.out.println(kelimeler[i]);
		}
		
		System.out.println(Arrays.toString(kelimeler)); // [Java, ogrendim, , cok, para, kazandim]

		Arrays.sort(kelimeler);
		@SuppressWarnings("unused")
		String yeniCumle="";
		
		for (int i = 0; i < kelimeler.length; i++) {
			System.out.print(kelimeler[i]+" ");
			
			
		}
	}

}
