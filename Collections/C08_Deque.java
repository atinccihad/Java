package day45_46_Collections;

import java.util.Deque;
import java.util.LinkedList;

public class C08_Deque {

	public static void main(String[] args) {

		Deque<String>ciftBasli=new LinkedList<>();
		
		ciftBasli.add("Yildiz");
		ciftBasli.add("Ali");
		System.out.println(ciftBasli);// [Yildiz, Ali]  add() QUEUE'dan geldiginden sona ekler
		ciftBasli.addLast("Emine");
		System.out.println(ciftBasli);// Deque'den gelen ozellik
		
		System.out.println(ciftBasli.pop());//Yildiz   ilk elementi sildi  ve sildigini bize dondurdu
		
		System.out.println(ciftBasli);// [Ali, Emine]
		
		ciftBasli.push("Seyfullah");
		System.out.println(ciftBasli);// [Seyfullah, Ali, Emine]
		
		ciftBasli.add(null);
		System.out.println(ciftBasli);// [Seyfullah, Ali, Emine, null] 

	}

}
