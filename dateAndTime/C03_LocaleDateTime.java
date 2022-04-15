package day31_dateAndTime;

import java.time.LocalDateTime;

public class C03_LocaleDateTime {

	public static void main(String[] args) {
		
		LocalDateTime tarihSaat=LocalDateTime.now();
		
		System.out.println(tarihSaat);// 2022-01-14T19:41:36.575191600
		
		System.out.println(tarihSaat.toString().startsWith("2022"));// true
		
		
	}

}
