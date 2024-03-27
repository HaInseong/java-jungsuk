package ch7;

/*다형성이란?
 * 조상 타입 참조 변수로 자손 타입 객체를 다루는 것
 * ★ 그러나 자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 없다.*/

/*참조변수의 형변환
 * = 사용할 수 있는 멤버의 갯수를 조절 가능
 * ★ 상속의 조상 자손관계에서만 가능하다.
 * 형변환 가능 여부는 생성한 실제 객체를 기준으로 판단한다.
 * 예를들어, 생성한 객체의 멤버변수가 6개인데, 5개의 리모컨으로 접근하려고 하면
 * ClassCastException 형변환 Error가 발생한다는 게 핵심이다.*/

/*참조 변수 형변환 가능 여부 확인하고 싶을 때
 * = instance of 연산자 사용
 * 반드시 먼저 instance of 연산자로 확인하고 형변환 해야 한다.
 * 즉, instance of 연산자는 형변환을 해도 되는지 확인할 때 사용한다. */

/*참조변수의 형변환을 하는 이유는?
* = 사용할 멤버의 갯수를 원하는 갯수로만 세팅하기 위해서
* = 인스턴스의 원래 기능을 모두 사용하기 위해서
* 조상인 Car타입으로 매개변수로 설정하여 자손들을 모두 받을 수 있게 열어두고,
* instance of 연산자로 들어온 매개 변수의 타입을 확인하고 타입에 맞게 형변환 시킨다.
* 그럼 모든 자손을 매개변수로 받을 수 있는 동시에 전달 받은 매개변수의 원래 기능을 사용할 수 있다.
* 이게 바로 다형성이다.*/

/*다형성의 장점
* 1. 다형적 매개변수
* 2. 하나의 배열로 여러 종류 객체 다루기*/


class Car {
    String color;
    int door = 1;

    void drive() {
        System.out.println("붕붕~");
    }
    void stop() {
        System.out.println("멈춰!!");
    }
}

class FireEngine extends Car {
    void water() {
        System.out.println("불을 끄자!!");
    }
}

class Ambulance extends Car {
    void siren() {
        System.out.println("불을 끄자!!");
    }
}

public class Ex7_7_참조변수_형변환 {
    public static void main(String[] args) {

        Car car = null; //car의 멤버변수 4개

        FireEngine fe = new FireEngine(); //FireEngine의 멤버변수 5개
        FireEngine fe2 = null;

        fe.water();
        car = fe; //대입하여 같은 객체를 가르키는 참조변수로 만든다.
        car.color = "white";
        car.drive();
//        car.water(); //Error = Car타입 리모컨에는 water 기능이 없다.
        fe2 = (FireEngine) car;
        fe2.water(); //car 참조변수가 가르키던 객체는 원래부터 FireEngine이었다.
//        Ambulance a = (Ambulance)f; //★상속관계가 아닌 클래스 간의 형변환 불가


        //리모컨은 FireEngine이고 실제 가르키는 객체는 Car() 객체라서
        //사용 가능한 기능보다 리모컨의 갯수가 많다. 그러므로 오류가 발생한다.
        //실제 있는 기능보다 리모컨 버튼 수가 더 많을 순 없음 ex) 서비스센터 전화 불남
        Car c = new Car(); //멤버 갯수 4개

        //멤버 갯수 5개 <- 멤버 갯수 4개
        FireEngine fe3 = (FireEngine) c; //★ 자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 없다.
    }
}


/*부모가 될 수 없는 클래스란?
* = 파이널 클래스 = 상속 불가*/

/*그럼 파이널 메서드란?
* = 오버라이딩이 안되는 클래스*/

/*abstract class란?
* = 미완성 설계도
* 설계도가 미완성이라면?
* = 객체 생성 불가*/
