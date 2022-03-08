package day07_ýfStatements;

import java.util.Scanner;

public class C03_BasitIfcumleleri {

	public static void main(String[] args) {
		/*
		 * Soru3) Kullanicidan gun ismini alin ve 
		 * haftaici veya hafta sonu oldugunu yazdirin
		 * Ornek:      gun=Pazar     output="Hafta sonu"
		 *             gun=Sali      output="Hafta ici"
		 *       String icin equals method'unu kullanin      
		 */
		Scanner scan =new Scanner(System.in);
		System.out.println("Lutfen gun ismini yaziniz");
		String gun=scan.next().toLowerCase();
		
		if (gun.equals("pazar") || gun.equals("cumartesi")) {
			System.out.println("Hafta sonu");
		}
		
		if (gun.equals("pazartesi") || gun.equals("cuma")|| gun.equals("sali")||gun.equals("carsamba")||gun.equals("persembe")) {
			System.out.println("Hafta ici");
		}
		
		//String non primitive oldugu icin==kullanilmaz bunun yerine equals()  kullanilmalidir
		
		
		scan.close();
	}

}
