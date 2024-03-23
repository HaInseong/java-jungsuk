package ch7;

class MyPoint2 {
    int x;
    int y;
    String getLocation() {
        return "x:" + x +", "+ "y:" + y;
    }

    public String toString() { //public을 붙인 이유 = 오버라이딩 하려면 선언부가 똑같아야 한다.
        return "toString 오버라이딩 = "+ "x:"+x+", " + "y:" + y;
        //toString 오버라이딩 해두면 iv값들을 출력하려고, 참조변수로 하나씩 접근하지 않아도 된다.
    }
}

class MyPoint3D extends MyPoint2 {
    int r;

    MyPoint3D(int x, int y, int r) {
        super.x = x;
        super.y = y;
        this.r = r;
    }

    String getLocation() {
        return "x:" + x +", "+ "y:" + y + ", " + "r:" + r;
    }
}


/*
오버라이딩의 조건
1. 선언부가 조상 클래스의 메서드와 일치해야 한다.
2. 접근 제어자를 조상 클래스의 메서드보다 좁은 범위로 변경할 수 없다.
3. 예외는 조상 클래스의 메서드보다 많이 선언할 수 없다.
 */

public class Ex7_4_오버라이딩 {
    public static void main(String[] args) {
        MyPoint2 p2 = new MyPoint2();
        MyPoint3D p3 = new MyPoint3D(1, 2, 3);
//        p3.x = 1;
//        p3.y = 2;
//        p3.r = 3;
        //위에 초기화를 주석처리 한 이유는?
        //직접 MyPoint3D클래스에 생성자를 만들어서 생성과 동시에 처리하는게 코드가 깔끔하다.

        System.out.println("p2의 toString 메서드로 객체 주소값 출력: " + p2);
        System.out.println("p2의 toString 메서드로 객체 주소값 출력: " + p3);
        System.out.println(p2.getLocation());
        System.out.println(p3.getLocation());

        System.out.println(p2); //toString 오버라이딩 결과값 출력

    }
}
