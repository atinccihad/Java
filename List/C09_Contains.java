package day24_25_arrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C09_Contains {

	public static void main(String[] args) {
		
		// verilen bir array 'de tekrar eden elementleri sadece birer tane yazarak
		// unique elementlerden olusan bir array haline getirelim
		
		int arr[]= {2,3,4,5,3,6,2,5,3,7,4,8,5,9,1,0,3,5};
		
		// 2,3,4,5,6,7,8,9,1,0
		
		List<Integer> tekrarsiz= new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (!tekrarsiz.contains(arr[i])) {
				
				tekrarsiz.add(arr[i]);
			}
		}
		System.out.println("tekrarsiz list "+tekrarsiz);
		
		int tekrarsizArray[]=new int[tekrarsiz.size()]; // [0,0,0,0,0,0,0,0,0,0]
		
		for (int i = 0; i < tekrarsizArray.length; i++) {
			
			tekrarsizArray[i]=tekrarsiz.get(i);
		}
	     Arrays.sort(tekrarsizArray);      // kusukten buyuge siralama yaptik
		System.out.println("tekrarsiz array "+Arrays.toString(tekrarsizArray));

	}

}
