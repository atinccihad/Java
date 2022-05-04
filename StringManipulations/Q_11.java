package Day_05_StringManipulation;

public class Q_11 {
	public static void main(String[] args) {
	/*  TASK :
		Asagidaki String degiskenini kullanarak  konsolda A L i yazdiriniz.
		String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";	 */
    String  harfDeposu = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	char a=harfDeposu.charAt(harfDeposu.indexOf("A"));//A
	char l=harfDeposu.charAt(harfDeposu.indexOf("L"));//L
	char I=harfDeposu.charAt(harfDeposu.indexOf("I"));//I

	        System.out.println(""+a+l+I);

}
}
