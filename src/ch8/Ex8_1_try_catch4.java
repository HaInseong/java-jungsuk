package ch8;

public class Ex8_1_try_catch4 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(args[0]); // ArrayIndexOutOfBoundsException 발생
            System.out.println(4); // 예외가 발생한 이후의 문장은 수행되지 않는다.
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) {
                System.out.println("true");
                System.out.println("ArithmeticException");
            } // ★ ArrayIndexOutOfBoundsException 예외처리 하지 못하여 프로그램 비정상 종료된다.
        }
        System.out.println(6);
    }
}
