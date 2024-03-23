package ch7;

class MyPoint {
    int x = 1;
    int y = 2;
}

/*상속은 영어 그대로 "class Circle은 확장한다 Object를"이라 생각하면 쉽다.
Object 조상 객체에는 11개의 기본 메서드가 정의되어 있다.*/
class Circle extends Object {
    float r = 3.141592F;
    MyPoint p;
    public Circle() {
        p = new MyPoint();
    }
    /*
    ★ 포함관계란?
    객체를 생성할 때 내부에 선언된 다른 클래스 참조 타입의 멤버 변수에 다른 클래스 객체를 생성하여 주소값을 가지는 경우.
    객체 내부에 여러 변수를 선언 하는 것 보다 클래스 타입 변수를 선언하여 포함관계로 만들면 코드 복잡도를 줄일 수 있다.
    상속은 여러가지 제약이 많기 때문에 꼭 필요할 때만 쓰는데, 대부분 90%의 경우가 상속관계가 아니라 포함관계이다.
    개인적으로는 처음 배울 때는 포함관계 코드가 더 복잡하고 어렵게 느껴졌다.
     */

}

public class Ex7_3_포함관계 {
    public static void main(String[] args) {

        Circle c = new Circle();
        Circle c2 = new Circle();

        System.out.println(c.p.x);
        System.out.println(c.r);
        System.out.println(c.p.y);

        System.out.println(c.toString()); //Object.toString()호출 후 'className@addressOfObj' 리턴.
        System.out.println(c2.toString()); //객체마다 주소값 다르다는 걸 알 수 있다.

        System.out.println(c);
        System.out.println(c2);
        //toString() 생략해도 결과는 똑같이 출력된다.
        //println 메서드에 정의된 기능으로 참조변수가 매개변수로 들어오면 자동으로 toString()를 호출한다.
    }
}


