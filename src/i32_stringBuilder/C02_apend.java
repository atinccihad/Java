package i32_stringBuilder;

public class C02_apend {
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java daha ne yapsin");
        sb.append("?");
        System.out.println(sb); // Java daha ne yapsin?

        // append istedigimiz String'i en sona ekler

        sb.append("Java",2,4);

        sb.insert(4, " her seyi dusunmus,");

        System.out.println(sb); // Java her seyi dusunmus, daha ne yapsin?va
        // araya ekleme yapmak istedigimizde append degil insert kullanmaliyiz

        sb.insert(22, "valla valla", 5, 11);
        System.out.println(sb); // Java her seyi dusunmus valla, daha ne yapsin?va
    }
}
