package ch7;


//참조변수 super
class Parent {
    int x; //Child클래스 기준 super.x
    int y;

    Parent(){}
    Parent(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Child extends Parent {
    int x = 20; //this.x
    //조상과 이름이 같아도 새롭게 선언이 가능하다.
    //super, this 참조 변수로 각각 가르키게 된다.

    int z;


    /*
    상속 시 조상의 생성자를 생성자의 첫 줄에 반드시 생성자를 호출해야 한다.
    그렇지 않으면 컴파일러가 생성자의 첫 줄에 super();를 자동으로 삽입
    */
    Child(int x, int y, int z) {
        //this.x = x; 초기화는 직접 조상이 하도록
        //this.y = y;
        super(x, y); //★조상이 정의된 생성자를 가지고 있으니 조상멤버 초기화는 조상이 직접하도록 해야한다.
        this.z = z;
    }

    void method() {
        System.out.println("x=" + x);
        System.out.println("this.x=" + this.x);
        System.out.println("super.x=" + super.x);
        System.out.println("z=" + z);
    }
}

public class Ex7_2_this와super {
    public static void main(String[] args) {

        Child ch = new Child(10, 20, 30);
        ch.method();
        System.out.println("------------------------------");

        Point[] p = {
                new Point(100, 100),
                new Point(140, 50),
                new Point(200, 100)
        };

        Triangle t = new Triangle(p);
        Circle2 c = new Circle2(new Point(150, 150), 50);

        t.draw();
        c.draw();

    }
}
class Shape {
    String color = "black";
    void draw() {
        System.out.printf("[color=%s]\n");
    }
}

class Point {
    int x;
    int y;
    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    Point() { //어디에서 사용되는지?
        this(0, 0);
    }
    String getXY() {
        return "("+x+","+y+")";
    }
}
class Circle2 extends Shape {
    Point center;
    int r;

    Circle2() {
        this(new Point(0, 0), 100);
    }
    Circle2(Point center, int r) { //Circle2() 생성자에서 Point 객체 생성해서 이 생성자 매개변수로 넘김.
        this.center = center;
        this.r = r;
    }
    void draw() {
        System.out.printf("[center=(%d, %d), r=%d, color=%s\n", center.x, center.y, r, color);
    }
}

class Triangle extends Shape {
    Point[] p = new Point[3];

    Triangle(Point[] p) {
        this.p = p;
    }
    void draw() {
        System.out.printf("[p1=%s, p2=%s, p3=%s, color=%s]\n", p[0].getXY(), p[1].getXY(), p[2].getXY(), color);
    }
}