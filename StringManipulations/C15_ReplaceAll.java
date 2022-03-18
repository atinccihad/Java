package day11_12_13_stringManipulations;

public class C15_ReplaceAll {

	public static void main(String[] args) {
		
		String str="*Java 98ogrenmek c..ok k876olay ";
		
		// replaceAll methodlari kullanarak Java ogrenmek kolay
		
		str=str.replaceAll("\\d", "");	// *Java ogrenmek c..ok kolay	
		 
		
		str=str.replaceAll("\\s", "x");  // *Javaxogrenmekxc..okxkolayx
		  
		
		str=str.replaceAll("\\W", ""); // Javaxogrenmekxcokxkolayx
		   
		
		str=str.replaceAll("\\W", ""); // Javaxogrenmekxcokxkolay
		 
		
		str=str.replace("x", " ");
		System.out.println(str);  // Java ogrenmek cok kolay 

		

	}

}
