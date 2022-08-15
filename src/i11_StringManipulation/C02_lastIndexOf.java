package i11_StringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {

        String cumle = "Java cok kolay, Java cok guzel";
        String kelime = "Java";

        // verilen kelime iicn asagidaki sartlardan uygun olani yazan bir program yaziniz
        // - verilen kelime cumlede kullanilmamis
        // - verilen kelime cumlede sadece 1kere kullanilmis
        // - verilen kelime cumlede birden fazla kullanilmis

        int kelimeIlkIndex = cumle.indexOf(kelime);
        int kelimeSonIndex = cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex == -1) {
            System.out.println("verilen kelime cumlede kullanilmamis");
        } else if (kelimeIlkIndex == kelimeSonIndex) {
            System.out.println("verilen kelime cumlede sadece 1kere kullanilmis");
        } else {
            System.out.println("verilen kelime cumlede birden fazla kullanilmis");
        }
    }
}
