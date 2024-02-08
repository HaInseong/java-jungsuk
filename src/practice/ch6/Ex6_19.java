package practice.ch6;

public class Ex6_19 {
    public static String change(String str) {
        str += "456";
        return str;
    }

    public static void main(String[] args) {
        String str = "ABC123";
        System.out.println(str);
        change(str);
        String str2 = change(str);
        System.out.println("After change: " + str);
        System.out.println("After change: " + str2);
    }
}
