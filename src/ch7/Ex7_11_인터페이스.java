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

class Point3 {
    int x, y;

    Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point3 {
    int z;
    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

public class Ex7_11_인터페이스 {
    public static void main(String[] args) {
        Point3D d = new Point3D(10, 20 , 30);

        System.out.println(d.x);
        System.out.println(d.y);
        System.out.println(d.z);
    }
}



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

