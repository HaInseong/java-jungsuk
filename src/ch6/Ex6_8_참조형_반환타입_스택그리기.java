package ch6;

class Data3 {int x;}
//익숙하지 않아서 어렵게 느껴지는데, 스택 그림을 완벽하게 그릴 줄 알면 코드의 흐름을 깨우치게 된다.
//참조형 반환 타입을 늘 어렵게 생각해왔는데, 단순하게 객체 주소를 주고 받는 것이란 것을 이해하면 된다.
public class Ex6_8_참조형_반환타입_스택그리기 {
    public static void main(String[] args) {
        Data3 d = new Data3();
        d.x = 10;

        //같은 클래스 내에서는 참조변수를 생략하고 호출 가능하다. ex. 아래의 copy(d); 처럼
        //static method는 객체 생성없이 호출 가능하다.
        Data3 d2 = copy(d); //객체를 생성하여 반환하는 메서드를 '팩토리 메서드'라 한다
        System.out.println("d.x = " + d.x);
        System.out.println("d 참조 변수의 주소값 = " + d);
        System.out.println("d2.x = " + d2.x);
        System.out.println("d2 참조 변수의 주소값 = " + d2);
        System.out.println();

    }

    public static Data3 copy(Data3 d) {
        Data3 tmp = new Data3(); //새로운 객체 tmp를 생성한다
        tmp.x = d.x; //d.x의 값을 tmp.x에 복사한다
        return tmp; //복사한 객체의 주소를 반환한다
    }
}
