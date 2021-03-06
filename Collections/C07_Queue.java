package day45_46_Collections;

import java.util.LinkedList;
import java.util.Queue;

public class C07_Queue {

	public static void main(String[] args) {
		// Gelen sona gelir ayrilan bastan ayrilir
		// FirstİnFirstOut ==> FIFO
		
		Queue<String> kuyruk=new LinkedList<>();
		
		kuyruk.add("Lutfullah");
		kuyruk.add("Mustafa");
		kuyruk.add("Ridvan");
		
		System.out.println(kuyruk);// [Lutfullah, Mustafa, Ridvan]

		kuyruk.remove();
		System.out.println(kuyruk);//[Mustafa, Ridvan]
		
		kuyruk.remove();
		System.out.println(kuyruk);// [Ridvan]
		
		kuyruk.add("Ridvan");
		System.out.println(kuyruk);// [Ridvan, Ridvan]
		
		kuyruk.add(null);
		kuyruk.add(null);
		kuyruk.add(null);
		System.out.println(kuyruk);// [Ridvan, Ridvan, null, null, null] 
		

	}

}
