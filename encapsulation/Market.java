package Day_11_Encapsulation;

import java.util.ArrayList;
import java.util.Arrays;

import java.util.List;
import java.util.Scanner;

public class Market {
	static List<String> urunlerin=new ArrayList<>(Arrays.asList("00 Domates","01 Patates","02 Biber","03 Sogan","04 Havuc","05 Elma","06 Muz","07 Cilek","08 Kavun","09 Uzum"));
	static List<Double>fiyatlar=new ArrayList<>(Arrays.asList(2.10,3.20,1.50,2.30,3.10,1.20,1.90,6.10,4.30,2.70,0.50));
    static List<String>sepetUrunleri=new ArrayList<>();
    static List<Double>sepetKilo=new ArrayList<>();
    static List<Double>sepetFiyatlar=new ArrayList<>();
    static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
	
		
		String devam="";
		double toplamFiyat=0;
		do {
			urunListesi();
			System.out.print("sectiginiz urun kodunu giriniz ");
			int urunNo=scan.nextInt();
			System.out.print("kac kilo alacaksiniz ");
			double kg=scan.nextDouble();
			sepeteEkle(urunNo,kg);
			toplamFiyat=sepetTutari();
			System.out.println("devam edecek iseniz e yaziniz cikmak icin h yaziniz ");
			devam=scan.next();
			//scan.nextLine();// dummy kukla
			
		} while (devam.equalsIgnoreCase("e"));
		odeme(toplamFiyat);
	}

	private static double sepetTutari() {
		double sepetTutar=0;
		double sepetKg=0;
		for (int i = 0; i < sepetUrunleri.size(); i++) {
			sepetTutar+=sepetFiyatlar.get(i);
			sepetKg+=sepetKilo.get(i);
		}
	     System.out.println("toplam odemeniz gereken miktar: "+sepetTutar+" aldiginiz urunlerin miktari "+sepetKg);	
   		return sepetTutar;
	}

	private static void odeme(double toplamFiyat) {
		System.out.println(" odemeniz gereken miktar: "+toplamFiyat);
		double nakit=0;
		do {
			System.out.print(" nakit odemenizi giriniz ");
			nakit+=scan.nextDouble();
			if (nakit<toplamFiyat) {
				System.out.println(" eksik odeme yaptiniz "+(toplamFiyat-nakit)+" daha odeme yapiniz");
			}
		} while (nakit<toplamFiyat);
		double paraUstu=nakit-toplamFiyat;
		if (paraUstu>0) {
			System.out.println(" para ustunuz ==>"+paraUstu);
		}
		System.out.println(" ****yine bekleriz**** ");
	}

	private static void sepeteEkle(int urunNo, double kg) {
		sepetUrunleri.add(urunlerin.get(urunNo));
		sepetKilo.add(kg);
		sepetFiyatlar.add(fiyatlar.get(urunNo)*kg);
		
	}

	private static void urunListesi() {
		System.out.println("No\tUrunler\tFiyatlar");
		System.out.println("===\t==========\t===");
		for (int i = 0; i < urunlerin.size(); i++) {
			System.out.println(" "+i+"\t"+urunlerin.get(i)+"\t"+fiyatlar.get(i));
		}
	}

}
