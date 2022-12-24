package iJavaHomework;

public class H30 {
    public static void main(String[] args) {
        //Bir top 220 m  yükseklikten atılmaktadır.
        // Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
        // Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
        // Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulunuz.
        double yukseklik1 = 220;
        double aldıgıYol = 220;
        double vurma = 0;
        double yukseklik = yukseklik1;
        while (yukseklik > 1) {
            aldıgıYol += (yukseklik * 3 / 4);
            vurma++;
            yukseklik -= (yukseklik * 1 / 4);
        }
        System.out.println("Topun aldigi yol: " + aldıgıYol + " metre");
        System.out.println("Top aldigi yol boyunca toplam : " + vurma + " kere ziplamistir");
    }
}
