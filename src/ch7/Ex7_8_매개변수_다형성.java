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

class Product{
    int price; //제품 가격
    int bonusPoint; //제품 구매 시 제공하는 보너스 점수

    Product(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }
}

class Tv1 extends Product{
    Tv1() {
        //조상클래스의 생성자 Product(int price)를 호출한다
        super(100); //Tv의 가격을 100만원으로 한다.
    }
    // Object클래스의 toString()을 오버라이딩한다.
    public String toString() {return "Tv";}
}

class Computer extends Product {
    Computer() {super(200);}
    public String toString() {return "Computer";}
}

class Buyer {
    int money = 1000;
    int bonusPoint = 0;

    void buy(Product p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        money -= p.price;           //가진 돈에서 구입한 제품의 가격을 뺀다.
        bonusPoint += p.bonusPoint; //제품의 보너스 점수를 추가한다.
        System.out.println(p + "을/를 구입하셨습니다.");
    }
}


public class Ex7_8_매개변수_다형성 {
    public static void main(String[] args) {
        Buyer b = new Buyer();

        Product p = new Tv1();
        b.buy(p);
        //위의 두 줄이 아래 한 줄과 같음.
        b.buy(new Tv1());

        b.buy(new Computer());

        System.out.println("현재 남은 돈은 " + b.money + "만원입니다.");
        System.out.println("현재 남은 보너스 점수는 " + b.bonusPoint + "입니다.");
    }
}
