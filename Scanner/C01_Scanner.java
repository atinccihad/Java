package day03_scanner;

import java.util.Scanner;

public class C01_Scanner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Soru3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin
		//ve dairenin alanini hesaplayip yazdirin
		
		// Kullanicidan deger alacagimiz icin Scanner objesi olusturmal�y�z
		
		Scanner scan=new Scanner(System.in);
		//scanner objesi olusturdugumuzda alt�n� k�rm�z� �izer �st�ne gelip java util i secersek duzelir
		System.out.println("Lutfen cemberin yaricapini giriniz");
		//Kullan�c�ya mesaj vermek icin system out.pr�ntln syso+control+space
		double yaricap=scan.nextDouble();
		//virg�ll� k�s�ratl� ihtimaline karsi double kullanmak daha mant�kl�
		double cevre=2*3.14*yaricap;
		//   2 p� R
		double alan=3.14*yaricap*yaricap;
		//  cevre = p� * yaricap karesi
		
		//cemberin cevresi = 25.7
		//dairenin alani   =26.31
		
		System.out.println("cemberin cevresi : " + cevre);
		System.out.println("dairenin alani : " + alan);
		
		
		
		
		
		
		
	}

}
