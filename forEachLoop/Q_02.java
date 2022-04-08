package day26_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class Q_02 {

	public static void main(String[] args) {
		// integer bir list olusturunuz ve bu list'deki run sayilarin 
		// karesinin toplamini For-each loop kullanarak bulunuz.Sonucu ekrana yazdiriniz.
		
		List <Integer> str=new ArrayList<>(); 
		str.add(9);
		str.add(90);
		str.add(5);
		str.add(4);
		str.add(1);
		int karelerToplami=0;
		
       for (int each : str) {
			
			karelerToplami+=each*each;
		}
		System.out.println("kareler toplami= "+karelerToplami);
	}

}
