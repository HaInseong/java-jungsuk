package ch7;

class Time {
    int hourTest;
    private int hour; //0~23사이의 값을 가져야한다. = private으로 바꾸는 이유
    private int minute;
    private int second;

    public void setHour(int hour) {
        if(isNotValidHour(hour)) return;
        this.hour = hour;
    }
    // 클래스 안에 있는 setHour메서드에서만 사용하므로 private 제어자 설정
    // 굳이 public 하면 외부에서 다 사용 가능한 메서드가 되어버림.
    private boolean isNotValidHour(int hour) {
        return hour < 0 || hour > 23;
    }

    public int getHour() {
        return this.hour;
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Time t = new Time();
        t.hourTest = 100;
        System.out.println(t.hourTest);
//        t.hour = 100; //private이라 외부 접근으로 변경 불가
        t.setHour(21);
        System.out.println(t.getHour());
        t.setHour(100);
        System.out.println(t.getHour()); //100은 유효한 값이 아니기 때문에 여전히 100

    }
}
