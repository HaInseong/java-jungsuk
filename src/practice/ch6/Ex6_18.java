package practice.ch6;

public class Ex6_18 {
}

class MemberCall {
    int iv = 10;
    static int cv = 20;

    int iv2 = cv;
//    static int cv2 = iv; //static클래스 변수에서는 객체를 생성해야지만 사용할 수 있는 iv는 사용할 수 없음.

    static void staticMethod1() {
        System.out.println(cv);
//        System.out.println(iv); //static메서드에서 객체를 생성해야지만 사용할 수 있는 instance 변수를 사용할 수 없음
    }

    void instanceMethod1() {
        System.out.println(cv);
        System.out.println(iv);
    }

    static void staticMethod2() {
        staticMethod1();
//        instanceMethod1(); //static메서드에서 객체를 생성해야지만 사용할 수 있는 instanceMethod1() 메서드를 호출할 수 없음.
    }

    void instanceMethod2() {
        staticMethod1();
        instanceMethod1();
    }
}
