package day35_36_37_encapsulation_inhertance;

public class Muhasebe extends Personel {
	
	protected int saatUcreti;
	protected String statu;
	protected int maas;
	
	public Muhasebe(){
		System.out.println("Muhasebe parametresiz constructor calisti");
	}

	public static void main(String[] args) {
		
	Muhasebe clsn1=new Muhasebe();	

	clsn1.isim="Ali";
	System.out.println(clsn1.soyIsim);// null
	
		
		
		
		
		
		
		
	}

	public int massHesapla() {
		
		int maas =8*25*saatUcreti;
		
		return maas;
	}
}
