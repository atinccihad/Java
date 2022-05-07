package Day_07_While_DoWhile;

import java.util.Scanner;

public class Q_07 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Kullanýcýda x  girilene kadar ekrana "Program çalýþýyor" yazan
        // ve x girildiðinde ise "Program bitti" yazan programý yazýnýz.
        Scanner scan = new Scanner(System.in);
       System.out.println("string giriniz");
        String str ="";
        
        do {
            str = scan.nextLine();
            if (str.equals("x")) break; // break : döngü kýrýyor

            System.out.println("Program çalýþýyor");
        } while (!str.equals("x"));

        System.out.println("Program bitti.");

        
        
        
	}

}
