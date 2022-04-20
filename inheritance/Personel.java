package day35_36_37_encapsulation_inhertance;

public class Personel {

	
	protected String isim;
	protected String soyIsim;
	protected boolean calisiyorMu;
	protected String telNo;
	protected int yas;
	
     Personel() {
    	 System.out.println("Personel parametresiz constructor calisti");
	}
	
	// eger variable lara access modifier yazmazsak 
	// Java access modifier olarak default
	// access modifier atar
	// boyle olursa sadece o package altýndaki child class 'lar
	// Personel class'îni inherit edebilir
	// Baska package daki child class'larin da Personel'i inherit edebilmesi icin
	// variable ve method'larin acc.mod'larini protected yapariz
	// Public yapsak da inherit edilebilir ancak biz herkesin erismesini degil de
	// sadece child class larin erismesini istedigimizden protected'i tercih ederiz
	
	public static void main(String[] args) {
	

	}

}
