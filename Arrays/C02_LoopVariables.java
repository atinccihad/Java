package day20_21_22_23_scope_arrays_MDArrays;

public class C02_LoopVariables {

	public static void main(String[] args) {  
		
		int sayi=10;
		
		for (int i = 0; i < 6; i++) {
			String isim="Ali";
			System.out.println(sayi+" "+isim);
		}
		 //  System.out.println(i);
		//System.out.println(isim);// loop un icinde olusturdugumuz bir variable i disarida kullanamayiz
		
		// loop icerisinde olusturulmus olan variable lar loop disinda kullanilamazlar
		// Bunun icin loop disinda da ihtiyacimiz olan bir degisken varsa
		// loop dan once olusturulur ve emniyette kalmak icin initialize yapariz
		
		
		
		for (int i = 0; i < 10; i++) {
		//	int sayi=20;     sayþ variable i main method icinde olusturuldugundan 
			// tum main method  da gecerlidir , dolayisiyla yeniden ayni isimde bir variable olusturamazsiniz
			@SuppressWarnings("unused")
			String isim="veli";
		}
		
	}

}
