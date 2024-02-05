package ch7;

import javax.sound.sampled.Line;

public class Ex7_7 {
    public static void main(String[] args) {
        Car car = null;
        FireEngine fe = new FireEngine();
        FireEngine fe2 = null;

        fe.water();
        car = fe;
//        car.water(); //error 발생
// water 기능을 가진 객체를 참조하게 되었지만,
// car 리모컨에는 water 기능 사용 버튼은 정의해두지 않아서 사용 불가.

        fe2 = (FireEngine) car;
        fe2.water(); //car 참조변수가 원래 가르키던 객체가 FireEngine이었다.


        //리모컨은 FireEngine이고 실제 가르키는 객체는 Car() 객체라서
        //사용 가능한 기능보다 리모컨의 갯수가 많다. 그러므로 오류가 발생한다.
        //실제 있는 기능보다 리모컨 버튼 수가 더 많을 순 없음 ex) 서비스센터 전화 불남
        Car c = new Car(); //멤버 갯수 4개
        FireEngine fe3 = (FireEngine) c; //멤버 갯수 5개 <- 멤버 갯수 4개
//        fe3.drive();
        fe3.water();




    }
}

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
