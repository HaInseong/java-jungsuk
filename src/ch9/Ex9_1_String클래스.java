package ch9;

/**
 * String 클래스란?
 * 문자열을 다루기 위한 클래스
 * String클래스 = 데이터(cahr[]=문자배열) + 메서드(문자열 관련)
 * 내용을 변경할 수 없는 불변(immutable)클래스
 * 문자열 결합을 할 때마다 계속 새로운 문자열이 만들어지므로 덧셈 연산자(+)를 이용한 문자열 결합은 성능이 떨어진다.
 * 문자열 결합이나 변경이 잦다면, 내용을 변경가능한 STringBuffer를 사용한다. ex) 반복문 안에서 지속적인 문자열 결합
 */

/**
 * 문자열의 비교
 * String str = "abc";와 String str = new String("abc");의 비교
 * ★ 문자열은 내용 변경이 불가하기 때문에 여러 참조 변수가 공유해도 문제가 없다. 굳이 같은 내용의 문자열을 새로운 객체로 만들 필요가 없다.
 * 주소값은 공유되므로 문자열의 같고 다름을 비교할 때는 대입연산자가 아니라 equals()를 사용해야한다.
 */

/**
 * 문자열 리터럴
 * 문자열 리터럴은 프로그램 실행시 자동으로 생성된다.(constant pool에 저장)
 * 같은 내용의  문자열 리터럴은 하나만 만들어진다.(String 객체는 내용 변경 불가)
 */

/**
 * 빈 문자열
 * 내용이 없는 문자열, 크기가 0인 char형 배열을 저장하는 문자열
 * 자바에서는 길이가 0인 배열을 생성하는 것은 어느 타입이나 가능
 */
public class Ex9_1_String클래스 {

//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof String)) {
//            return false;
//        }
//        String s = (String)obj;
//        return this.equals(s);
//    } String 클래스는 equals 메서드를 오버라이딩 할 필요가 없다. = 이미 되어 있다.

    public static void main(String[] args) {
        String str1 = "abc"; // 문자열 리터럴 "abc"의 주소가 str1에 저장됨
        String str2 = "abc";
        boolean result1 = str1 == str2;
        boolean result2 = str1.equals(str2);
        System.out.println(result1);
        System.out.println(result2);

        String str3 = new String("abc"); // 새로운 String인스턴스를 생성
        String str4 = new String("abc");
        System.out.println(str3 == str4);
        System.out.println(str3.equals(str4));
    }
}
