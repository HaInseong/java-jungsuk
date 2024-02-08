package practice.ch6;

import static java.lang.String.valueOf;

public class Ex6_2 {
    public static void main(String[] args) {
        SutdaCard2 card1 = new SutdaCard2(3, false);
        SutdaCard2 card2 = new SutdaCard2();

        System.out.println(card1.info());
        System.out.println(card2.info());

    }
}

class SutdaCard2 {

    String num = "1K";

    boolean value;
    //기본 생성자
    public SutdaCard2() {

    }
    //매개변수를 받는 생성자
    public SutdaCard2(int num, boolean value) {
        this.num = valueOf(num); //이 객체를 가르키는 참조변수
    }

    public String info() {
        return num;
    }
}
