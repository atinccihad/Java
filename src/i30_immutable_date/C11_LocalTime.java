package i30_immutable_date;

import java.time.LocalTime;
import java.time.ZoneId;
import java.util.Iterator;

@SuppressWarnings("unused")
public class C11_LocalTime {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {

		// -------------------------------ZAMAN-----------------------------------------
		
		LocalTime saat = LocalTime.now();
		// now su an ki zamani verir.
		
		System.out.println(saat); // 03:42:15.409802400
		

		for (int i = 0; i < 1000000; i++) {
			i += 1;
		}
		// java ne kadar hizli oldugunu gorme adina ... 03:42:15.736226100
		// 1000000 kere dondurdu mili saniyeler icinde

		// -----------------------------------------------------------------------------------
		// plusSeconds ---> saniye sonra
		// plusMinutes ---> dakika sonra
		// plusHours ---> saat sonra

		System.out.println(saat.plusHours(5)); // 08:42:15.409802400
		System.out.println(saat.plusSeconds(14593983)); // 01:38:19.311469700
		System.out.println(saat.plusMinutes(120)); // 05:45:16.311469700

		// -----------------------------------------------------------------------------------
		// minusSeconds ---> saniye once
		// minusMinutes ---> dakika once
		// minusHours ---> saat once

		System.out.println(saat.minusHours(5)); // 22:46:59.165918200
		System.out.println(saat.minusSeconds(14593983)); // 05:53:56.165918200
		System.out.println(saat.minusMinutes(120)); // 01:46:59.165918200

		// -----------------------------------------------------------------------------------		
		// Hepsini toplu da yazdirabiliriz.
		System.out.println(saat.plusHours(15).plusMinutes(20).plusSeconds(7897347)); 
		// 04:52:56.719613600

		System.out.println(saat.minusHours(15).minusMinutes(20).minusSeconds(7897347)); 
		// 02:48:02.719613600

		// Karisikkta yazdirabiliriz..
		System.out.println(saat.minusHours(15).plusMinutes(20).minusSeconds(7897347)); 
		// 03:28:02.719613600

		// -----------------------------------------------------------------------------------
		// getSeconds getHours ve getMinutes ile de o an ki saat dakika ve saniyeyi
		// getirebiliriz..
		System.out.println(saat.getHour()); // 3 ---> su an da saat 3 sadece saati getirir..

		// -----------------------------------------------------------------------------------		
		// Baska ulke saatleri ZoneId methodu ile yapilir..

		System.out.println(saat.now(ZoneId.of("Japan"))); // 09:58:51.322988400
		System.out.println(saat.now(ZoneId.of("America/Chicago"))); // 19:59:32.317338900

	}
}
