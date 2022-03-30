package day18_19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C10_odevWhileLoop {

	public static void main(String[] args) {
		// 4) Kullanicidan baslangic ve bitis harflerini alin ve baslangic harfinden baslayip 
		// bitis harfinde biten tum harfleri buyuk harf olarak ekrana yazdirin
		// Kullanicinin hata yapmadigini farz edin
		Scanner scan=new Scanner(System.in);
		System.out.println("lutfen baslangýc harfini girin ardindan enter a basip bitis harfini giriniz");
        char baslangic=scan.next().charAt(0);
        char bitis=scan.next().charAt(0);
        
        while(baslangic!=bitis) {
        	System.out.print(baslangic+" ");
        	baslangic++;
        }
	scan.close();
	}

}
