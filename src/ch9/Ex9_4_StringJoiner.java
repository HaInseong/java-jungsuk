package ch9;

/**
 * join()은 여러 문자열 사이에 구분자를 넣어서 결합한다.
 */

public class Ex9_4_StringJoiner {
    public static void main(String[] args) {
        String animals = "dog,cat,bear";
        String[] arr = animals.split(",");
        String str = String.join("-", arr); // 단순 문자열 결합보다 속도가 빠르다는 장점.
        System.out.println(str);

        // 숫자를 문자열로 바꾸는 방법
        int i = 100;
        String str1 = i + ""; // 편리함
        String str2 = String.valueOf(i); // 100을 "100"으로 변환하는 방법2 (1번 보다 속도 빠름)
        // 문자열을 숫자로 바꾸는 방법(래퍼클래스)
        int i2 = Integer.parseInt("100");
        int i3 = Integer.valueOf("100"); // 래퍼클래스에 존재한느 각각의 parse 메소드들을 valueOf로 통일 시킴
        Integer i4 = Integer.valueOf("100"); // 원래는 반환 타입이 Integer인 참조형이지만 기본형으로 int를 써도 괜찮다. = 오토박싱 이라는 기능이 참조형을 기본형으로 자동으로 변경시켜준다.
    }
}
