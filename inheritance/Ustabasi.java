package day35_36_37_encapsulation_inhertance;

import day35_36_37_encapsulation_inhertance.Isci;

@SuppressWarnings("unused")
public class Ustabasi extends Isci {
	
	Ustabasi(){
		System.out.println("Ustabasi parametresiz constructor calisti");
	}

	
	public static void main(String[] args) {

		Ustabasi ust1=new Ustabasi();
		
		
		// Java da her class olusturuldugunda otomatik olarak 
		// default constructor olustugu gibi
		// Child class 'da olusturulan her bir constructor un 
		// ilk satirinda gizli   super()    olusturur 

	}

}
