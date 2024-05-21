package ch7;

/**
 * 자바 파일을 컴파일하면 클래스 파일이 만들어지는데,
 * 클래스 파일은 컴퓨터만 이해할 수 있는 바이트코드로 작성되어 있다.
 * 보통 상속으로 구현된 자식클래스들은 자바파일을 통째로 넘기지 않고, 보안상 클래스 파일만 넘기는 경우가 많다.
 * 이런 경우, 부모 클래스의 소소크드를 보고 기능을 구현할 수 있다.
 * 부모클래스가 인터페이스의 역할을 한다고 생각하면 된다.
 */

class Tv {
    boolean power;
    int channel;


    void power() {
        power = !power;
    } //power 변수의 현재 값을 반전 시켜서 새로 대입.
    //power가 true 이면 false로, false이면 true로 변경

    void channelUp() {
        ++channel;
    }

    void channelDown() {
        --channel;
    }
}

class SmartTv extends Tv {
    boolean caption;
    void displayCaption(String text) {
        if(caption) {
            System.out.println(text);
        }
    }
}
public class Ex7_1_상속 {
    public static void main(String[] args) {
        SmartTv stv = new SmartTv();
        stv.channel = 10;
        stv.channelUp();
        System.out.println(stv.channel);
        stv.displayCaption("Caption off");
        stv.caption = true;
        stv.displayCaption("Cation on");
    }
}
