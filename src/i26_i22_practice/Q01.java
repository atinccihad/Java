package i26_i22_practice;

public class Q01 {
    public static void main(String[] args) {
        /*
         * {{1,2,3}, {2,3,1} , {5,5,5} , {2,1,3}} int 2D arrayini  olustur
         *  2D arrayinden min number print et
         */

        int[][] arr = {{1, 2, 3}, {2, 3, 1}, {5, 4, 5}, {-5, -1}};
        int minNumber = arr[0][0];

        for (int i = 0; i < arr.length; i++) {
            System.out.println("arr[" + i + "].length'i: " + arr[i].length);
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] < minNumber) {
                    minNumber = arr[i][j];
                }
            }
        }
        System.out.println("minNumber = " + minNumber);


    }
}
