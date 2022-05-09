package Day_08_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
		int myArray[]= {9,15,11};
	    Arrays.sort(myArray);
	    int ilkEleman=myArray[0];
	    System.out.println(Arrays.toString(myArray));
	    for (int i = 0; i < myArray.length-1; i++) {
			myArray[i]=myArray[i+1];
		}
	    myArray[myArray.length-1]=ilkEleman;
	    System.out.println(Arrays.toString(myArray));
	    
	    // kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini kullanicidan alan
		// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki farki gosteren
		// java programi yazin
	    
	    Scanner scan =new Scanner(System.in);
		System.out.print("arryinizin boyutunu giriniz :");
		int arrBoyutu =scan.nextInt();
	    
		int arr[]=new int[arrBoyutu];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Array in "+(i+1)+" elemanini giriniz");
			arr[i]=scan.nextInt();
			
		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
		
		int fark=arr[arrBoyutu-1]-arr[0];
		System.out.println("farki "+fark);
		
	    scan.close();
	}

}
