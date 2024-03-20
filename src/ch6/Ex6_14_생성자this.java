package ch6;

//생성자에서 다른 생성자를 호출하는 경우
class Car {
    String color;
    String gearType;
    int door;

    //클래스 안에서 사용되는 this는 해당 클래스이다.
    //생성자 안에서 다른 생성자를 호출할 때는 항상 첫 줄에 위치해야 한다.
    Car() { //생성자에 매개변수로 받는 값이 없는 경우
        //생성자 메서드 안에서 디폴트 값을 직접 작성해서 초기화 된다.
        color = "white";
        gearType = "auto";
        door = 4;
        //이렇게 되면 아래의 다른 생성자와 코드 중복이 된다.
        //그러므로 다른 생성자를 호출해주는 방식으로 코드의 중복을 제거해주는 게 더 좋은 코드다.
        //코드의 중복을 제거하려면 어느 한 쪽이 다른 한 쪽을 호출하면 된다.
        //this("white", "auto", 4); //코드 중복 제거를 위한 다른 생성자 호출
    }

    Car(String color) {
        this(color, "auto", 4);
    }

    Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }
}

public class Ex6_14_생성자this {
    public static void main(String[] args) {
        Car c1 = new Car();
        System.out.println(c1.color);
        System.out.println(c1.gearType);
        System.out.println(c1.door);

        Car c2 = new Car("black");
        System.out.println(c2.color);
        System.out.println(c2.gearType);
        System.out.println(c2.door);
        System.out.println("다른 객체에 담겨 있는 변수 c1.color = " + c1.color);
    }
}
