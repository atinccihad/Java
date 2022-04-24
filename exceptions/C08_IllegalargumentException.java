package day40_exceptions;

import java.util.Scanner;

public class C08_IllegalargumentException {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// Kullanicidan yasini girmesini isteyin.
		// Kodunuzu kullanici sifirdan kucuk sayi girerse Exception verecek sekilde yazin.
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Lutfen console da gormek icin yasinizi giriniz");
		int yas=scan.nextInt();
		
		try {
			if (yas<0) {
				throw new IllegalArgumentException();
			}else {
				System.out.println(yas);
			}
		} catch (IllegalArgumentException e) {
			System.out.println(e);
			System.out.println("yas 0 dan kucuk olamaz");
		}

	}

}
