package ch9;

/**
 * WrapperClass란?
 * 기본형 값을 감싸고 있는 클래스
 * 8개의 기본형은 객체가 아닌데(참조형 X), 이들을 객체로 다뤄야할 때 사용하는 클래스
 * Character, Integer만 제외하고 기본형 소문자에서 대문자로만 바꾸면 래퍼 클래스가 된다.
 * 객체지향 언어에서는 모든 것이 객체여야 하므로, 원래 기본형이 존재해서는 안된다.
 * 그런데 자바에서는 모든 것을 객체로 하지 않고, 기본형을 두게 된 이유는 성능 때문이다.
 * 기본형은 데이터에 직접 접근이 가능하지만, 참조형은 참조변수를 읽고 찾아가야 데이터에 접근이 가능하므로 성능이 떨어진다.
 *
 */

/**
 * Number 클래스란?
 * 모든 숫자 래퍼 클래스의 조상
 * 추상클래스이며, 래퍼 객체의 값을 기본형으로 바꿔주는 메서드들을 가지고 있다.
 */

public class Ex9_8_WrapperClass {
    public static void main(String[] args) {
        Integer i = new Integer(100); // 참조형이라 2단계 거침
        //int i = 100; 1단계
        Integer i2 = new Integer(100);

        System.out.println("i==i2 ? " + (i==i2) + " => 주소값 등가비교");
        System.out.println("i.equals(i2) ? " + i.equals(i2) + " => 값이 같은지 비교"); // Wrapper 클래스는 equals 메서드가 값을 비교하도록 오버라이딩 되어있다.
        System.out.println("i.compareTo(i2)=" + i.compareTo(i2) + " => 뭘 비교하는거지?"); // 오른쪽 값이 같으면 0, 작으면 양수, 크면 음수 = 정렬에 사용되는 메서드
        System.out.println("i.toString()=" + i.toString() + " => i의 값 출력"); // Wrapper 클래스는 toString 메서드가 값을 출력하도록 오버라이딩 되어있다.

        // 래퍼 클래스들은 각각 아래와 같은 정보들을 가지고 있다.
        System.out.println("MAX_VALUE="+Integer.MAX_VALUE);
        System.out.println("MIN_VALUE="+Integer.MIN_VALUE);
        System.out.println("SIZE="+Integer.SIZE+" bits");
        System.out.println("BYTES="+Integer.BYTES+" bytes");
        System.out.println("TYPE="+Integer.TYPE);
    }
}
