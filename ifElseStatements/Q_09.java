package Day_03_IfElseStatements;

import java.util.Scanner;

public class Q_09 {

	public static void main(String[] args) {
		/*
		Problem tanimi :
		Kullanicidan  yasini ve kilosunu alaliniz
		18 yasindan kucuk ise kan bagisi yapamaz
		18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
		18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
		 */
		Scanner scan=new Scanner(System.in);
		System.out.println("yasinizi girin");
		int yas=scan.nextInt();
		System.out.println("kilonuzu girin");
		int kilo=scan.nextInt();

		if (yas<=18) {
			System.out.println("kan bagisi yapamazsin.");
		} else if (yas>18 && kilo<50) {
			System.out.println("kan bagisi yapamazsin. yas kilodan dolayi");
		} else if(yas>18 && kilo>50){
            System.out.println("kan bgisi yapabilir");
		}scan.close();
	}

}
