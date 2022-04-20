package day35_36_37_encapsulation_inhertance;

public class Isci extends Muhasebe {
	
	protected String statu;
	protected String meslegi;
	protected String sendika;
	public Isci(){
		System.out.println("Isci parametresiz constructor calisti");
	}
	
	public static void main(String[] args) {
		
	Isci isci1=new Isci();
    isci1.meslegi="Kaynakci";
    isci1.saatUcreti=20;
    isci1.isim="Emine";
    isci1.maas=isci1.massHesapla();
    System.out.println(isci1.isim+"'in maasi : "+isci1.maas);// Emine'in maasi : 4000
    
    
	}

}
