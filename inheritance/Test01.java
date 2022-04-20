package day35_36_37_encapsulation_inhertance;


class Derived{
	public Derived(String temp) {
		System.out.println("Derived class: "+temp);
	}
}




public class Test01 extends Derived{
    
	public Test01(String temp) {
		super(temp);
		System.out.println("Test Class: "+temp);
	}
	@SuppressWarnings("unused")
	public static void main(String[] argS) {
		Test01 obj=new Test01("Samet");
	}
}
