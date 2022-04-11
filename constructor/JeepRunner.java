package day27_28_constructor_constructorCall_staticKeyWord;

public class JeepRunner {

	public static void main(String[] args) {
		// Jeep class indan bir obje olusturalim ve ozelliklerini yazalim
		
		Jeep jeep1=new Jeep();
		
		System.out.println(jeep1.fiyat+" "+jeep1.ilanNo+" "+jeep1.marka+" "+jeep1.model+" "+jeep1.yil); // 10000 1001 null null 2001 
		
		// jeep class inda variable lar instance variable olduklarindan 
		// atadigim degerler sadece benim objem icin degerleri degistirir
		// jeep class indaki degerlere hicbirsey yapmaz
		
		jeep1.fiyat=15000;
		jeep1.ilanNo=1002;
		jeep1.marka="Toyota";
		jeep1.model="Corolla";
		jeep1.yil=2005;
		System.out.println(jeep1.fiyat+" "+jeep1.ilanNo+" "+jeep1.marka+" "+jeep1.model+" "+jeep1.yil); // 15000 1002 Toyota Corolla 2005
		
		jeep1.hiz(150); // araba saatte 150 km yapar
		jeep1.yakit("benzin"); // araba yakit olarak benzin kullanir
	}

}
