package ch9;

public class Ex9_9_AutoBoxingEx {
    public static void main(String[] args) {
        int i = 10;

        // 기본형을 참조형으로 형변환(형변환 생략가능)
        Integer intg = (Integer)i; // 컴파일 후의 코드 Integer intg = Integer.valueOf(i);
        Object obj = (Object)i; // Object obj = (Object)Integer.valueOf(i);

        Long lng = 100L; // Long lng = new Long(100L);

        int i2 = intg + 10; // jdk 1.5 이후 참조형과 기본형간의 연산 가능
        long l = intg + lng; // 참조형 간의 덧셈도 가능

        Integer intg2 = new Integer(20);
        int i3 = (int)intg2; // 참조형을 기본형으로 형변환도 가능(형변환 생략가능)

        // ★ 핵심은 컴파일러의 오토박싱, 언박싱 덕분에 형변환 연산자를 통해서 기본형과 참조형간의 형변환이 편리해졌다는 것.

    }
}
