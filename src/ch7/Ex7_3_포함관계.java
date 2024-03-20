package ch7;

class MyPoint {
    int x = 1;
    int y = 2;
}

class Circle extends Object { //상속관계
    float r = 3.141592F;
    MyPoint p;

    /*
    ★ 포함관계란?
    객체를 생성할 때 내부에 선언된 다른 클래스 참조 타입의 멤버 변수에
    다른 클래스 객체를 생성하여 주소값을 가지는 경우
    객체 내부에 여러 변수를 선언 하는 것 보다 클래스 타입 변수를 선언하여
    포함관계를 만드는 것이 복잡도를 더 줄이는 방법이다.
    상속은 여러가지 제약이 많기 때문에 꼭 필요할 때만 쓴다.
    그래서 대부분 90%의 경우가 상속관계가 아니라 포함관계이다.
     */
    public Circle() {
        p = new MyPoint();
    }
}

public class Ex7_3_포함관계 {
    public static void main(String[] args) {

        Circle c = new Circle();
        Circle c2 = new Circle();

        System.out.println(c.p.x);
        System.out.println(c.r);
        System.out.println(c.p.y);
        System.out.println(c.toString());
        //Object.toString() = 'className@addressOfObj' 출력함.
        System.out.println(c2.toString()); //객체마다 주소값 다름을 볼 수 있음.
        System.out.println(c);
        System.out.println(c2);
        //toString() 생략해도 결과는 똑같이 출력됨.
        //println 메서드의 기능임. 참조변수가 매개변수로 들어오면 자동으로 toString()를 호출함.
    }
}


