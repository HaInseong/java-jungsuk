package ch10;

/**
 * 날짜와 시간
 * = 문자열 만큼이나 중요한 타입
 * - java.util.Date
 * 날짜와 시간을 다룰 목적으로 만들어진 클래스(jdk1.0, 1995말쯤)
 * 아주 장수 클래스
 * 자바 초창기 때 만들어진 클래스라 급하게 만들어진 부분도 있고, 미흡한 부분이 있다.
 * 그래서 Date의 대부분의 메서드는 거의 deprecated되었다.
 * 그래도 jdk1.0부터 사용하던 거라 워낙 뿌리가 깊어 여전히 쓰이고 있다.
 *
 * - java.util.Calendar(Date 클래스 개선 버전)
 * Date클래스를 개선한 새로운 클래스(jdk1.1, 1997년). 여전히 단점이 존재
 * 실무에서 여전히 많이 사용 (가장 오래 사용됨)
 *
 * - java.time패키지(jdk1.8, 2014년) - 자바의정석 3판에만 설명되어 있다.
 * Date와 Calendar의 단점을 개선한 새로운 클래스들을 제공(jdk1.8 = java8)
 * Date와 Calendar의 단점은 항상 날짜와 시간을 같이 다룬다는 점인데,
 * 개선한 time 패키지에서는 날짜와 시간을 LocalDate클래스, LocalTime클래스로 나뉘어져있다.
 */

import java.util.Calendar;

/**
 * Calendar클래스
 * 추상 클래스이므로 getInstance()를 통해 구현된 객체를 얻어야 한다.
 */

public class Ex10_1_날짜와시간_Calendar {
    public static void main(String[] args) {
//        Calendar cal = new Calendar(); 에러!! -> 추상클래스는 인스턴스를 생성할 수 없다.
        Calendar cal = Calendar.getInstance(); // OK,
        // getInstance()메서드는 Calendar클래스를 구현한 클래스의 인스턴스를 반환한다.
        // Ex) new GregorianCalender(); => 시스템상의 날짜와 시간력으로 셋팅된다.

        int thisYear = cal.get(Calendar.YEAR); // 올해가 몀년인지 알아낸다.
        int lastDayOfMonth = cal.getActualMaximum(Calendar.DATE); // 이 달의 마지막날
        // Calendar.Month = 월(0부터 시작)
        // Calendar.DAY_OF_WEEK = 요일(1:일요일)

        System.out.println("==========================");
        System.out.println("ch10_Ex10_1 예제 코드");
        System.out.println();
        Calendar today = Calendar.getInstance(); // Calendar 객체를 생성
        // 기본적으로 현재 날짜와 시간으로 설정된다.
        System.out.println("이 해의 년도 : " + today.get(Calendar.YEAR));
        System.out.println("월(0~11, 0:1월): " + today.get(Calendar.MONTH)); // 월은 0부터 시작하므로 +1해서 생각해야 함.
        System.out.println("이 해의 몇 째 주: " + today.get(Calendar.WEEK_OF_YEAR));
        System.out.println("이 달의 몇 째 주: " + today.get(Calendar.WEEK_OF_MONTH));
        // DATE와 DAY_OF_MONTH는 같다.
        System.out.println("이 달의 몇 일: " + today.get(Calendar.DATE));
        System.out.println("이 달의 몇 일: " + today.get(Calendar.DAY_OF_MONTH));
        System.out.println("이 해의 몇 일: " + today.get(Calendar.DAY_OF_YEAR));
        System.out.println("요일(1~7, 1:일요일): " + today.get(Calendar.DAY_OF_WEEK)); // 1:일요일, 2:월요일, ... 7:토요일
        System.out.println("이 달의 몇 째 요일: " + today.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println("오전_오후(0:오전, 1:오후): " + today.get(Calendar.AM_PM));
        System.out.println("시간(0~11): " + today.get(Calendar.HOUR));
        System.out.println("시간(0~23): " + today.get(Calendar.HOUR_OF_DAY));
        System.out.println("분(0~59): " + today.get(Calendar.MINUTE));
        System.out.println("초(0~59): " + today.get(Calendar.SECOND));
        System.out.println("1000분의 1초(0~999): " + today.get(Calendar.MILLISECOND)); // 천분의 1초를 시간으로 표시하기 위해 3600000으로 나누었다.(1시간 = 60 * 60초)
        System.out.println("TimeZone(-12~+12): " + (today.get(Calendar.ZONE_OFFSET)/(60*60*1000)));
        System.out.println("이 달의 마지막 날: " + today.getActualMaximum(Calendar.DATE) ); // 이 달의 마지막 일을 찾는다. = 자주 쓴다.
    }
}
