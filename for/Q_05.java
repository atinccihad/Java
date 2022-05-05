package Day_06_ForLoop;

public class Q_05 {

	public static void main(String[] args) {
		// Aþaðýdaki þekilde çýktý veren programý print içerisinde
		// sadece bir tane # kullanarak yazýdýrýnýz

//		            #####
//		            #####
//		            #####
//		            #####
//		            #####

		        for(int satir=0;satir<5;satir++) // satýr kontrolu 1 ile 6 da olurdu
		        {
		            for(int sutun=0;sutun<5;sutun++)// sutun kontrolu for body tek satýr oldg için {} kullanmadýk
		                System.out.print("#");

		            System.out.println();
		        }
	}

}
