package ch7;

class Tv {
    boolean power;
    int channel;


    void power() {
        power = !power;
    } //power 변수의 현재 값을 반전 시킨다.
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
