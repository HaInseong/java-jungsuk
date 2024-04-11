package ch8;

/**
 * 메서드에 예외 선언하기
 * = 메서드를 호출할 시 발생 가능한 예외를 호출하는 쪽에 알리는 것
 * 예외를 발생시키는 키워드는 throw이다. 예외를 메서드에 선언할 때 쓰이는 thorws를 잘 구별하자.
 * 예외를 처리하는 방법
 * 1. try-catch문(직접 처리)
 * 2. 예외 선언하기(상사에게 보고)
 * 3. 예외 은폐(빈 catch문 사용)
 */

/**
 * 오버라이딩 3가지 규칙
 * 1. 선언부 일치
 * 2. 접근제어자 좁게 설정 불가
 * 3. 조상보다 많은 예외 선언 불가
 */

public class Ex8_5_예외떠넘기기_개념 {
    // ★ main메서드까지 예외를 떠넘기면 프로그램이 비정상 종료 된다.
    // main메서드를 호출한 JVM이 예외를 넘겨 받고, printStack메서드를 실행한다.
    public static void main(String[] args) throws Exception{
//        try {
            method1(); // 같은 클래스 내의 static멤버이므로 객체 생성없이 직접 호출 가능.
//        } catch (Exception e) {
//            System.out.println("예외 잡기");
//        }
    }

    static void method1() throws Exception {
        method2();
    }

    static void method2() throws Exception {
        throw new Exception();
    }
}
