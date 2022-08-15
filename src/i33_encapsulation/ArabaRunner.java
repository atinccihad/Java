package i33_encapsulation;

import org.xml.sax.helpers.ParserAdapter;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1 = new Araba();
        // arb1 objesi uzerinden
        // marka variable'ina ulasip degistirebildim(set) ve yazdirabildim(get)
        arb1.marka = "Toyota";
        System.out.println(arb1.marka); // Toyota

        // access modifier kullanarak marka variable'ina ulasimi
        // tamamen serbest birakabilir veya tamamen engelleyebilirim

        // private yaptigimiz model variable'ina ulasamayiz
        // arb1.model
        // yani access modifier ya hep ya hic diyor

        // model'i degistirelim ama goremeyelim
        // yakiti da gorelim ama degistiremeyelim

        // set ve get yetkilerini ozel olarak tanimlamak isterseniz
        // 1. adim - ozel yetki tanimlayacaginiz variable'lari private yapin
        //         private bir dataya baska class'lardan ulasmak mumkun olmadigindan
        // 2. adim - set yetkisi icin setter , ve get yetkisi icin getter methodlari olusturalim

        arb1.setModel("Supra"); // model olarak Supra atadik
        // model'i yazdirma imkanimiz yok, cunku getter yok
        System.out.println(arb1.getYakit()); // elektrikli bilgisini yazdirabildik
        // yakiti degistiremeyiz cunku setter methodu yok

    }
}
