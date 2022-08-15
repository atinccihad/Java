package i33_encapsulation;

public class Araba {

    String marka = "marka belirtilmedi"; // marka'nin access modifier'i  default access modifier
    // oldugundan package icerisinde kullanilabilir
    private String model = "model belirtilmedi";
    private String yakit = "Elektrikli"; // tum arabalar elektrikli ise bu variable'in degistirilmemesi lazim
    // private yaptigimiz model ve yakit variable'larina ersisimi yetkilendirelim
    // model'e deger atansin ama gorulemesin (setter)
    // yakit ise gorulebilsin ama yeni deger atanamasin isteniyor (getter

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }
}
