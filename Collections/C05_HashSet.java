package day45_46_Collections;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class C05_HashSet {

	public static void main(String[] args) {
		// Verilen bir Array'deki tekrar eden sayilari silip
		// unique degerlerden olusan bir array olusturun
		
		int arr[]= {3,4,6,9,5,8,7,9,1,7,8,9,5,4,6,2};
		
		Set <Integer> benzersizSet=new HashSet<>();
		
		for (Integer each : arr) {
			
			benzersizSet.add(each);
		}
		System.out.println(benzersizSet);// [1, 2, 3, 4, 5, 6, 7, 8, 9]
		
		Object[] tekrarsizArr=benzersizSet.toArray();// Set'i array'e cevirir 
		
		System.out.println(Arrays.toString(tekrarsizArr));// [1, 2, 3, 4, 5, 6, 7, 8, 9]
		

	}

}
