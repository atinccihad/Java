package day11_12_13_stringManipulations;

public class C09_Contains {

	public static void main(String[] args) {
		
		String cumle="Calisirsaniz, java ogrenmek cok kolay";
		
		System.out.println(cumle.contains(" ")); // true
		System.out.println(cumle.contains("iz, j")); // true
		
		System.out.println(cumle.contains("Hasan")); // false 
	}

}
