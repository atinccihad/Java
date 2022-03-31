package day18_19_whileLoop_doWhileLoop;

import java.util.Scanner;

public class C11_odevWhileLoop {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		// 5) Kullanicidab bir rakam alin ve bu rakam icin carpim tablosunu
		// ekrana yazdirin.Kullanicinin hata yapmadigini farz edin. 

		Scanner scan=new Scanner(System.in);
		System.out.println("carpim tablosu icin rakam giriniz");
		int rakam =scan.nextInt();
		int carpim=1;
		
		if (rakam<=0 && rakam>=10) {
			System.out.println("rakam giriniz");
		}
		scan.close();
	}

}
