package Day_08_Arrays;

import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Q13 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		 // Kullanicidan aldigimiz 8 elemanli arrayin icinde
        // kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
		
		Scanner scan=new Scanner(System.in);
		
		int sayac=0;
		int sayi=0;
		
		int arr[]=new int[8];
		
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+".elemani girin");
			arr[i]=scan.nextInt();
		}
		
		
		
		
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i]%3==0) {
				
				sayac++;
			}
			
		} System.out.println("3 e bolunen sayi adedi= "+sayac);
		/*
		 * 
		 *  int[] arr = new int[8];
        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ".indexi sayiyi giriniz :");
            arr[i] = scan.nextInt();
        }

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {

                count++;
            }
        }

        System.out.println("3 ile bolunebilen sayi :" + count);
		 */

	}

}
