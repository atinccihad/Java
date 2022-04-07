package day24_25_arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class C07_Sort {

	public static void main(String[] args) {
		
		List <String> isimler=new ArrayList<>();
		
		isimler.add("Kutlu");
		isimler.add("Emrah");
		isimler.add("Ferhat");
		
		System.out.println(isimler);// [Kutlu, Emrah, Ferhat]
		
		Collections.sort(isimler);
		System.out.println(isimler); // [Emrah, Ferhat, Kutlu]  naturel order
		
		isimler.add("filiz");
		System.out.println(isimler);// [Emrah, Ferhat, Kutlu, filiz]
		Collections.sort(isimler);
		System.out.println(isimler);// [Emrah, Ferhat, Kutlu, filiz]
		
		
	}

}
