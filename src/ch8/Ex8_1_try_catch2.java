package ch8;

public class Ex8_1_try_catch2 {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(0/0); // 예외 발생 시 예외 객체가 생성된다.
            System.out.println(2); // ★ 예외가 발생한 이후의 문장은 수행되지 않는다.
        } catch(ArithmeticException ae) { // ★ 발생한 예외처리와 일치하는 catch문이 없으면 프로그램이 비정상 종료된다.
            System.out.println("ArithmeticException 에러 발생");
        } // try-catch의 끝
        System.out.println(4);
    }
}
