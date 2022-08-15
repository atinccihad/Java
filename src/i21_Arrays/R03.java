package i21_Arrays;

public class R03 {
    public static void main(String[] args) {
        /*
        Arraydeki sayıların ortalamasını hesaplayan Java Kodunu yazınız.

        Array = [20, 30, 25, 35, -16, 60, -100 ]

        Beklenen Çıktı:
        Array Sayılarının ortalaması: 7.0
         */

        int sum=0;

        int[]arr={20, 30, 25, 35, -16, 60, -100 };
        for (int i = 0; i < arr.length; i++) {
            sum+=arr[i];
        }
        double doubleSum=sum/arr.length;
        System.out.println("Array Sayılarının ortalaması: "+doubleSum);
    }
}
