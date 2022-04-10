package day27_28_constructor_constructorCall_staticKeyWord;

public class C03 {

	public static void main(String[] args) {
		// Java run time bir programdir
		// run tusuna bastiginizda java calismaya baslar ve islemleri yapar
		// java nin isi bittginde (calisma tusu kirmizi dan griye dondugunde)
		// hersey basa doner
		
		// static variable ve methodlar bulunduklari class ile  ilintilidir(obje ile degil class ile)
		// baska bir class da iken C02 deki static variable veya method a ulasmak istedigimizde
		// C02.staticVariableIsmi  ve  C02.staticMethodIsmi() yazmamiz yeterli olur
		
		C02 obje1=new C02();
     	System.out.println("obje1 icin x: "+obje1.x+" obje1 icin y: "+C02.y); // obje1 icin x: 5 obje1 icin y: 10
				
			
        obje1.x++;
	    C02.y++;
		System.out.println("islemden sonra obje1 icin x: "+obje1.x+" islemden sonra obje1 icin y: "+C02.y); // islemden sonra obje1 icin x: 6 islemden sonra obje1 icin y: 11
		// static bir variable a class ismi uzerinden ulasmak yerine
		// instance variable'lar gibi obje ile ulasmaya calisirsaniz
		// Java CTE vermez ama solda  !  isareti ile bizi uyarir
		// static bir field olan C02.y ye static yoldan ulas der
		C02 obje2=new C02();
		System.out.println("islemden sonra obje2 icin x: "+obje2.x+" islemden sonra obje2 icin y: "+C02.y); // islemden sonra obje2 icin x: 5 islemden sonra obje2 icin y: 11
				
		obje2.x++;
		C02.y++;
		System.out.println("islemden sonra obje2 icin x: "+obje2.x+" islemden sonra obje2 icin y: "+C02.y);// islemden sonra obje2 icin x: 6 islemden sonra obje2 icin y: 12
				
		System.out.println("obje 2 olusturulduktan ve islemden sonra obje1'in  "+"\nx : "+obje1.x+" y: "+C02.y);// obje 2 olusturulduktan ve islemden sonra obje1'in 
				                                                                                                          // x : 6 y: 12
	    C02 obje3=new C02();
				 
	    obje3.x=20;
	    C02.y=40;
	    System.out.println("obje 3 olusturulduktan ve islemden sonra obje1'in  "+"x : "+obje1.x);//obje 3 olusturulduktan ve islemden sonra obje1'in  x : 6
	    System.out.println("obje 3 olusturulduktan ve islemden sonra obje2'in  "+"x : "+obje2.x);//obje 3 olusturulduktan ve islemden sonra obje2'in  x : 6
	    System.out.println("obje 3 olusturulduktan ve islemden sonra obje3'in  "+"x : "+obje3.x);//obje 3 olusturulduktan ve islemden sonra obje3'in  x : 20

	    System.out.println("obje 3 olusturulduktan ve islemden sonra obje1'in  "+"y : "+C02.y);//obje 3 olusturulduktan ve islemden sonra obje1'in  y : 40
	    System.out.println("obje 3 olusturulduktan ve islemden sonra obje2'in  "+"y : "+C02.y);//obje 3 olusturulduktan ve islemden sonra obje2'in  y : 40
	    System.out.println("obje 3 olusturulduktan ve islemden sonra obje3'in  "+"y : "+C02.y);//obje 3 olusturulduktan ve islemden sonra obje3'in  y : 40
				 
	    // y static oldugu icin hepsi icin 40 degerini alir
	
			}


	}


