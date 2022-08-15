package i32_stringBuilder;

public class C08_equals {
    public static void main(String[] args) {

        StringBuilder sb1 = new StringBuilder("Java");
        StringBuilder sb2 = new StringBuilder("Java");
        String str = "Java";

        System.out.println(sb1.equals(sb2)); // false

        System.out.println(sb1.equals(sb1)); // true
        // StringBuilder da equals methodu ancak ayni obje olursa true doner
        // String'deki gibi dusunmemek lazim

        System.out.println(sb1.equals(str)); // false

        System.out.println(sb1.compareTo(sb2)); // 0

        StringBuilder sb3 = new StringBuilder("Jave");

        System.out.println(sb1.compareTo(sb3)); // -4

        /*
        compareTo() iki sb'yi bastan baslayarak
        harf harf karsilastirir
        ilk harf ayni ise 2. lere gecer onlarda ayni ise 3.lere gecer
        ilk farkli olan harfe kadar gider
        farkli olan iki harfin ascii kodlari arasindaki farki verir.

        Eger hic farkli harf yoksa sonuc olarak 0 dondurur
         */
    }
}
