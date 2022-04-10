package day27_28_constructor_constructorCall_staticKeyWord;

public class C05_ParametreliConstructor {

	public static void main(String[] args) {
		// java nin olusturdugu default constructor ile obje olusturabiliyoruz
		// ama her obje icin yeniden deger atamasi yapmak uzun oluyor
		// istersek parametreli constractor olusturup
		// daha obje olusurken istedigim ozellikleri atayabilirim
		
		
		@SuppressWarnings("unused")
		Car1 car1=new Car1(50000,     "Vectra",  "Beyaz", 2015      ,  true);
                         //int km,String model,String renk,int yil , boolean satilikMi
		
		
		Car1 car2=new Car1(35000);
                        // int km
		
		System.out.println(car2.km); // 35000
		
		
		
		
		
	}

}
