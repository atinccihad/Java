package day20_21_22_23_scope_arrays_MDArrays;

import java.util.Arrays;

public class C16_CopyOf {

	
		
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
			
			int birlesikArray[]=Arrays.copyOf(arr1, arr1.length+arr2.length);
			// [3,5,7,10,0,0,0]
					
			for (int i = 0; i < arr2.length; i++) { // 2. array in elemanlarini alacagiz
				birlesikArray[i+arr1.length]=arr2[i];
			}
			return birlesikArray;
		}

		

	}

