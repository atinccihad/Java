package Day_03_IfElseStatements;

import java.util.Scanner;

public class Q_18 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		/*
	    Kullanicidan 3 Numara isteyiniz ve bu numaralarin en buyuk ve 
	    en kucuk olanlarini konsola yazdiriniz
	    int num1 
	    int num2 
	    int num3
	*/
		
		Scanner scan=new Scanner(System.in);
		System.out.println("3 sayi giriniz");
		int num1=scan.nextInt();
		int num2=scan.nextInt();
		int num3=scan.nextInt();
		
		if (num1>num2&&num2>num3) {
			System.out.println("en buyuk "+num1+"en kucuk "+num3);
			
		}else if (num3>num2&&num2>num1) {
			System.out.println("en buyuk "+num3+"en kucuk "+num1);
		}{ if (num2>num1&&num1>num3) {
			System.out.println("en buyuk "+num2+"en kucuk "+num3);
		}else
			System.out.println("en buyuk "+num1+"en kucuk "+num2);
		}	
			
	}

}
