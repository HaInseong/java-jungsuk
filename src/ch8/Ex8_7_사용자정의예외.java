package ch8;

/**
 * 사용자 정의 예외는 상속을 통해서 만든다.
 * 조상은 Exception과 RuntimeException 중에서 선택한다.
 * Exception = 사용자가 발생시키는 예외
 * RuntimeException = 개발자가 실수로 발생시키는 예외
 * Exception은 try-catch가 필수이지만, RuntimeException은 선택처리이므로 가능하면 사용자 정의 예외는 후자를 상속 받는다.
 */

public class Ex8_7_사용자정의예외 extends Exception {
    // 에러 코드 값을 저장하기 위한 필드 추가
    private final int ERR_CODE; // 생성자를 통해 초기화 하낟.

    Ex8_7_사용자정의예외(String msg, int errCode) { // ★ 사용자 정의 Exception 만드려면 꼭 문자열을 매개변수로 받는 생성자 필요하다.
        super(msg);
        ERR_CODE = errCode;
    }
    Ex8_7_사용자정의예외(String msg) { // 생성자
        this(msg, 100); // ERR_CODE를 100(기본값)으로 초기화한다.
    }
    public int getErrCode() { // 에러 코드를 얻을 수 있는 메서드도 추가했다.
        return ERR_CODE; // 이 메서드는 주로 getMessage()와 함께 사용될 것이다.
    }
}
