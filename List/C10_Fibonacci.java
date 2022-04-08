package day24_25_arrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class C10_Fibonacci {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Verilen bir sayidan kucuk fibonacci sayisini bir list olarak kaydedin
		
		// 1,1,2,3,5,8,13,21,34,55,.......
	Scanner scan=new Scanner(System.in);
		
		
	
	    int sinir=100;
		
		List <Integer> fibonacci= new ArrayList <>();
		
		fibonacci.add(1);
		fibonacci.add(1);
		int sayi=0; 
		
		
		
		while(sayi<sinir) {
		
			sayi=fibonacci.get(fibonacci.size()-2)+fibonacci.get(fibonacci.size()-1);
			if (sayi>sinir) {
				} else {fibonacci.add(sayi);
	        }
		}
		
		System.out.println(fibonacci);    // [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144]
		//fibonacci.remove(fibonacci.size());
		//System.out.println(fibonacci);    // [1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89]
		
		scan.close();
	}

}
