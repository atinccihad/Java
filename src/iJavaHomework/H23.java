package iJavaHomework;

public class H23 {
    public static void main(String[] args) {
//        1 2 3 4 5 6
//         2 3 4 5 6
//          3 4 5 6
//           4 5 6
//            5 6
//             6       şeklini konsola yazdiriniz.
        for (int i = 0; i <=6 ; i++) {
            for (int j = i+1; j <=6 ; j++) {
                System.out.print(j+" ");
            }

            System.out.println("");
        }
    }
}
