package ch9;

/**
 * StringBuffer클래스와 StringBuilder클래스의 차이는?
 * StringBuffer클래스와 내부적인 메서드 까지 모두 똑같다.
 * 단, 한가지 차이는 StringBuilder는 동기화가 안되어있다. = 멀티 쓰레드에서 쓰지 못한다.
 */

/**
 * 싱글 쓰레드와 멀티 쓰레드의 차이는?
 * 싱글 쓰레드: 한번에 1개의 작업
 * 멀티 쓰레드: 한번에 n개의 작업 가능
 * 요즘 프로그램들은 대부분 멀티 쓰레드이다.
 * Ex) 카카오톡 파일 다운로드 중 채팅 기능 동시 진행 가능
 * 멀티쓰레드는 한 프로세스의 데이터를 공유한다.
 * 공유하는 데이터를 다른 쓰레드에서 수정되었을 때 꼬이지 않게 수정해주는게 동기화(데이터 보호)이다.
 * 즉, 동기화를 하면 하나의 프로세스에서 여러 개의 쓰레드가 존재하는 멀티 쓰레드에서 안전하다.
 * StringBuilder는 동기화를 지원하지 않는다.
 * 멀티 쓰레드가 아닌 프로그램의 경우, 동기화는 불필요한 성능저하를 가져온다.
 * 무조건 StringBuffer를 쓸게 아니라 이럴 때 StringBuilder를 사용하면 성능이 향상된다.
 * 그런데 대부분 StringBuffer로 작성해도 문제가 되진 않는다.
 *
 */

/**
 * Math 클래스는 무엇일까?
 * 수학관련 static메서드의 집합
 * iv가 없으므로 객체를 만들 필요가 없다.
 * Math.rint()메서드 아래에서 코드 예제로 Math.round()와 비교.
 */

public class Ex9_7_StringBuilder {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        sb.append("abc");
        System.out.println(sb);
        sb.append("def");
        System.out.println(sb);
        // 지금까지 작성해온 프로그램은 전부 싱글 쓰레드로 작성된 것이고,
        // 멀티 쓰레드로 프로그램을 작성하는 방법은 13장 쓰레드에서 배우게 된다.
        StringBuilder sb2 = new StringBuilder();
        sb2.append("abc");
        System.out.println(sb2);
        sb2.append("def");
        System.out.println(sb2);
        System.out.println();


        // Math.round()와 Math.rint()의 차이는?
        double sum = 0;
        double sum1 = 0;
        double sum2 = 0;

        for(double d = 1.5; d<=10.5; d++) {
            double d1 = Math.round(d);
            double d2 = Math.rint(d); // 홀수라면 올림과 짝수라면 내림을 통해 결과값을 짝수로만 맞춰서 출력.

            System.out.printf("%4.1f %4.1f %4.1f%n", d, d1, d2);

            sum += d;
            sum1 += d1;
            sum2 += d2;
        }
        System.out.println("-------------");
        System.out.println();
        System.out.printf("%4.1f %4.1f %4.1f%n", sum, sum1, sum2);
    }
}
