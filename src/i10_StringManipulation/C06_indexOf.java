package i10_StringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str = "Java ogrenmek cok guzel";

        System.out.println(str.indexOf("o")); // 5
        System.out.println(str.indexOf('g')); // 6
        System.out.println(str.indexOf("t")); // integer donduruyor
        // int'de yok diye bir deger bulunmuyor
        // 0 dersek J'nin index idir
        // - bir deger donerse biz aranan String'in str'da olmadigini anlariz
        // Java -1 dondurmeyi tercih etmistir
        String str5 = "sadsdslfkjsdlşgfkdslşgkhlhkfdşlkşldklkjhlkfgjh";
        //     str5 de  p  harfi var midir?
        if (str5.indexOf("iJavaConditionalStatement") == -1) {
            System.out.println("str5 de istenen karakter kullanilmamis");
        } else {
            System.out.println("str5 de istenen karakter kullanilmis");
        }
    }
}
