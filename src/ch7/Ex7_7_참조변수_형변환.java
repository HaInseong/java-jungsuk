package ch7;

/*다형성이란?
 * 조상 타입 참조 변수로 자손 타입 객체를 다루는 것
 * ★ 그러나 자손 타입의 참조변수로 조상 타입의 객체를 가리킬 수 없다.*/

/*참조변수의 형변환 이유
 * = 사용할 수 있는 멤버의 갯수를 조절 가능
 * ★ 상속의 조상 자손관계에서만 가능하다.*/

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
* = 파이널 클래스*/

/*그럼 파이널 메서드란?
* = 오버라이딩이 안되는 클래스*/

/*abstract class란?
* = 미완성 설계도
* 설계도가 미완성이라면?
* = 객체 생성 불가*/

/*접근제어자
* public, 제한없음
* protected 같은 패키지 or 다른 패키지 자손까지
* (default), 같은 패키지
* private, 같은 클래스
*접근제어자를 사용하는 이유는?
* 외부로부터 데이터를 보호하기 위해서
* 멤버 변수에 직접 접근은 막고 메서드를 통해 간접적으로 데이터 변경해야 한다.*/

