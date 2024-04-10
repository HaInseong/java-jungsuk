package ch8;

public class Ex8_3_multi_catch {
    public static void main(String[] args) {

        try {
            System.out.println();
        } catch (ExceptionA | ExceptionB e) {
            e.method(); // 에러. ExceptionA에 선언된 methodA()는 호출 불가
            // ★ 멀티 catch 블럭의 경우 공통 멤버만 사용 가능하다.
            if (e instanceof ExceptionA) {
                ExceptionA e1 = (ExceptionA) e;
                e1.methodA();
            } else { // if (e instanceof ExceptionB) {...}
            }
            e.printStackTrace();
        }
    }
}
