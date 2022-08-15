package i11_i09_practice;

public class Q07 {
    public static void main(String[] args) {
        // String seklinde verlen asagidaki fiyatlarin toplamini bulunuz
        // String  str 1= "$13.99"
        // String str 2= "$10.55"
        // ipucu: Double parseDouble() methodunu kullanabilirsiniz.

        String str1 = "$13.99";
        String str2 = "$10.55";
        str1 = str1.replace("$", "");
        str2 = str2.replace("$", "");
        System.out.println(str1 + " " + str2);
        Double str3 = Double.parseDouble(str1) + Double.parseDouble(str2);
        System.out.println("String olarak verilmis olan sayilarin toplami=> " +"$"+ str3);

        /*
         Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.
		 1) \\d    ==> tum rakamlar
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space
		 	 \\S   ==> space disindaki hersey
	    */

    }
}
