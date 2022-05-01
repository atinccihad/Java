package Day_03_IfElseStatements;

import java.util.Scanner;

public class Q_14 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		  Scanner scan = new Scanner(System.in);
	        System.out.print("Gun giriniz : ");
	        int gun=scan.nextInt();
	        System.out.print("Ay giriniz : ");
	        int ay=scan.nextInt();
	        System.out.print("Yýl giriniz : ");
	        int yil=scan.nextInt();
	        
	        System.out.println("tarihi gun,ay,yil olarak giriniz");
	        
	        System.out.println("gun sayisi giriniz");
	        if (gun>0 && gun<=31) {	
	        	System.out.println(gun);
			} else {
              System.out.println("gecerli gun sayisi giriniz");
              return;
			}
	        
	        System.out.println("ay sayisi giriniz");
	        if (ay>0 && ay<=12) {	
	        	System.out.println(ay);
			} else {
              System.out.println("gecerli ay sayisi giriniz");
              return;
			}
	        
	        System.out.println("yil sayisi giriniz");
	        if (!(yil<0 || yil>2022)) {	
	        	System.out.println(yil);
			} else {
              System.out.println("gecerli yil  giriniz");
              return;
			}
	        
	       System.out.println("ay,gun,yil : "+ay+"/"+gun+"/"+yil);
	       System.out.println("yil,ay,gun : "+yil+"/"+ay+"/"+gun);
	       scan.close();
	}

}
