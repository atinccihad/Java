package Day_06_ForLoop;

public class Q_09 {

	public static void main(String[] args) {
		// 1 x 1 = 1
        // 1 x 2 = 2
        // 1 x 3 = 3
        // 1 x 4 = 4
        // 1 x 5 = 5
        // 1 x 6 = 6
        // 1 x 7 = 7
        // 1 x 8 = 8
        // 1 x 9 = 9
        // 1 x 10 = 10
        // Yuar�daki �arp�m tablosunu 10 a kadar ekrana yazd�r�n�z.


        for(int carpan1=1;carpan1<=10;carpan1++)
        {

            for(int carpan2=1;carpan2<=10;carpan2++)
                System.out.println(carpan1+" x "+carpan2+" = "+ (carpan1*carpan2));

            System.out.println();
        }
	}

}
