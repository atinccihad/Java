package Day_06_ForLoop;

public class Q_05 {

	public static void main(String[] args) {
		// A�a��daki �ekilde ��kt� veren program� print i�erisinde
		// sadece bir tane # kullanarak yaz�d�r�n�z

//		            #####
//		            #####
//		            #####
//		            #####
//		            #####

		        for(int satir=0;satir<5;satir++) // sat�r kontrolu 1 ile 6 da olurdu
		        {
		            for(int sutun=0;sutun<5;sutun++)// sutun kontrolu for body tek sat�r oldg i�in {} kullanmad�k
		                System.out.print("#");

		            System.out.println();
		        }
	}

}
