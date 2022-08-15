package i30_immutable_date;

import java.time.LocalDate;

public class C10_LocalDate {

	public static void main(String[] args) {

		// ---------------------------TARIH------------------------------

		LocalDate tarih = LocalDate.now();
		// now su an ki tarihi verir.
		// new keyword u kullanilmaz..

		System.out.println(tarih); // 2021-08-05

		// ---------------------------------------------------------------
		// plusDay ---> gun sonra
		// plusWeek ---> hafta sonra
		// plusMonths ---> ay sonra
		// plusYears ---> yil sonra

		System.out.println(tarih.plusDays(15)); // 2021-08-20
		System.out.println(tarih.plusWeeks(20)); // 2021-12-23
		System.out.println(tarih.plusMonths(7)); // 2022-03-05
		System.out.println(tarih.plusYears(3)); // 2024-08-05

		// ---------------------------------------------------------------
		// minusDay ---> gun once
		// minusWeek ---> hafta once
		// minusMonths ---> ay once
		// minusYears ---> yil once

		System.out.println(tarih.minusDays(15)); // 2021-07-21
		System.out.println(tarih.minusWeeks(20)); // 2021-03-18
		System.out.println(tarih.minusMonths(7)); // 2021-01-05
		System.out.println(tarih.minusYears(3)); // 2018-08-05

		// ---------------------------------------------------------------
		// Hepsini toplu da yazdirabiliriz.

		System.out.println(tarih.plusDays(15).plusWeeks(20).plusMonths(7).plusYears(3));
		// 2025-08-07

		System.out.println(tarih.minusDays(15).minusWeeks(20).minusMonths(7).minusYears(3));
		// 2017-08-03

		// Karisikta yazdirabiliriz..

		System.out.println(tarih.minusDays(15).plusWeeks(20).minusMonths(7).plusYears(3));
		// 2025-07-08

		// ---------------------------------------------------------------
		// artik yil hesaplama... true ve false dondurur. boolean dir.

		System.out.println(tarih.isLeapYear()); // false

		// ---------------------------------------------------------------
		// Kendimiz tarih olusturacak isek ve eski bir tarih olusturacaksak;
		// LocalDate.of methodu kullanilr.

		LocalDate tarih1 = LocalDate.of(1995, 12, 15);
		LocalDate tarih2 = LocalDate.of(1995, 12, 10);

		// Bu 2 tarihi soyyle kiyaslariz..
		// tarih1 tarih2 den sonra mi once mi

		System.out.println(tarih1.isAfter(tarih2)); // true
		System.out.println(tarih1.isBefore(tarih2)); // false

	}

}
