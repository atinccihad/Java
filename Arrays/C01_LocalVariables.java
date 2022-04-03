package day20_21_22_23_scope_arrays_MDArrays;

public class C01_LocalVariables {
	
	String okulIsmi;

	public static void main(String[] args) {
		// Java local  variable lara default deger atamaz
		// Kodlarimizda sorun yasamamak icin 
		// olusturdugumuz local variable lara uygun bir deger atamamizda fayda var
		
		int sayi=0;  // int sayi; dersek java cte veriyor
		System.out.println(sayi);

		//int sayi;// bir local de ayni isimde birden fazla variable olusturulamaz
		//String sayi; // data turu farkli olsa da java buna izin vermez
		@SuppressWarnings("unused")
		String isim="Ali";
		
		
		
		
	}
    public static void staticMethod() {
    	//sayi; // bir local de olusturulan variable (method larin static olup  olmamasina 
    	      // bagli olmaksizin) farkli local de kullanilamaz
    	@SuppressWarnings("unused")
		String isim="Veli";
    }
}
