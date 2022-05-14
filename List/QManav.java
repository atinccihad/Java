package Day_09_List;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class QManav {

	static List<String>urunListesi=new ArrayList<>();
	static List<Double>urunFiyatlari=new ArrayList<>();
	static double toplamOdenecekTutar;
	static List<String>urunler=new ArrayList<>();
	
	public static void main(String[] args) {
		
		
		urunListesi.add("domates-urun kodu: 1");
		urunListesi.add("elma-urun kodu: 2");
		urunListesi.add("muz-urun kodu: 3");
		urunListesi.add("biber-urun kodu: 4");
		urunListesi.add("patlican-urun kodu: 5");
		
		urunFiyatlari.add(5.0);
		urunFiyatlari.add(7.5);
		urunFiyatlari.add(11.3);
		urunFiyatlari.add(8.7);
		urunFiyatlari.add(9.2);
		
		System.out.println(urunListesi);
		
		musteriSecimi();
	}


	@SuppressWarnings("resource")
	private static void musteriSecimi() {
	Scanner scan=new Scanner(System.in);
	System.out.println("Hangi urunu secmek istersiniz?");
	int secim=scan.nextInt();
	
	System.out.println("Sectiginiz urunun miktarini giriniz kilo olarak");
	double kilo=scan.nextDouble();
	double urunTutari=urunFiyatlari.get(secim-1);
	double urunToplamTutar=kilo*urunTutari;
	toplamOdenecekTutar+=urunToplamTutar;// alinan her urun odemesi ana odemeye eklendi
	
	
	System.out.println("Devam edecekseniz'1' , kasa icin'2' seciniz");
	int karar=scan.nextInt();
	if (karar==1) {
		musteriSecimi();
	}else {
		kasa();
	}	
	}


	private static void kasa() {
		
		System.out.println("Alisverisinizin toplam tutari: "+"****"+(toplamOdenecekTutar)+"*****");
		
	}

}
