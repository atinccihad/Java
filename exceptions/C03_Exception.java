package day40_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_Exception {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Verilen bir int array icin 
        // Kullanicidan sayi isteyin ve girilen sayiyi index olarak kabul edip
		// o index'deki elementi yazdirin
		
		int arr[]= {2,3,5,6,2,7,9,1};
		// InputMismatchException
		
		try {
			Scanner scan=new Scanner(System.in);	
			
			System.out.println("lutfen elementi yazdirmak icin index giriniz");
			int index=scan.nextInt();
			
			System.out.println("girdiginiz indexdeki element: "+arr[index]);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("girdiginizindex array'de yok");
			
		}catch (InputMismatchException e) {
			System.out.println("girdiginiz index pozitif tamsayi olmali");
		}
		
		
		
		
		
	}

}
