package ch9;

public class Ex9_1_StringBuffer예제 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("01");
        StringBuffer sb2 = sb.append(23); // StringBuffer가 Char[]이기 때문에 다 문자열로 저장된다.
        sb.append('4').append(56); // 메서드 체이닝: 메서드를 계속 연결해서 호출하는 방법 = append메서드가 StringBuffer를 반환하기 때문에 가능하다.
        System.out.println(sb2); // sb2도 sb의 주소값을 참조하고 있으므로 sb의 변경이 반영된다.
        System.out.println(sb);

        StringBuffer sb3 = sb.append(78);
        sb3.append(9.0);
        System.out.println(sb3);

        System.out.println("sb = " + sb.deleteCharAt(10)); // 10번 인덱스인 . 삭제
        System.out.println("sb = " + sb.delete(3,6)); // 3번 인덱스부터 5번 인덱스까지 삭제
        System.out.println("sb = " + sb.insert(3, "ABC"));
        System.out.println("sb = " + sb.replace(6, sb.length(), "END"));

        System.out.println("capacity= " + sb.capacity());
        System.out.println("length = " + sb.length());
    }
}
