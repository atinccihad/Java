package day16_17_forLoops;

import java.util.Scanner;

public class C06_ForLoop {

	public static void main(String[] args) {
		// Soru 5) Kullanicidan 100'den kucuk pozitif bir tamsayi isteyin.
		// 1'den baslayarak girilen sayiya kadar 3'un veya 5'in kati olan sayilari yazdirin. 
		Scanner scan=new Scanner(System.in);
		System.out.println("100 den kucuk bir sayi girin");
		double sayi=scan.nextDouble();
		int sayi1=(int) sayi;
		
		if (sayi!=sayi1) {
			System.out.println("tam sayi giriniz");
		} else if (sayi1<0||sayi1>100 ) {
			System.out.println("0 - 100 arasi sayi giriniz");
		} else {
           for (int i = 1; i <=sayi1 ; i++) {
			if (i%3==0 || i%5==0) {
				System.out.print(i+" ");
			} else {
				
			}
		}
	

		}
		
scan.close();
	}

}
