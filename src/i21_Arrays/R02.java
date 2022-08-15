package i21_Arrays;

public class R02 {
    public static void main(String[] args) {
        /*
        Array deki sayıları tolpayan Java kodunu yazınız.

        array [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        Beklenen Çıktı:
        Array toplamı: 55
         */
        int sum = 0;
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Array deki sayıların tolpami: " + sum);
    }
}
