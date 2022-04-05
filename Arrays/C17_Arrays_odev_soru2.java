package day20_21_22_23_scope_arrays_MDArrays;

public class C17_Arrays_odev_soru2 {

	public static void main(String[] args) {
		// 2) Asagidaki multi dimensional array in ic array'lerindeki son elemanlarin carpimini
		// ekrana yazdiran program yaziniz { {1,2,3},{4,5},{6} }
		
		int arr[][]={ {1,2,3},{4,5},{6} };
		
		int carpim=1;
		
		for (int i = 0; i < arr.length; i++) {
			int sonEleman=arr[i].length-1;                                 {
				carpim*=arr[i][sonEleman];
			}
		}
		System.out.println(carpim);
		
		
		
	}

}
