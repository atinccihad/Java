package i37_overriding;

public class EToyota extends DAraba {

    @Override
    void marka() {
        /* super.marka()
          eger hem overriden hem de overriding method'un calismasini isterek
          ilk satira  super.marka() yazabiliriz
       */
    }

    void motor() {
        System.out.println("Toyota araclar Toyota marka motor kullanir");
    }
}
