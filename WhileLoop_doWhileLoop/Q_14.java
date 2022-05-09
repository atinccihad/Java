package Day_07_While_DoWhile;

import java.util.Scanner;

public class Q_14 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*  Problem Tan�m�
        Verilen bir say�n�n fakt�riyelini �zyineli (recursive) olarak
        hespalayan fonksiyonu yaz�n�z.
        �rnek Ekran ��kt�lar�
        Bir sayi giriniz: 6*5*4*3*2*1=720
        Fakt�riyeli: 720
        Bir say� giriniz: 3*2*1
        Fakt�riyeli 6
     */
        Scanner scan = new Scanner(System.in);
        System.out.print("bir sayi giriniz : ");
        int sayi =scan.nextInt();
        
        int faktoriyel=1;
        
        while (sayi>0) {
			faktoriyel*=sayi;
			sayi--;
		}
        System.out.println("faktoriyel: "+faktoriyel);
	}

}
