package day20_21_22_23_scope_arrays_MDArrays;

import java.util.Arrays;

public class C14_Array {

	public static void main(String[] args) {
		// Soru 5)  Kullanicidan bir cumle isteyin ve 
		//          cumledeki kelime sayisini yazdirin
		//Scanner scan=new Scanner(System.in);
		//System.out.println("Lutfen bir cumle girin");
		// String cumle=scan.nextLine();
        String cumle="Her sey, Javayla kolay";
		
		String kelimeler[]=cumle.split(" ");
		
		System.out.println(Arrays.toString(kelimeler)); // [Her, sey,, Javayla, kolay]
		
		System.out.println("Girilen cumlede "+kelimeler.length+" adet kelime var");
		//==========Ters YAzilisi=================
		for (int i =kelimeler.length-1; i >= 0 ; i--) {
			System.out.print(kelimeler[i]+" ");
		}
		
		
	}

}
