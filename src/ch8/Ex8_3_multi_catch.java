package ch8;

// ExceptionA, ExceptionB 예외 객체가 존재하지 않으므로 에러 남.
// 그래도 multi catch 학습하기 위해서 일부러 만든 예제

//public class Ex8_3_multi_catch {
//    public static void main(String[] args) {
//
//        try {
//            System.out.println();
//        } catch (ExceptionA | ExceptionB e) {
//            e.method(); // 에러. ExceptionA에 선언된 methodA()는 호출 불가
//            // ★ 멀티 catch 블럭의 경우 공통 멤버만 사용 가능하다.
//            if (e instanceof ExceptionA) {
//                ExceptionA e1 = (ExceptionA) e;
//                e1.methodA();
//            } else { // if (e instanceof ExceptionB) {...}
//            }
//            e.printStackTrace();
//        }
//    }
//}
