package day39_overridingKurallari_polymorhphism;

public class C01 {
	
public static void staticMethod() {
	System.out.println("Parent class static method calisti");
}

@SuppressWarnings("unused")
private void privateMethod() {
	System.out.println("Parent class orivate method");
}
// final demek bu son hali bir daha degistirilemez demektir
// dolayisiyla final olarak tanimlanan bir method 
// override edilemez
public final void finalMethod() {
	System.out.println("Parent class final method");
}
// child class ile parent class ayni package da olduklarindan 
// methodlarin axcess modifier'i public protected veya default olsaydi hicbir sorun olmazdi
// 
}
