package Day_03_IfElseStatements;

import java.util.Scanner;

public class Q_08 {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("mesleginizi giriniz");
		String meslek=scan.next();
		
		String qa="Quality Analyst";
		String dev="Developer";
		String ba="Busines Analyst";
		String pm="Project Manager";
		
		if (meslek.equalsIgnoreCase("qa")) {
			System.out.println("meslegi = "+qa);
		} else if (meslek.equalsIgnoreCase("dev")) {
			System.out.println("meslegi = "+dev);
		} else if (meslek.toLowerCase().equals("ba")) {
			System.out.println("meslegi = "+ba);
		} else if (meslek.toLowerCase().equals("pm")) {
			System.out.println("meslegi = "+pm);
		} else {
			System.out.println("gecerli meslek giriniz");
		}
scan.close();
	}

}
