package ch9;

/**
 * Object클래스란?
 * 모든 클래스의 최고 조상, 오직 11개의 메서드만을 가지고 있다. = iv, cv없다.
 * notify(), wait() 등은 쓰레드와 관련된 메서드이다.
 */

/**
 * Class객체란?, Reflection API란?
 * 자바소스 컴파일하면, *.class 파일이 생성되잖아?
 * 예를들어, Hello.java를 컴파일하면 Hello.class파일이 생성되는 것 처럼 말이야.
 * ★ 이 클래스파일이 메모리에 올라갈 때, Hello라는 클래스의 Class 객체가 만들어진다.
 * Class 객체에는 Hello.class 파일에 있는 내용들을 사용하기 쉽게 정리해서 저장해두었다고 생각하면 돼.
 * 이처럼 설계도를 가지고, 클래스 객체 생성도 하고, 정보를 가지고 올 수 있게 해주는 걸 Reflection API라 한다.
 */

import java.util.Objects;

/**
 * equals(Object obj)
 * 객체 자신(this)과 주어진 객체(obj)를 비교한다. 같으면 true, 다르면 false.
 * Object클래스에 정의된 디폴트 equals()는 객체의 주소를 비교(참조변수 값 비교)
 * 인스턴스 변수(iv)의 값을 비교하도록 equals를 오버라이딩해야 한다.
 * ★ 클래스를 만들 때는 기본적으로 equals는 iv값으로 비교하도록 오버라이딩해줘야 한다.
 * equals오버라이딩 하게 되면 hashCode()도 오버라이딩 해야한다는 것을 잊지 말자.
 */

class Value {
    int value;

    Value(int value) {
        this.value = value;
    }

    //equals() 오버라이딩 하지 않아서 조상인 Object의 equals() 그대로 사용한다.
}

class Value2 {
    int value;

    Value2(int value) {
        this.value = value;
    }

    // Object의 equals()를 오버라이딩해서 주소가 아닌 value를 비교
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Value2)) {
            return false;
        }
        Value2 v2 = (Value2)obj;
        return this.value == v2.value;
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}

public class Ex9_2_Object클래스 {
    public static void main(String[] args) {

        Value v1 = new Value(10);
        Value v2 = new Value(10);
        System.out.println(v1.equals(v2));
        System.out.println(v1);
        System.out.println(v2);

        System.out.println();

        // ★ Value객체가 가진 iv 값을 가지고 같고 다름을 비교하려면 equals()를 오버라이딩해야한다.
        Value2 v11 = new Value2(10);
        Value2 v22 = new Value2(10);
        System.out.println(v11.equals(v22));
        System.out.println(v11);
        System.out.println(v22);
    }
}
