package ch7;

public class Ex7_2 {
    public static void main(String[] args) {
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

    Circle2() { //어디에서 사용되는지?
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