package Day_03_IfElseStatements;

import java.util.Scanner;

public class Q_20 {

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
		int sayi1=scan.nextInt();
		int sayi2=scan.nextInt();
		int sayi3=scan.nextInt();
		
		if (sayi1>sayi2 && sayi1>sayi3) {
			System.out.println(sayi1+" en buyuk sayi");
			if (sayi2>sayi3) {
				System.out.println( sayi3+" en kucuk sayi");
			} else {
				System.out.println(sayi2+" en kucuk sayi");
			}
		} else if (sayi2>sayi1 && sayi2>sayi3) {
			System.out.println(sayi2+" en buyuk sayi");
			if (sayi1>sayi3) {
				System.out.println(sayi3+" en kucuk sayi");
			} else {
				System.out.println(sayi1+" en kucuk sayi");
			}
		} else { 
			System.out.println("sayi3 en buyuk sayi sayi1 en kucuk sayi");
		}
	}

}
