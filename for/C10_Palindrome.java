package day16_17_forLoops;

import java.util.Scanner;

public class C10_Palindrome {

	public static void main(String[] args) {
		// Soru 8) Interview Question Kullanicidan bir String isteyin
		//         ve String i tersine ceviren bir method yazin
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen tersine cevirmek icin bir yazi giriniz");
		String str=scan.nextLine();
		
	
		
		if(str.equals(tersineCevir(str))) {
			System.out.println("Girdiginiz String palindrome");
		}else {
			System.out.println("Girdiginiz String palindrome degil");
		}
			
		scan.close();

	}

	public static String tersineCevir(String str) {
		String tersStr="";  // Saklamak icin olusturduk Str'ı(Kullanicinin girdigi String'i tersine cevirdikten sonra saklamasi icin)
		
		for (int i = str.length()-1;  i>=0   ; i--) {
			tersStr+=str.substring(i, i+1);
		}
		
	return tersStr;	
	}

}




