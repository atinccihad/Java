package i32_stringBuilder;

public class C05_indexOf_lastIndexOf {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Pay attention please");
        System.out.println(sb.indexOf("Pay")); //0
        System.out.println(sb); // Pay attention please
        System.out.println(sb.indexOf("e")); // 7
        System.out.println(sb.indexOf("e", 10)); // 16
        System.out.println(sb.lastIndexOf("e")); // 19
        System.out.println(sb.lastIndexOf("e", 10)); // 7

    }
}
