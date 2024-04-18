package ch9;

/**
 * hashCode메서드란?
 * 객체의 해시코드(정수값)를 반환하는 메서드
 * Object클래스의 hashCode()는 객체의 주소를 int로 변환해서 반환
 * Object클래스의 hashCode()는 native메서드인데, 이는 OS가 가지고 있는 메서드라는 의미.
 * OS내에 C언어로 작성되어 있다. 그래서 Object 클래스의 hashCode() 메서드를 보면 구현부가 없다.
 * equals()를 오버라이딩하면, hashCode()도 오버라이딩해야 한다.
 * ★ 왜나하면 equals()의 결과가 true인 두 객체의 해시코드는 같아야하기 때문에
 * hashCode() 오버라이디 이후에 객체마다 다른 해시코드 값이 필요할 때는 identityHashCode(Object obj)를 사용하면 된다.
 */

import java.util.Objects;

/**
 * toString메서드란?
 * 객체를 문자열(String)으로 변환하기 위한 메서드
 * ★ '객체 == iv집합'이므로 객체를 문자열로 변환한다는 것은 iv의 값을 문자열로 변환한다는 것과 같다.
 */

class Card {
    String kind;
    int number;

    Card() {
        this("SPADE", 1);
    }

    Card(String kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    public boolean equals(Object obj) {
        if(!(obj instanceof Card))
            return false;

        Card c = (Card)obj;
        return this.kind.equals(c.kind) && this.number==c.number;
    }

    // equals()를 오버라이딩하면 hashCode()도 오버라이딩 해야한다.
    public int hashCode() {
        return Objects.hash(kind, number); // int hash(Object... values){...}
        // 매개변수가 가변인자(Object...)라서 호출 시 지정하는 값의 개수가 정해져있지 않다.
        // iv 매개변수 값이 같으면 같은 값이 나오게 된다.
    }

    //Object클래스의 toString()을 오버라이딩
    public String toString() {
        return "kind:"+kind+", number:"+number;
    }
}


public class Ex9_1_hashCode {
    public static void main(String[] args) {
        String str1 = new String("abc");
        String str2 = new String("abc");
        // ★ equals()와 hashCode()가 둘 다 오버라이딩이 잘 되어 있는 경우
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.hashCode()); // 96354
        System.out.println(str2.hashCode()); // 95354
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));

        Card c1 = new Card();
        Card c2 = new Card();

        System.out.println(c1.equals(c2));
        System.out.println(c1.hashCode());
        System.out.println(c2.hashCode());

        System.out.println(c1.toString());
        System.out.println(c2.toString());
    }
}


