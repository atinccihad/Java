package Day_07_While_DoWhile;

import java.util.Scanner;

public class Q_07 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Kullan�c�da x  girilene kadar ekrana "Program �al���yor" yazan
        // ve x girildi�inde ise "Program bitti" yazan program� yaz�n�z.
        Scanner scan = new Scanner(System.in);
       System.out.println("string giriniz");
        String str ="";
        
        do {
            str = scan.nextLine();
            if (str.equals("x")) break; // break : d�ng� k�r�yor

            System.out.println("Program �al���yor");
        } while (!str.equals("x"));

        System.out.println("Program bitti.");

        
        
        
	}

}
