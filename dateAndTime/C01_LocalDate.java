 package day31_dateAndTime;

import java.time.LocalDate;
import java.time.Month;

public class C01_LocalDate {

	public static void main(String[] args) {
		
		LocalDate tarih=LocalDate.now();
		
		System.out.println(tarih);//2022-01-13
		
		System.out.println(tarih.getDayOfYear());// 13     yilin 13. günü
		System.out.println(tarih.getDayOfMonth());//13      ayin 13. günü
		System.out.println(tarih.getDayOfWeek());//THURSDAY
		System.out.println(tarih.getMonthValue());//1   yilin ilk haftasi
		System.out.println(tarih.getMonth());// JANUARY     ay'i yazdirdi
		
		
		System.out.println(tarih.plusDays(20));// 2022-02-02    bundan 20 gun sonra tarih
		System.out.println(tarih.plusMonths(5));//2022-06-13    5 ay sonraki tarih
		System.out.println(tarih.plusWeeks(15));//2022-04-28    15 hafta sonra tarih
		System.out.println(tarih.plusYears(4));//2026-01-13     4 sene sonra tarih
		
		
		System.out.println(tarih.plusYears(10).plusMonths(10).plusDays(10));//2032-11-23      10 yil 10 ay 10 gün sonraki tarih
		
		System.out.println(tarih.minusDays(20));//2021-12-24    20 gun onceki tarih
		System.out.println(tarih.minusWeeks(20));//2021-08-26   20 hafta onceki tarih
		System.out.println(tarih.minusYears(5).minusMonths(5).minusDays(5));//2016-08-08      5 yil 5 ay 5 gun onceki tarih
		
		System.out.println(tarih.minusYears(20).isLeapYear());//true   2000 yili leap yil oldugu icin true verir
		
		LocalDate dogumTarihi1=LocalDate.of(1988, Month.MARCH, 12);// 1988-03-12
		LocalDate dogumTarihi2=LocalDate.of(2000, Month.JANUARY, 12);// 2000-01-12
		LocalDate dogumTarihi3=LocalDate.of(1985, 10, 10);
		
		System.out.println(dogumTarihi1+","+dogumTarihi2);// 1988-03-12,2000-01-12
		
		System.out.println(dogumTarihi1.isAfter(dogumTarihi2));// false     d.tarihi1  dogum tarihi 2 den sonra mi == false
		System.out.println(dogumTarihi3);// 1985-10-10
		
		System.out.println(dogumTarihi3.isBefore(dogumTarihi1));// true
		
	}

}
