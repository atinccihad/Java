package Day_03;

import java.util.Scanner;

public class Q_01 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("vize sýnav sonucunu giriniz");
		double vizeNot=scan.nextDouble(); 
		System.out.println("final sýnav sonucunu giriniz");
		double finalNot=scan.nextDouble();
		
		double toplam=vizeNot*40/100+finalNot*60/100;
		
		if (toplam>=90) {
			System.out.println("notunuz AA");
		} else if (toplam>=80) {
			System.out.println("notunuz BA");
		} else if (toplam>=70) {
			System.out.println("notunuz BB");
		} else if (toplam>=60) {
			System.out.println("notunuz CB");
		} else if (toplam>=50) {
			System.out.println("notunuz CC");
		} else if (toplam>=40) {
			System.out.println("notunuz DC");
		} else if (toplam>=30) {
			System.out.println("notunuz DD");
		} else if (toplam<30) {
			System.out.println("notunuz FF");
		}
		scan.close();
	}

}
