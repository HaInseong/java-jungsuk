package ch10;

import java.util.Calendar;

/**
 * add()는 특정 필드의 값을 증가 또는 감소(다른 필드에 영향 O)
 * 필드 읽기 - get()
 * 필드 변경 - set()
 * 필드 초기화 - clear()
 * roll()은 특정필드의 값을 증가 또는 감소(다른 필드에 영향 X)
 */

public class Ex10_3_1_CalendarEx {
    public static void main(String[] args) {
        Calendar date = Calendar.getInstance();
        date.clear();
        date.set(2020, 7, 31);
        System.out.println("1."+date.getTime()); // 1

        date.add(Calendar.DATE, 1); // 날짜(DATE)에 1을 더한다.
        System.out.println("2."+date.getTime()); // 2
        date.add(Calendar.MONTH, -8); // 월(MONTH)에서 8을 뺀다.
        System.out.println("3."+date.getTime()); // 3

        date.set(2020, 7, 31);
        System.out.println("4."+date.getTime()); // 4
        date.roll(Calendar.DATE, 1);
        System.out.println("5."+date.getTime()); // 5
        date.roll(Calendar.MONTH, -7);
        System.out.println("6."+date.getTime()); // 6
    }
}
