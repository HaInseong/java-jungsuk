package ch7;

class MyPoint {
    int x = 1;
    int y = 2;
}

class Circle extends Object { //상속관계
    float r = 3.141592F;
    MyPoint p; //포함관계

    public Circle() {
        p = new MyPoint();
    }
}

public class InheritanceTest {
    public static void main(String[] args) {

        Circle c = new Circle();
        Circle c2 = new Circle();

        System.out.println(c.p.x);
        System.out.println(c.r);
        System.out.println(c.p.y);
        System.out.println(c.toString());
        //Object.toString() = '클래스 이름 @ 객체 주소값' 출력함.
        System.out.println(c2.toString()); //객체마다 주소값 다름을 볼 수 있음.
        System.out.println(c);
        System.out.println(c2);
        //toString() 생략해도 결과는 똑같이 출력됨.
        //println 메서드의 기능임. 참조변수가 매개변수로 들어오면 자동으로 toString()를 호출함.
    }
}
