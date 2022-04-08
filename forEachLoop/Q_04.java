package day26_forEachLoop;

import java.util.Arrays;

public class Q_04 {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// Bir String olusturunuz bu String'deki character'leri
		// for-each loop kullanarak yazdiriniz
		
		String isim="Cihad";
		String harfler[]=isim.split("");// [C, i, h, a, d]
		
		
		
		
		
		for (String each : harfler ) {
			Arrays.toString(harfler);
			
			
		}System.out.println(Arrays.toString(harfler));
	}

}
