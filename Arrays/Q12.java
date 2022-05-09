package Day_08_Arrays;

import java.util.Arrays;

public class Q12 {

	public static void main(String[] args) {
		//Aþaðýdaki multi dimensional array’in iç array’lerindeki tum elemanlarýn
        //toplamýný birer birer bulan ve herbir sonucu yeni bir array’in elemaný yapan
        // ve yeni array’i ekrana yazdýran bir program yazýnýz
        // Ornegin; { {1,2,3}, {4,5}, {6,7} } ==> 1+2+3=6  4+5=9  6+7=13 ==> output: {6, 9, 13}

		
		int arr[][]={ {1,2,3}, {4,5}, {6,7} };
		int arrToplam[] = new int[arr.length];
        int toplam = 0;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < arr[i].length; j++) {
                toplam = toplam + arr[i][j];
            }
            arrToplam[i] = toplam;
            toplam = 0;
        }

        System.out.println(Arrays.toString(arrToplam));
		
		
	}

}
