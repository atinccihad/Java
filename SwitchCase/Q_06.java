package Day_04_SwitchCase;

import java.util.Scanner;

public class Q_06 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Saati saniyeye mil'i kilometreye ,kilogram'ý gram'a
		// ceviren bir method yaziniz
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("cevrilecek birimi giriniz");
        String birim=scan.next();
        
        System.out.println("cevrilecek birimin degerini giriniz");
        double miktar=scan.nextDouble();
        
        cevir(birim,miktar);
	}

	private static void cevir(String birim, double miktar) {
		
		switch (birim) {
		case "saat":
			System.out.print("girilen saatin saniye degeri "+miktar*60*60+"sn");
			break;
        case "mil":
        	System.out.print("girilen mil'in km degeri "+miktar*300/180+"km");
			break;
        case "kg":
        	System.out.print("girilen kg'nin gr degeri "+miktar*1000+"gr");
	    break;
		default:
			System.out.println("Hatali veri girdiniz");
			
		}
		
	}

}
