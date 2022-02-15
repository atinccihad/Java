package day03_scanner;

import java.util.Scanner;

public class C01_Scanner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		//Soru3) Kullanicidan yaricap isteyip cemberin cevresini ve dairenin alanini hesaplayip yazdirin
		//ve dairenin alanini hesaplayip yazdirin
		
		// Kullanicidan deger alacagimiz icin Scanner objesi olusturmalýyýz
		
		Scanner scan=new Scanner(System.in);
		//scanner objesi olusturdugumuzda altýný kýrmýzý çizer üstüne gelip java util i secersek duzelir
		System.out.println("Lutfen cemberin yaricapini giriniz");
		//Kullanýcýya mesaj vermek icin system out.prýntln syso+control+space
		double yaricap=scan.nextDouble();
		//virgüllü küsüratlý ihtimaline karsi double kullanmak daha mantýklý
		double cevre=2*3.14*yaricap;
		//   2 pÝ R
		double alan=3.14*yaricap*yaricap;
		//  cevre = pÝ * yaricap karesi
		
		//cemberin cevresi = 25.7
		//dairenin alani   =26.31
		
		System.out.println("cemberin cevresi : " + cevre);
		System.out.println("dairenin alani : " + alan);
		
		
		
		
		
		
		
	}

}
