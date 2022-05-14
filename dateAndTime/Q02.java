package Day_10_DateTime;

public class Q02 {

	public static void main(String[] args) {
    // verilen String'leri birlestiren concat isimli bir method olusturunuz
	// input: "m","e","r","v","e";
	// output: merve
		concat("h","a","c","e","r");
		concat("hanim ","basarili ","qa"," ....");
	}
public static void concat(String... str) {
	String yeniStr="";
	for (String w : str) {
		yeniStr=yeniStr.concat(w);
	}System.out.println(yeniStr);
}
}
