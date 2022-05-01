package Day_03_IfElseStatements;

import java.util.Scanner;

public class Q_06 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi girin");
		int sayi=scan.nextInt();
		
		
		if (sayi<1000 && sayi>=100) {
			System.out.println("3 basamakli pozitif sayi");
		} else if (sayi<100 || sayi >=1000) {
			 if (sayi%2==0) {
				System.out.println("3 basamakli olmayan cift sayi");
			} else {
                System.out.println("3 basamakli olmayan tek sayi");
			}
		}	
	scan.close();		
	}

}
