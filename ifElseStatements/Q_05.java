package Day_03;

import java.util.Scanner;

public class Q_05 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("sayi girin");
		int sayi=scan.nextInt();
		
		System.out.println("****  ternary cozum   ****");
		
		String result=(sayi>=0)?((sayi<10?("rakam"):("pozitif sayi"))):("negatif sayi");
		System.out.println(result);
		
		System.out.println("****  if cozum   ****");
		
		if (sayi>=0) {
			if (sayi<10) {
				System.out.println("rakam");
			}else {
				System.out.println("pozitif sayi");	
			}
		} else {
             System.out.println("negatif sayi");
		}
	scan.close();
	}

}
