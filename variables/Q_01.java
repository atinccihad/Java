package Day_01_Variables;

public class Q_01 {

	public static void main(String[] args) {
	    //verilen 12345 sayisinin rakmlarini yukaridan asagiya dogru yazdiriniz
		//ex: input:12345
		//output: 1
        //        2
		//        3
		//        4
		//        5
		
		int sayi=12345;
		int birler=sayi%10;      //birler basamagi sayinin 10 a bolumunden kalanýdýr-->5
		int onlar=(sayi/10)%10;  
		int yuzler=(sayi/100)%10;
		int binler=(sayi/1000)%10;
		int onBinler=(sayi/10000);
		
		/*
		System.out.println(onBinler);
		System.out.println(binler);
		System.out.println(yuzler);
		System.out.println(onlar);
		System.out.println(birler);
		*/
		
		//bu sekilde yazim yerine 2 alt satirdaki kodu yazmak yeterlidir
		
		//consolda alt satira yazdýrmak icin "\n"  komutu kullanilir
		
		System.out.println(onBinler+"\n"+binler+"\n"+yuzler+"\n"+onlar+"\n"+birler+"\n");
		
		
		
		
		
		
		
		
		
	}

}
