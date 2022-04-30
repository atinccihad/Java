package Day_03;

import java.util.Scanner;

public class Q_04 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("bir karakter giriniz");
		char krk=scan.next().charAt(0);
		
		if (krk>='a'&&krk<='z') {
			System.out.println("kucuk harf");
		} else if (krk>='A'&&krk<='Z') {
			System.out.println("buyuk harf");
		} else {
            System.out.println("hatali giris");
		}{

		}
		
	scan.close();
	}

}
