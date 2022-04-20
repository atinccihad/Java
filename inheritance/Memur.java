package day35_36_37_encapsulation_inhertance;

import day35_36_37_encapsulation_inhertance.Muhasebe;

@SuppressWarnings("unused")
public class Memur extends Muhasebe{

	public static void main(String[] args) {
	
		Memur memur1=new Memur();
		
		memur1.isim="Hasan";
		memur1.saatUcreti=16;
		memur1.maas=memur1.massHesapla();
		System.out.println(memur1.isim+"'in maasi: "+memur1.maas);// Hasan'in maasi 3200

	}

}
