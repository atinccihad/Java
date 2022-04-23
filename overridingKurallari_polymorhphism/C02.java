package day39_overridingKurallari_polymorhphism;

public class C02 extends C01{

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		C02 obj1=new C02();
	    obj1.privateMethod();//Child class orivate method
	    obj1.staticMethod();//Child class static method calisti
	    
	    C01 obj2=new C02();
	    // obj2.privateMethod();  
	    // data turu C01 oldugundan oncelikle C01 class indaki
	    // method'a bakmamiz gerekir
	    // ancak private oldugundan ulasamayiz
	    // ulasamadigimiz bir method'u override yapamayiz
	    // dolayisiyla signature ayni olmasina RAGMEN bu ikisi farkli method olarak calisir
	    obj2.staticMethod();// Parent class static method calisti
	    // static methodlar override edilemez
	    // dolayisiyla signature ayni olmasina RAGMEN bu ikisi farkli method olarak calisir
	    
	}

	public static void staticMethod() {
		System.out.println("Child class static method calisti");
	}

	private void privateMethod() {
		System.out.println("Child class orivate method");
	}
/*
	public final void finalMethod() {
		System.out.println("Child class final method");
	}
*/
}
