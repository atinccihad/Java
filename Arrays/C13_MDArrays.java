package day20_21_22_23_scope_arrays_MDArrays;

public class C13_MDArrays {

	public static void main(String[] args) {
		// Soru 2) Asagidaki multi dimensional array'in 
		//         ic array'lerindeki son elemanlarin carpimini
		//         ekrana yazdiran bir program yaziniz   { {1,2,3},{4,5},{6} } 

		
		int arr[][]={ {1,2,3},{4,5},{6} }; 
		
		int carpim=1;
		
		for (int i = 0; i < arr.length; i++) {
		
			int sonelementIndex=arr[i].length-1;
			
			carpim *= arr[i][sonelementIndex];
		}
		System.out.println("son elemanlarin carpimi= "+carpim);
	}

}
