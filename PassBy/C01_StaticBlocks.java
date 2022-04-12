package day29_staticBlock_passByValue;

public class C01_StaticBlocks {

	static {
		System.out.println("static block main method'dan bile once calisir");
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("Javada once main method calisir");
		
	}

	static {
		System.out.println("static block nereye yazilirsa yazilsin main method'dan once calisir");
	}
	// eger birden fazla static block varsa Java yukaridakini daha once calisir
}
