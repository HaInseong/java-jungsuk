package ch7;

/*인터페이스란?
 * 추상 메서드의 집합 = 멤버 변수가 없다는 점에서 추상 클래스와 구분되는 듯.
 * ★ 상태 유지 불가: 상태를 유지할 멤버 변수를 가질 수 없다.
 * 생성자를 가질 수 없다.
 * 구현된 것이 전혀 없는 설계도, 껍데기(모든 멤버가 public)
 * 인터페이스 안에서는 항상 예외가 없이 public abstract 사용되므로 생략 가능하다.
 * 인터페이스의 조상은 인터페이스만 가능(Object가 최고 조상 아님)
 * 다중 상속이 가능. = 인터페이스는 추상메서드의 충돌 문제가 없기 때문이야
 * 인터페이스는 추상클래스보다 더 미완성 설계도이기 때문에 당연히 인스턴스를 못만들어.
 * 추상클래스가 상속을 통해서 설계도를 완성하듯이 인터페이스도 구현을 통해서 추상메서드를 완성해.
 * jdk1.8 이후 상수, static, default 메서드가 인터페이스의 구성요소에 추가 되었지만, 핵심은 추상메서드의 집합이라는 것이야.
 * */

interface PlayingCard {
    public static final int SPADE = 4;
    final int DIAMOND = 3; //public static final int DIAMOND = 3; 생략가능
    static int HEART = 2; //public static final int HEART = 2;
    int CLOVER = 1; //public static final int CLOVER = 1;

    public abstract String getCardNumber();
    String getCardKind(); //public abstract String getCardKind(); 생략가능
}

//인터페이스 끼리도 아래처럼 상속을 해.
//대신 타입은 클래스가 아니라 인터페이스로만 가능해.
interface Fightable extends Movable, Attackable {} //적혀있진 않지만 멤버가 move, attack 메서드 포함해서 2개야.
interface Movable {
    void move(int x, int y);
}
interface Attackable {
    void attack(Unit u);
}

/*인터페이스는 껍데기
 * 알매이가 바뀌어도 껍데기는 그대로라서 사용법은 같다.
 * A가 B에 의존하다
 * A가 B를 사용하다
 * 의존하는 경우 B를 바꾸면 A도 바꿔야하는데
 * A가 의존하던 B를 인터페이스 껍데기로 B를 감쌌을 경우
 * 알맹이가 된 B를 C로 바꿔도 A클래스는 변경할 게 없다.
 * 인터페이스를 사용한 경우를 느슨한 결합이라고 하는데 이 경우 변경에는 유리하지만 강결합보다는 느리다.*/

public class Ex7_11_인터페이스 {
    public static void main(String[] args) {
        A a = new A();
        a.method(new B()); //A가 B를 사용(A가 B에 의존)
        a.method(new C());



    }
}

//class A {
//    public void method(B b) {
//        b.methodB();
//    }
//}
//
//class B {
//    public void methodB() {
//        System.out.println("methodB()");
//    }
//}

interface I {
    public void methodB();
}

class A {
    //★ 어떤 클래스를 의존하던 인터페이스를 매개변수로 받으므로 A클래스의 변경은 없다.
    public void method(I i) { //인터페이스 I를 구현한 넘들만 들어와라.
        i.methodB();
    }
}

class B implements I {
    public void methodB() {
        System.out.println("methodB()");
    }
}

class C implements I {
    public void methodB() {
        System.out.println("methodC() in C");
    }
}


/*원격 프로그램 실행
* 1. 프로그램 등록 = 외부에서 실행할 수 있게
* 2. URL과 프로그램을 연결 = REST API*/