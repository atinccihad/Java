package day03_scanner;

public class C04_ExplicitNarrowing {

	public static void main(String[] args) {

		
		//eger buyuk data turundeki bir veriyi daha kucuk data turundeki
		//variable'a atamak istersek java bunu otomatik olarak yapmaz
		
		int sayi1=300;

		short sayi2=  (short) sayi1;
		//esitligin sagı ile solundaki veri turleri farklı oldugundan java mismatch hatasi verir
		//hatayi gidermek icin buyuk data turundeki degerin onune manuel onayimizi gosteren
		//(short) yazilir veya sayi1 in üzerine gelinip add cast to short seçilir
		
		System.out.println("sayi2 : " +sayi2);
		
		byte sayi3=(byte) sayi2;
		
		System.out.println("sayi3 :" + sayi3);
		//deger byte'in sinirlarindan buyuk oldugu icin java int 300'u kendi yontemine gore
		//byte'a donusturur ve bu arada bizim sayimiz DEGISIR
		
		double sayi4=87.3;
		int sayi5= (int) sayi4;
		
		System.out.println("sayi5 : " +sayi5);
		
		// degeer virgullu oldugundan ve int'da ondalıklı kısım olmadıgından java ondalıklı kısımı keser
		// dolayısıyla data kaybı olur
		
		int sayi6=27;
		int sayi7=4;
		
		System.out.println(sayi6/sayi7); 
		
		
		
		
		    //bolme islemi yapılan  iki sayıda int olugu icin 
		                                      //java sonucu int olarak yazar
		
		double sayi8=4;
		double sayi9=17;
		
		System.out.println(sayi6/sayi8);     //6,75 islem yapilan sayilardan daha genis data turune sahip olan
		                                     //double oldugundan sonucu double olarak yazdirir
		
		System.out.println(sayi9/sayi7);     //4.25
		
		//numC diye  bir degiskenimiz olsun bunu 1 artırmak icin kullanabilecegimiz
		//numC=numC+1;     veya   numC+=1;   veya    nummC++;
		//3'üde aynı işlevi gercekletirir
		//azaltmak icinde 
		//int numA=2;     numA=numA-3  veya   numA-=3    
		//int numB=20;    numB=numB/5  veya   numB/=5
		//int numD=7;     numD--;       int numE=11;    numE--;
		

	
		
		
		
		
		
		
		
		

	}

}
