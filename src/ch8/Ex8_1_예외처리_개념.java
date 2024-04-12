package ch8;

/**
 * 자바 컴파일러 역할 => 컴파일 에러
 * 1. 문법 구문 체크
 * 2. 번역
 * 3. 소스코드 최적화 ex) int i = 3 + 5; = 컴파일러가 상수 계산 정도는 자동으로 해준다.
 * 4. 생략된 코드들 자동 추가
 */

/**
 * 컴파일 에러 VS 런타임 에러
 * 구문 체크에서 문제가 있을 때는 컴파일 에러
 * ★ 컴파일 에러가 발생하면 문제를 수정하기 전 까진 클래스 파일 생성 안된다.
 *
 * 프로그램을 실행했을 때 문제가 있을 때는 런타임 에러 발생
 * 런타임 에러가 발생하면 프로그램이 실행은 되지만, 실행 중에 문제되는 부분에서 에러 발생으로 프로그램이 죽는다.
 */

/**
 * 에러 VS 예외
 * 1. 에러: 프로그램 코드에 의해서 수습될 수 없는 심각한 오류 ex) OutOfMemory
 * 2. 예외: 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류 = 개발자가 잡을 수 있다.
 * 컴파일 에러가 아닌 둘 다 런타임 에러이다.
 */

/**
 * 예외 처리를 하는 이유는?
 * 런타임 에러가 발생하면 프로그램이 죽게 된다.
 * 그러나 대부분 프로그램이 죽는걸 막고, 정상적인 상태를 유지해야한다. ex) 웹사이트가 죽는게 말이 되지 않는 것 처럼
 * 예외처리를 하여 정상적인 상태를 유지하면서 오류가 난 부분을 고치면 된다.
 */

/**
 * Exception클래스들 VS RuntimeException클래스들
 * 1. Exception클래스들: 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외 ex) IOEception 입출력 예외, ClassNotFoundException 클래스 파일이 존재하지 않을 때 예외
 * 2. RuntimeException클래스들: 프로그래머의 실수로 발생하는 예외
 *
 * ex) 런타임 Exception의 예 - 프로그래머들은 실수가 발생하지 않도록 견고한 코드 작성이 필요.
 * ArithmeticException 산술 계산 잘못 했을 때 발생하는 예외, 5/0
 * ClassCastException 형변환 잘못 했을 때 발생하는 예외
 * NullPointerException 객체가 null인데 호출했을 때 발생하는 예외, String str = null;인데 str.length();
 * ArrayIndexOutOfBoundsException 배열 범위 벗어낫을 때 발생하는 예외
 */

public class Ex8_1_예외처리_개념 {
    public static void main(String[] args) {
        System.out.println(args[0]); // 컴파일 시 구문에는 문제 없으므로 통과 but 런타임 에러 발생
    }
}
