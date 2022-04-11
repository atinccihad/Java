package day27_28_constructor_constructorCall_staticKeyWord;

public class TirRunner {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		// bir tane tum ozellikleri degistiren constructor olusturalim
		
		Tir tir1=new Tir(5000,"axor","beyaz",2020,false);
		 //int km,String model,String renk,int yil , boolean satilikMi
		
		System.out.println(tir1.km+" "+tir1.model+" "+tir1.renk+" "+tir1.yil+" "+tir1.satilikMi);
	                       //int km   ,String model,String renk ,  int yil ,  boolean satilikMi       
		                   //5000         axor          beyaz         2020             false
		
		
		// uc ozelligi degistirren bir constructor olusturalim
		// int km, String model, String renk
		
		Tir tir2=new Tir(12000,"kar","kirmizi");
		System.out.println(tir2.km+" "+tir2.model+" "+tir2.renk+" "+tir2.yil+" "+tir2.satilikMi);// 12000 kar kirmizi 2000 false
		
	}

}
