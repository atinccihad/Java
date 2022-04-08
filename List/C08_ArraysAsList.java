package day24_25_arrayList;

import java.util.Arrays;
import java.util.List;

public class C08_ArraysAsList {

	public static void main(String[] args) {
		// Verilen array i Arrays class indan yardim alark list e cevirebiliriz

		String arr[]= {"A","B","C","d"};
		
		List<String> arraydenList= Arrays.asList(arr);
		
		System.out.println("List : "+arraydenList); //[A, B, C, d]

		//arraydenList.add("F");  // RTE  UnsupportedOperationException : desteklenmeyen islem
		                              // CTE olmasi icin syntax de bir problem olmali
		//System.out.println(arraydenList);  // ancak bu yazimda syntax hatasi yok
		
		
		// bu sekilde Arrays class indan yardim alark array i list e cevirirsek 
		// olusturdugumuz list in boyutu sabit olur 
		// dolayisiyla add() veya clear() gibi methodlari calistirmak istersek
		// UnsupportedOperationException : desteklenmeyen islem verir
		
		
		arr[1]="Z";
		System.out.println("Array i degistirdikten sonra array = "+Arrays.toString(arr));// [A, Z, C, d]
		System.out.println("Array i degistirdikten sonra list = "+arraydenList);// [A, Z, C, d]
		
		arraydenList.set(3, "D");
		System.out.println("List i degistirdikten sonra list = "+arraydenList);// [A, Z, C, d]
		System.out.println("List i degistirdikten sonra Array = "+Arrays.toString(arr));// [A, Z, C, d]
	}

}
