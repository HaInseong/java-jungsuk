package ch7;
/*접근제어자
 * public, 제한없음
 * protected 같은 패키지 or 다른 패키지 자손까지
 * (default), 같은 패키지
 * private, 같은 클래스
 *접근제어자를 사용하는 이유는?
 * 외부로부터 데이터를 보호하기 위해서
 * 멤버 변수에 직접 접근은 막고, 메서드를 통해 간접적으로 데이터 변경해야 한다.*/

class Time {
    int hourTest;
    private int hour; //0~23사이의 값을 가져야한다. = private으로 바꿔서 메서드에서 필터링 하자. = 캡슐화하는 이유
    private int minute;
    private int second;

    public void setHour(int hour) {
        if(isNotValidHour(hour)) return; //true가 되면 return하여 빠져나간다.
        this.hour = hour;
    }
    // 클래스 안에 있는 setHour메서드에서만 사용하므로 private 제어자 설정
    // 되도록 public 제어자로 외부에서 모두 사용 가능한 메서드로 만들지마라. = 캡슐화
    private boolean isNotValidHour(int hour) {
        return hour < 0 || hour > 23;
    }

    public int getHour() {
        return this.hour;
    }
}

public class Ex7_5_캡슐화 {
    public static void main(String[] args) {
        Time t = new Time();
        t.hourTest = 100;
        System.out.println(t.hourTest);
//        t.hour = 100; //private이라 외부 접근으로 변경 불가
        t.setHour(21);
        System.out.println(t.getHour());
        t.setHour(100);
        System.out.println(t.getHour()); //100은 유효한 값이 아니기 때문에 여전히 21

    }
}
