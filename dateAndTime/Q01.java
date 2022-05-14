package Day_10_DateTime;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Bir metin giriniz..");
		String metin=scan.nextLine();
		StringBuilder sB=new StringBuilder(metin);
		//sB.append(metin);

		String tersMetin=sB.reverse().toString();
		
		if (tersMetin.equalsIgnoreCase(metin)) {
			System.out.println("Girilen metin polindrome==> "+tersMetin);
		}else {
			System.out.println("Girilen metin polindrome degil==> "+tersMetin);
		}
	}
}
