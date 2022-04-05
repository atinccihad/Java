package day20_21_22_23_scope_arrays_MDArrays;

import java.util.Arrays;

public class C15_Arrays {

	public static void main(String[] args) {
		// Verilen iki array'i birlestiren ve sonucu 
		// birlesikArray isminde kaydeden bir method olusturunuz
		// bir method olusturun
		// main method icinde yeni array'i siralayip yazdiriniz
		
		int arr1[]= {3,5,7,10};
		int arr2[]= {2,4,6,8,9}; 
		
	   
		
		int birlesikArray[]=birlestir(arr1,arr2);
		 Arrays.sort(birlesikArray);
		
		System.out.println(Arrays.toString(birlesikArray));  // [3, 5, 7, 10, 0, 0, 0, 0, 0]
	                                                   // 2. for loop dan sonra===>  [3, 5, 7, 10, 2, 4, 6, 8, 9]
	    
	   
	    
		
	    
	   


	}	private static int[] birlestir(int[] arr1, int[] arr2) {
		
		int birlesikArray[]=new int[arr1.length+arr2.length]; 
		
		for (int i = 0; i < arr1.length; i++) {// 1. array in elemanlarini birlesik array e atadik
			
			birlesikArray[i]=arr1[i];
			
		}
		for (int i = 0; i < arr2.length; i++) { // 2. array in elemanlarini alacagiz
			birlesikArray[i+arr1.length]=arr2[i];
		}
		return birlesikArray;
	}

	

}
