package ch7;


public class Ex7_12_내부클래스의제어자 {

    class InstanceInner {
        int iv = 100;
        //static int cv = 100;            // Error! static 변수를 선언할 수 없다.
        final static int CONST = 100;   // final static은 상수이므로 허용.
        // ★ 상수인 경우에는 static 내부 클래스가 아니더라도 static멤버를 사용할 수 있다.
        // 해당 객체 안에서만 사용되는 상수가 아니라면 대부분 static을 붙인다.
    }

    // ★ 내부 클래스를 작성하려는데 static멤버가 필요하다면?
    // 내부 클래스도 static내부 클래스로 접근제어자를 맞춰야 한다.
    // 왜냐하면, static멤버는 객체 생성없이 사용 가능한 것인데,
    // 일반 인스턴스 클래스라면 객체를 생성해야 멤버를 사용할 수 있는 클래스이므로 서로 모순이 발생한다.
    // 그리고 static 클래스가 된다면 객체를 생성하지 않아도 사용가능 하게 되잖아?
    // 그럼 static 내부 클래스에서는 외부 클래스의 인스턴스 멤버에 접근할 수 없어.
    // 왜냐하면, 외부 클래스들은 객체를 생성해야 사용 가능한 경우도 있을 수 있거든.
    // static이 붙으면 모든 곳에서 공유하는 상수값이 되는거야.
    // 그런데 앞에서 Card클래스에서 kind, num 변수에는 static이 안붙고 final만 붙였던 예제 기억하지?
    // 생성하는 객체 안에서 한번 정해진 카드 종류와 숫자는 바껴서는 안되지만,
    // 객체를 생성할 때 또 새로운 카드와 종류와 숫자가 배정되어야 하기 때문에 static은 사용하지 않는거야.
    // 하지만, CARD_NUM = 52 같은 경우에는 카드의 총 개수가 52개에서 바껴서는 안되므로 fianl이 필요하고, 모든 객체에서 동일하게 52개를 공유하니까 static이 필요해.
    // 그래서 final static CARD_NUM = 52;로 선언했던거야.
    // 즉, 절대 바뀔일이 없는 상수라면 인스턴스 내부클래스에 사용 가능하다 이거야.

    static class StaticInner {
        int iv = 200;
        static int cv = 200; // ★ 여기서 핵심은 static 클래스만 static 멤버를 가질 수 있다는 것.
        // 그리고 static 내부 클래스에서는 외부 클래스의 인스턴스 멤버에 접근할 수 없어.
        // 왜냐하면, 객체가 생성되어 있을 수도 있고 안되어 있을 수도 있기 때문에 접근제한을 걸어둔거야.
    }

    void myMethod() {
        class LocalInner {
            int iv = 300;
            //static int cv = 300; // Error! static 변수를 선언할 수 없다.
            final static int CONST = 300; // final static은 상수이므로 허용.
            // 지역 내부 클래스의 static 상수는 메서드 내에서만 사용가능.
        }
        int i = LocalInner.CONST; // OK
    }

    public static void main(String[] args) {
        System.out.println(InstanceInner.CONST);
        System.out.println(StaticInner.cv);
        //System.out.println(LocalInner.CONST); // Error 발생
        // 메서드 지역 내부 클래스의 멤버는 메서드 안에서만 사용 가능하다.
        // 메서드 지역 변수는 메서드 안에서만 사용 가능한 것이랑 같은 이치.
    }

}


class 내부클래스제어자_Test {
    public static void main(String[] args) {
        Ex7_12_내부클래스의제어자 oc = new Ex7_12_내부클래스의제어자();
        Ex7_12_내부클래스의제어자.InstanceInner ic = oc.new InstanceInner();
        System.out.println(ic.iv);
        System.out.println(Ex7_12_내부클래스의제어자.InstanceInner.CONST);
        System.out.println(Ex7_12_내부클래스의제어자.StaticInner.cv);


    }
}
