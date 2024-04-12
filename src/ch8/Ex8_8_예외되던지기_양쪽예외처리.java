package ch8;

public class Ex8_8_예외되던지기_양쪽예외처리 {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            System.out.println("main메서드에서 나머지가 한번 더 예외가 처리되었습니다");
        }
    }

    static void method1() throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            System.out.println("method1메서드에서 예외가 처리되었습니다.");
            throw e;
        }
    }
}
