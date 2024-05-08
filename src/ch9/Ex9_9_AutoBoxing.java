package ch9;

/**
 * 문자열을 숫자로 변환하는 다양한 방법들
 * 참조변수.Parse...(), 참조변수.valueOf()
 */

import java.util.ArrayList;

/**
 * 오토박싱 & 언박싱이란?
 * 기본형과 참조형 간의 자동 형변환을 의미
 * AutoBoxing: int -> Integer 타입으로 자동으로 바꿔주는 것 = 기본형을 감싸서 래퍼 클래스로 바꿔주는 것
 * UnBoxing: 래퍼 클래스 타입을 기본형으로 자동으로 바꿔주는 것
 * jdk 1.5 이전에는 기본형과 참조형간의 연산이 불가능했다.
 * 이후에는 오토박싱과 언박싱 기능을 통해 컴파일러가 컴파일 후 자동으로 연산이 가능하도록 변경해준다.
 *
 */
public class Ex9_9_AutoBoxing {
    public static void main(String[] args) {
        int i = new Integer("100").intValue(); // 래퍼클래스 객체 -> 기본형: floateVlaue(), longValue(), ...
        int i2 = Integer.parseInt("100"); // 주로 이 방법을 많이 사용. = ParseInt: 문자열을 기본형으로 변경
        Integer i3 = Integer.valueOf("100"); // 숫자, 문자열 -> 래퍼클래스 객체
//        System.out.println(i2.TYPE); 기본형이라 메서드 호출 불가
        System.out.println(i3.TYPE);
        // Integer i3 = new Integer("100"); // 대부분 래퍼클래스가 문자열을 매개변수로 받는 생성자가 있다.
        // i3.toString()
        int i4 = Integer.valueOf("100"); // ★ valueOf: 문자열 -> 기본형으로도 변경 가능
        int i5 = Integer.parseInt("100", 2); // 100을 2진수로 표현
        System.out.println(i5);

        // 기본형의 값을 객체로 자동변화하는 것을 오토박싱, 그 반대는 언박싱
        ArrayList<Integer> list = new ArrayList<>(); // ArrayList는 객체만 저장 가능
        list.add(10); // 원래 list에는 객체만 추가가능 => 자동 오토박싱: 10 -> new Integer(10)
        //list.add(new Integer(10)); // ★ 컴파일러가 기본형을 객체로 자동 변환해준다.
        list.add(20);
        System.out.println(list);
        int value = list.get(0); // 자동 언박싱: new Integer(10) -> 10
        //Integer value = list.get(0); // 원래 list에서 꺼내면 저장된게 객체이므로 Integer 객체가 반환된다.
        // int value = list.get(0).intValue(); // ★ 컴파일러가 객체를 기본형으로 자동 변환해준다.
        int value1 = list.get(1);
        System.out.println(value);
        System.out.println(value1);
        System.out.println(value+value1);
    }
}
