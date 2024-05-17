package practice.싱글톤;

public class Test {
    public static void main(String[] args) {
        Single s1 = Single.getInstance();
        Single s2 = Single.getInstance();
        System.out.println(s1);
        System.out.println(s2);
        // s1, s2 모두 공유중인 같은 객체 참조 = 싱글톤
    }
}
