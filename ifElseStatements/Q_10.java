package Day_03_IfElseStatements;

import java.util.Scanner;

public class Q_10 {

	public static void main(String[] args) {
		 //// Kullan�c�dan ald���n�z koordinat noktas�n�n hangi b�lgede oldu�unu yazd�ran bir kod yaz�n�z.

        Scanner scan = new Scanner(System.in);
        System.out.println("L�tfen  X ve Y   de�erlerini giriniz");
        int x = scan.nextInt();
        int y = scan.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("Girdi�iniz nokta 1. b�lgede");
        } else if (x < 0 && y > 0) {
            System.out.println("Girdi�iniz nokta 2. b�lgede");
        } else if (x < 0 && y < 0) {
            System.out.println("Girdi�iniz nokta 3. b�lgede");
        } else if (x > 0 && y < 0) {
            System.out.println("Girdi�iniz nokta 4. b�lgede");
        } else if (x == 0 && y!=0) {
            System.out.println("Girdi�iniz nokta Y ekseni �zerindedir");
        } else if (y == 0 && x!=0) {
            System.out.println("Girdi�iniz nokta X ekseni �zerindedir");
        }else {
            System.out.println("Orijin noktas�n� girdiniz");
        }
scan.close();
	}

}
