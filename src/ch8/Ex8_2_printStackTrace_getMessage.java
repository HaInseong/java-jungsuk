package ch8;

public class Ex8_2_printStackTrace_getMessage {
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);

        try {
            System.out.println(3);
            System.out.println(0/0); // ★ 예외가 발생하면 예외 객체가 만들어진다.
            System.out.println(4);
        } catch (ArithmeticException ae) { // ★ 만들어진 예외 객체를 주소를 매개변수로 받고 접근하여 정보를 사용한다.
            // 예외 매개변수도 다형성 적용된다.
            // 그래서 다형성으로 들어오는 것들 중에 instanceOf 연산자로 걸러낸다.
            ae.printStackTrace();
            System.out.println("예외 메세지: " + ae.getMessage());
        }
        System.out.println(6);
    }
}
// 멀티 catch 블럭의 경우 공통 멤버만 사용 가능하다.