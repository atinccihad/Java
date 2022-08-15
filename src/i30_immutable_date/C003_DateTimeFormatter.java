package i30_immutable_date;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class C003_DateTimeFormatter {

	public static void main(String[] args) {

		// -----------------------TARIH // ZAMAN // FORMATLAMA-----------------------
		LocalDate bugun = LocalDate.now();
		LocalDate date = LocalDate.of(2020, 11, 15);
		/*
		 * yy: YILIN SON iKi RAKAMI yyyy : yilin tamamini y : yilin tamamini M : ay
		 * sirasini verir TEMMUZ icin : 7 MM: ay sirasiniveriri TEMMUZ icin : 07 MMM: ay
		 * isminin ilkuc harfini verir. JUL MMMM : ay isminin tamamini verir
		 */

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/M/yy");
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("dd/MM/yy");
		DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MMM/yy");
		DateTimeFormatter dtf3 = DateTimeFormatter.ofPattern("dd$M$yyyy");

		System.out.println(dtf.format(date)); // 15/11/20
		System.out.println(dtf1.format(date)); // 15/05/20
		System.out.println(dtf2.format(bugun)); // 02/Agu/21
		System.out.println(dtf3.format(date)); // 15$5$2020

		// ---------------------------------------------------------------
		// bugun ile dogum gunu arasini ve yasimizi hesaplama....

		LocalDate dt = LocalDate.of(2005, 03, 05);
		System.out.println("bugunun tarihi : " + bugun); // bugunun tarihi : 2021-08-11
		System.out.println("faruk dt :" + dt); // faruk dt :2005-03-05
		Period yasim = Period.between(dt, bugun);
		System.out.println("faruk beyin yasi : " + yasim); // faruk beyin yasi : P16Y5M6D
		System.out.println(yasim.getYears()); // 16
	}
}