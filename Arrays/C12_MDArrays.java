package day20_21_22_23_scope_arrays_MDArrays;

import java.util.Arrays;

public class C12_MDArrays {

	public static void main(String[] args) {
		// Soru 1) Asagidaki multi dimensional array'in
		// tum elemanlarin carpimini ekrana yazdiran bir method yaziniz 
		// {{1,2,3},{4,5,6,7}}
		
		int arr[][]={{1,2,3},{4,5,6,7},{3,4}};

		carpimYazdir(arr);
		
		
		
		
		
		
		
		
		
		
		System.out.println(Arrays.deepToString(arr)); //[[1, 2, 3], [4, 5, 6, 7]]
		
		System.out.println(arr[0][0]*arr[0][1]+arr[0][2]*arr[1][0]+arr[1][1]*arr[1][2]*arr[1][3]);
		
		int carpim=1;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				carpim*=arr[i][j];
			}
		}
		System.out.println("Tum elemanlarin carpimlari= "+carpim);
	}

	public static void carpimYazdir(int[][] arr) {
        int carpim=1;
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length; j++) {
				carpim*=arr[i][j];
			}
		}
		System.out.println("Tum elemanlarin carpimlari= "+carpim);
		
	}

}
