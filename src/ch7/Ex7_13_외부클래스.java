package ch7;

public class Ex7_13_외부클래스 {
    private int outerIv = 0;
    private static int outerCv = 0;

    class InstanceInner {
        int iiv = outerIv; // ★ 외부클래스의 private 멤버에도 자유롭게 접근 가능
        int iiv2 = outerCv;
    }

    static class StaticInner {
        // ★ 스태틱 클래스는 외부 클래스의 인스턴스 멤버에 접근할 수 없다.
//        int siv = outerIv;
        static int scv = outerCv;
    }

    void myMethod() {
        int lv = 0;
        final int LV = 0; // JDK 1.8 부터 final 생략 가능
        // ★ 상수는 constant pool에 저장된다.
        // 그래서 메서드가 종료되더라도, 상수의 값이 따로 저장되어 있으므로 사용 가능하다.

        class LocalInner {
            int liv = outerIv;
            int liv2 = outerCv;
            // ★ 외부 클래스의 지역변수는 final이 붙은 변수(상수)만 접근 가능하다.
            int liv3 = lv; // 에러!!!(JDK 1.8부터 에러 아님)
            int liv4 = LV;

            void method() { // ★ myMethod()는 호출되고 종료되지만 객체는 더 오래 살아남아 있을 수 있으므로 항상 final을 붙여줘야한다
                System.out.println(lv);
            }
        }
    }
}
