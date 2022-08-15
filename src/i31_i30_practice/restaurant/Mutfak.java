package i31_i30_practice.restaurant;

public class Mutfak {

    public String yemekler = "adanakebap, urfaciger, kusleme, kusbasi";

    public String araSicak = "yayla, mercimek, dugunCorba, corba";

    public String tatlilar = "baklava, sutlac, gullac, kazandibi, kunefe";

    public String icecekler = "ayran, salgam, kola, kusbasi";

    public Mutfak() {

    }

    public Mutfak(String adanakebap, String mercimek, String kunefe, String salgam) {
        this.yemekler = adanakebap;
        this.araSicak = mercimek;
        this.tatlilar = kunefe;
        this.icecekler = salgam;
    }

    @Override
    public String toString() {
        return "Mutfak{" +
                "\nyemekler='" + yemekler + '\'' +
                ",\n araSicak='" + araSicak + '\'' +
                ",\n tatlilar='" + tatlilar + '\'' +
                ",\n icecekler='" + icecekler + '\'' +
                '}';
    }
}
