package ch10;

import java.util.Calendar;
import java.util.Date;

/**
 * clear()는 Calendar 객체의 모든 필드를 초기화
 */

public class Ex10_2_2_CalendarClear {
    public static void main(String[] args) {
        Calendar dt = Calendar.getInstance();
        System.out.println(new Date(dt.getTimeInMillis()));

        dt.clear(); // 모든 필드를 초기화
        System.out.println(new Date(dt.getTimeInMillis()));
    }
}
