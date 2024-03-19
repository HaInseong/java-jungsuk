package ch6;

class Data1 { int x;}
public class Ex6_6_기본형_매개변수_스택그리기 {

    //호출 스택에 대한 학습 심화
    //기본형 매개변수는 변수의 값을 읽기만 할 수 있다.
    //참조형 매개변수는 변수의 값을 읽고 변경할 수 있다.
    //메서드에서 기본형 매개변수를 전달 받았을 때 일어나는 스택의 변화에 대해서 직접 그릴 수 있어야 한다.
    //기본형 매개변수가 아닌 참조형 매개변수를 전달 받았을 때 스택의 변화에 대해서 이해해야 한다.
    public static void main(String[] args) {
        Data1 d = new Data1();
        d.x = 101;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(int x) {
        x = 1000; //기본형 매개변수이므로 참조 변수 내의 지역변수의 x의 값만 변경된다.
        System.out.println("매개변수로 x 값을 받음");
        System.out.println("change() : x = " + x);
    }
}
