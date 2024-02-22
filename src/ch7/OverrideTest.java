package ch7;

class MyPoint2 {
    int x;
    int y;
    String getLocation() {
        return "x:" + x +", "+ "y:" + y;
    }
}

class MyPoint3D extends MyPoint2 {
    int r;

    String getLocation() {
        return "x:" + x +", "+ "y:" + y + ", " + "r:" + r;
    }
}

public class OverrideTest {
    public static void main(String[] args) {
        MyPoint2 p2 = new MyPoint2();
        MyPoint3D p3 = new MyPoint3D();
        p3.x = 1;
        p3.y = 2;
        p3.r = 3;

        System.out.println("p2의 toString 메서드로 객체 주소값 출력: " + p2);
        System.out.println("p2의 toString 메서드로 객체 주소값 출력: " + p3);
        System.out.println(p2.getLocation());
        System.out.println(p3.getLocation());

    }
}
