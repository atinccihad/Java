package i13_methodCreation;

public class C03_StringManipulation {
    public static void main(String[] args) {
        // String methodlarini kullanarak
        // “  Java ogrenmek123 Cok guzel@  ”  String’ini
        // “Java ogrenmek cok guzel.” sekline getirin.
        String str = "  Java ogrenmek123 Cok guzel@  ";
        str = str.trim();
        System.out.println(str); // Java ogrenmek123 Cok guzel@
        str = str.replaceAll("\\d", "");
        System.out.println(str); // Java ogrenmek Cok guzel@
        str = str.replace("@", ".");
        System.out.println(str); // Java ogrenmek Cok guzel.
        str = str.replace("C", "c");
        System.out.println(str); // Java ogrenmek cok guzel.
    }
}
