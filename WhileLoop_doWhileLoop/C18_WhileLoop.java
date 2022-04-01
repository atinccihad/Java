 package day18_19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C18_WhileLoop {

	public static void main(String[] args) {
		// kullanicidan toplanmak uzere sayi isteyin
		// kullanici 0 a basincaya kadar sayilari alip 
		// toplamaya devam edin
		// kullanici sifira bastiginda,
		// o ana kadar sifir haric kac sayi girdigini ve girilen sayilarin toplamini yazdirin
		
		
		// kullanicidan 5 sayi alin dese
		
		for (int i = 1; i <=5 ; i++) {
			// kullanicidan bir deger alip, toplama eklerim	
		}

	
        Scanner scan=new Scanner(System.in);
        // loop 'un icinde kullanacagim obje ve variable leri 
        // loop dan once olusturmak daha guzeldir
        // cunku loop un icinde olusturursak, 
        // loop her dondugunde yeni bir obje veya 
        // variable olusturur ve bu da hafizayi doldurur
	
        int sayi=100;   // 0'in disinda ne yazarsak olur
        int toplam=0;
        int sayac=0;
        
         while (sayi!=0) {
			
        	 System.out.println("Lutfen toplama eklemek icin bir tamsayi yazin\nbitirmek icin 0 a basin");
        	 sayi=scan.nextInt();
        	 toplam+=sayi;
        	 sayac++;
		}
         // kullanici 0'a bastiginda loop islevini son kez yapip 
         // sonra basa donecek ve loop bitecek
         // 0 toplanmak uzere verilmeyip sadece bitirmek icin verildiginden
         // sifiri sayac'a eklememek icin 44.satirda sayac-1 yaptik
         System.out.println("girilen sayi adedi : "+(sayac-1));
         System.out.println("girilen sayilarin toplami : "+toplam);
	     scan.close(); 
	}
	

}
