package ch7;

public class Ex7_12_내부클래스의제어자2 {
    class InstanceInner {int x=10;}
    static class StaticInner {int x=10;}

    InstanceInner iv = new InstanceInner(); // 인스턴스멤버끼리는 직접 접근 가능
    static StaticInner cv = new StaticInner(); // static 멤버끼리는 직접 접근 가능

    static void staticMethod() { // static멤버는 인스턴스 멤버에 직접 접근 불가
//        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();

        Ex7_12_내부클래스의제어자2 outer = new Ex7_12_내부클래스의제어자2(); // 인스턴스 클래스는 외부 클래스를 먼저 생성해야 생성 가능
        InstanceInner obj1 = outer.new InstanceInner();
    }

    void instanceMethod() { // 인스턴스 메서드에서는 인스턴스 멤버와 static멤버 모두 접근 가능
        InstanceInner obj1 = new InstanceInner();
        StaticInner obj2 = new StaticInner();
//        LocalInner lv = new LocalInner(); // 지역 내부 클래스는 외부에서 접근할 수 없다.
    }

    void myMethod() {
        class LocalInner {}
        LocalInner lv = new LocalInner();
    }


    public static void main(String[] args) {
        System.out.println(StaticInner.class);
    }
}
