package ch8;

public class Ex8_1_try_catch3 {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        try {
            System.out.println(3);
            System.out.println(0/0);
            System.out.println(4); // 예외가 발생한 이후의 문장은 수행되지 않는다.
        } catch (ArithmeticException ae) {
            if (ae instanceof ArithmeticException) {
                System.out.println("true");
                System.out.println("ArithmeticException");
            }
        } catch (Exception e) { // 모든 예외의 최고 조상이므로 모든 예외 처리 가능
            System.out.println("Exception");
        } // try-catch 끝
        System.out.println(6);
    }
}
