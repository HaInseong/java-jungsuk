package ch8;

public class Ex8_4_예외만들기2 {
    public static void main(String[] args) {
        try {// Exception과 그 자손은 반드시 예외처리 해줘야 한다. 해주지 않을 시 컴파일 오류 발생한다.
            throw new Exception();
        } catch(Exception e) {}

        // ★ RuntimeException과 그 자손은 예외처리를 해주지 않아도 컴파일은 된다.
        throw new RuntimeException();
    }
}
