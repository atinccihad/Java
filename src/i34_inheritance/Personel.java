package i34_inheritance;

public class Personel {
    /*
    Eger parent class olacak sekilde tasarladiginiz bir class
    varsa veya ilride bu class'i parent yapmak isteyenler
     olabilir diyorsaniz
    o zman variable ve method'larin
    access modifier'ini protected
     */

    protected int personelNo;
    protected String isim = "Isim belirtilmedi";
    protected String departman = "Departman belirtilmedi";

    public void maas() {
        System.out.println("Tum personelin maasi vardir");
    }

    public void mesai() {
        System.out.println("Tum personel statusune gore mesai yapar");
    }

    public void fazlaMesaiUcreti() {
        System.out.println("Personel fazla mesai ucretini statusune gore alir");
    }

}
