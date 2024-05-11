package ch10;

import java.util.Calendar;
import java.util.Date;

/**
 * Date와 Calendar간의 변환
 * Date의 메서드는 대부분 deprecated되었지만 여전히 사용
 * 자바는 deprecated되었더라도 다음 버전을 발표하기 전에 하위호환성을 굉장히 고려해서 출시한다.
 * 그러므로 업데이트가 느리지만 안전성을 보장한다.
 */
public class Ex10_3_3_Date_Calendar_변환 {
    public static void main(String[] args) {
        // 1. Calendar를 Date로 변환
        Calendar cal = Calendar.getInstance();
        Date d = new Date(cal.getTimeInMillis());

        // 2. Date를 Calendar로 변환
        Date d1 = new Date();
        Calendar cal1 = Calendar.getInstance();
        cal.setTime(d1);
    }
}
