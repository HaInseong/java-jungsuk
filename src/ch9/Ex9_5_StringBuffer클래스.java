package ch9;

/**
 * StrignBuffer클래스
 * 문자열을 저장하고 다루기 위한 클래스
 * String처럼 문자형 배열(char[])을 내부적으로 가지고 있다.
 * 그래서 여러 개의 문자들을 저장할 수 있다.
 * 그러나, String과 달리 내용을 변경할 수 있다.(mutable)
 * 배열은 길이 변경불가. 공간이 부족하면 새로운 배열 생성해야한다.
 * 배열에 새로운 값을 추가하고 싶을 때, 공간이 부족할 때는?
 * 1. 새로운 배열을 만든다.
 * 2. 배열을 복사 붙여넣기 한다.
 * 3. 새로운 배열을 가르키도록 참조 변경을 해준다.
 * 이러한 과정을 많이 갖게 되면 속도가 늦어지므로 StringBuffer를 사용.
 * StringBuffer는 저장할 문자열 길이를 고려해서 적절한 크기로 생성해야한다.
 * 버퍼의 크기를 지정하지 않으면 기본적으로 버퍼의 크기는 16이 된다.
 * String은 equals()가 오버라이딩(내용비교) 되어 있지만, StringBuffer는 equals()가 오버라이딩 되어있지 않다.(주소비교 하는중)
 * 그래서 StringBuffer를 String으로 변환 후에 equals()로 비교해야 한다.
 */

public class Ex9_5_StringBuffer클래스 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("abc");
        System.out.println(sb);
        sb.append("123"); // append는 문자열을 배열에 추가 후 자기 자신의 주소를 반환한다.
        System.out.println(sb);
        sb.append(" StringBuffer의 참조를 반환").append(" 456");
        System.out.println(sb.toString());

        StringBuffer sb1 = new StringBuffer("abc");
        System.out.println("StringBuffer의 크기는? " + sb1.capacity());
        System.out.println("sb1에 저장된 문자열의 길이는? " + sb1.length());

        StringBuffer sb2 = new StringBuffer("abc");
        System.out.println(sb1==sb2); // 주소비교 중이므로 false
        System.out.println(sb1.equals(sb2)); // 내용이 같더라도 주소 비교 중이므로 false
        // StringBuffer를 내용비교 하려면 어떻게 해야하는지?
        // String으로 변환한 후 내용비교 하면 된다.
        System.out.println(sb1);
        System.out.println(sb1.toString());

        String s1 = sb1.toString();
        System.out.println(s1);
        String s2 = sb2.toString();

        System.out.println(s1.equals(s2)); // 내용비교로 오버라이딩 되어있는 String equalss로내용비교 하므로 true
    }
}
