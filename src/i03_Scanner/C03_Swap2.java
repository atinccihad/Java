package i03_Scanner;

public class C03_Swap2 {
    public static void main(String[] args) {
        /*
        1- Verilen sayi1 ve sayi2 variable'larinin degerlerini ucuncu bir variable kullanmadan  degistirin(SWAP)
        bir progam yaziniz
        Orn   : sayi1=10 ve sayi2=20;
        kod calistikten sonra
                sayi1=20 ve sayi=10
                */
        int sayi1 = 10;
        int sayi2 = 20;
        System.out.println("Swapdan önce sayi1 : " + sayi1 + " " + "sayi2 : " + sayi2);

        sayi1 = sayi1 + sayi2;//30
        sayi2 = sayi1 - sayi2;//10
        sayi1 = sayi1 - sayi2;//20
        System.out.println("Swapdan sonra sayi1 : " + sayi1 + " " + "sayi2 : " + sayi2);
    }
}
