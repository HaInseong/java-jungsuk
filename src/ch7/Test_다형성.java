package ch7;

/**
 * 다형성이란?
 * 조상 타입 참조 변수로 자손 타입 객체를 컨트롤 하는 것
 * ⇒ 자손 타입 참조 변수로 조상 타입 객체 컨트롤 불가
 *
 * 다형성(타입 불일치)의 장점
 * 1. 매개변수로 자손 모두 받을 수 있다.
 * 2. 조상 타입 배열에 자손들의 객체를 담을 수 있다.
 * = 배열에 담을 수 있다면 반복문 돌릴 수 있으므로 코드가 간결해진다.
 * 3. 사용할 수 있는 멤버의 갯수 조절 가능
 */

class A1 {
    int i;
    public A1(int i) {
        this.i = i;
    }
    int get() {
        return i;
    }
}

class B1 extends A1 {
    int i;
    public B1(int i) {
        super(2*i);
        this.i = i;
    }
    int get() {
        return i;
    }
}

public class Test_다형성 {
    public static void main(String[] args) {
        A1 ab = new B1(7);
        System.out.println(ab.i + ab.get());
        B1 ba = (B1)ab; // 다형성 구현
        System.out.println(ba.i + ba.get());
        System.out.println(ab.get()+","+ba.get());
    }
}
