package day31_dateAndTime;

import java.time.LocalTime;
import java.time.ZoneId;

public class C02_LocalTime {

	
	public static void main(String[] args) {
		
		LocalTime saat=LocalTime.now();
		
		System.out.println("baslangic saati"+saat);// baslangic saati23:14:32.001472300  // 9. satirdan gecerken sistemden aldigi saat
		
		int sayi=10;
		System.out.println(sayi);
		
		for (int i = 0; i < 100000; i++) {
			sayi++;
		}
		
		LocalTime saatBitis=LocalTime.now();
		System.out.println("bitis saati"+saatBitis);//bitis saati23:14:32.001472300  //  20. satirdan gecerken sistemden aldigi saat
		
		// eger bir islemin baslangic ve bitis zamanini kaydetmek istiyorsak
		// hem basinda hem de sonunda localTime objesi olusturmaliyiz
		
		
		double nano1=saat.getNano();
		double nanobitis=saatBitis.getNano();
		
		System.out.println("For loop "+(nanobitis-nano1)+" nano saniyede tamamlandi");// For loop 2999000.0 nano saniyede tamamlandi
		
		System.out.println(saat.getMinute());//31
		System.out.println(saat.plusMinutes(10000));// 18:12:07.507007500      10000 dk sonra saat
		
		System.out.println(saat.minusHours(20));// 23:33:37.224650400          20 saat once saat
		
		LocalTime yerelSaat=LocalTime.now(ZoneId.of("Turkey"));
		
		System.out.println(yerelSaat);//19:37:14.139016            Türkiye de yerel saat
		

	}

}
