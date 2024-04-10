package ch8;

public class Ex8_1_try_catch1 {
    public static void main(String[] args) {
        System.out.println(1);
        try {
            System.out.println(2);
            System.out.println(3);
        } catch(Exception e) {
            System.out.println(4);// 예외가 발생하지 않았으므로 catch블록은 실행되지 않음
        } // try-catch 끝
        System.out.println(5);
    }
}
