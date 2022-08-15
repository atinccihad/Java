package i10_StringManipulation;

public class C01_charAt {
    public static void main(String[] args) {

        String str = "Java ogrenmek ne guzel";

        System.out.println(str.charAt(0)); // ilk harfi yazdirir J

        System.out.println(str.toUpperCase().charAt(7)); // R

        System.out.println(str.charAt(21)); // l

        //System.out.println(str.charAt(22)); StringIndexOutOfBoundsException
        // son harfi bulmak icin str'in uzunlugunun bir eksigini index olarak gireriz
        // eger index olarak uzunlugu veya daha bir sayiyi girersek Java exeption verir

        // charAt() kullandigimizda sonuc char olacagi icin artik manipulation yapamayiz
        // String methodlarindan kullanmamiz gereken bir method varsa charAt()'den once kullanmaliyiz
    }
}
