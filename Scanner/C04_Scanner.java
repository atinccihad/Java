package day04_IncrementDecrement;

import java.util.Scanner;

public class C04_Scanner {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		
		//kullanýcýdan deger almakicin 3 adim takip edilir
		//1.adým Scanner objesi olusturmak
		
		Scanner scan=new Scanner(System.in);
		
		//ikinci adým kullanýcýya ne istedigimizi soylemek
		
		System.out.println("lutfen isminizi yaziniz");
		
		String isim=scan.next();
		
		System.out.println("isminiz... "+isim);
		
		
		
		
		//scan bir scanner objesidir
		//isim olarak farkli bir isim yazsak da calisir ama biz scan demeyi tercih ederiz
		//scan bir obje oldugu icin non-primitive'dir
		//primitive data turleri sadece deger icerirken
		//non-primitive data turleri degerin yaninda method'lar barindirir
		//scan. dedigimizde kullanabiecegimiz bu method'lari gorebiliriz
		
		
	
		
	}

}
