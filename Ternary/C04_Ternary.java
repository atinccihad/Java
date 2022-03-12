package day10_ternary_SwitchCase;

import java.util.Scanner;

public class C04_Ternary {

	public static void main(String[] args) {
		
		// Soru 4) Kullanicidan bir sayi alin.Sayi pozitifse"Sayi Pozitif" yazdirin
		// negatifse sayinin karesini yazdirin 
		Scanner scan=new Scanner (System.in);
		System.out.println("Lutfen bir sayi giriniz");
		double sayi=scan.nextDouble();
		
		System.out.println(sayi>0 ? "Sayi Pozitif" : (sayi*sayi));
		
		
		
		scan.close();

	}

}
