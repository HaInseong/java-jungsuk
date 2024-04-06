package ch7;


public class Ex7_12_내부클래스의제어자 {

    class InstanceInner {
        int iv = 100;
        //static int cv = 100;            // Error! static 변수를 선언할 수 없다.
        final static int CONST = 100;   // final static은 상수이므로 허용.
    }

    static class StaticInner {
        int iv = 200;
        static int cv = 200;
    }

    void myMethod() {
        class LocalInner {
            int iv = 300;
            //static int cv = 300; // Error! static 변수를 선언할 수 없다.
            final static int CONST = 300; // final static은 상수이므로 허용.
        }
    }

}
