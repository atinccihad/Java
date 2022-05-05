package Day_06_ForLoop;

import java.util.Scanner;

public class Q_07 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*  Problem Tanýmý
        Matrisin boyutunu kullanýcýdan okuyup.
        Sadece diyagonu (köþegeni) 1 olan ve
        diðer elemanlarý 0 olan bir kare matrisi ekrana bastýrýn.
       Ekran Çýktýsý
        Bir sayý giriniz: 7
        1000000
        0100000
        0010000
        0001000
        0000100
        0000010
        0000001
        Bir sayi giriniz: 5
        10000
        01000
        00100
        00010
        00001
   */


    Scanner scan = new Scanner(System.in);
    System.out.print("matrisin boyutunu giriniz : ");
    int sayi = scan.nextInt();

    for (int baba = 1; baba <= sayi; baba++) {//satýr kontrolu
        for (int ogul = 1; ogul <= sayi; ogul++) {//sutun kontrolu
            if (baba == ogul) {
                System.out.print(" 1");
            } else {
                System.out.print(" 0");
            }
            
        }System.out.println();
    }

	}

}
