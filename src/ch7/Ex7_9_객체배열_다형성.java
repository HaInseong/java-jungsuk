package ch7;

/*★ 여러 종류의 객체를 배열로 다루기
 * 보통 하나의 배열에는 같은 타입만 저장하는데,
 * 다형성을 이용하면 하나의 배열에 여러 종류의 객체를 저장할 수 있다.*/

class Product2 {
    int price;
    int bonusPoint;

    Product2(int price) {
        this.price = price;
        bonusPoint = (int)(price/10.0);
    }

}

class Tv2 extends Product2 {
    Tv2() {
        super(100);
    }
    public String toString() {
        return "Tv";
    }
}

class Computer2 extends Product2 {
    Computer2() {
        super(200);
    }
    public String toString() {
        return "Computer";
    }
}

class Audio2 extends Product2 {
    Audio2() {
        super(50);
    }
    public String toString() {
        return "Audio";
    }
}

// 카트로 객체배열 만들기
class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;
    Product2[] cart = new Product2[10]; // 객체배열 담을 카트 생성
    int i = 0;

    void buy(Product2 p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        //잔액이 충분하다면
        money -= p.price;
        bonusPoint = p.bonusPoint;
        cart[i++] = p; // 들어온 객체를 배열에 담고 전역변수 i++ 처리하여 다음 인덱스로 넘기기
        System.out.println(p+"을/를 구매하셨습니다."); // toString 오버라이딩 되어 있어서 해당 객체 주소가 아닌 이름으로 출력
        System.out.println("★남은 잔액은 " + money + "입니다.★");
    }

    // 객체배열에 담긴 객체들 정보 보여주기
    void summary() {
        int sum = 0;
        String itemList = "";

        for(int i=0; i<cart.length; i++) {
            if(cart[i]==null) break;
            sum += cart[i].price;
            if(i<cart.length-1 && cart[i+1] != null) { // ★ 마지막 인덱스보다 i가 작지 않다면, i가 마지막 인덱스에 도달했다는 의미야.
                itemList += cart[i] + ", "; // 배열을 인덱스로 호출하면 주소값이 담기는건가?
                // 맞어. println 메서드는 참조변수가 매개변수로 오면 자동으로 toString을 호출해주잖아?
                // 그런데 각각의 상품 클래스들은 toString메서드가 오버라이딩 되어 있어.
                // 그래서 상품명을 출력하게 될 거야.
            } else {
                itemList += cart[i];
            }

        }
        System.out.println(cart[1]);
        System.out.println("==========================================");

        System.out.println("구입하신 물품의 총금액은 " + sum + "입니다.");
        System.out.println("구입하신 제품은 " + itemList + "입니다.");

    }
}


public class Ex7_9_객체배열_다형성 {
    public static void main(String[] args) {

        Buyer2 buyer = new Buyer2();

        buyer.buy(new Tv2());
        buyer.buy(new Computer2());
        buyer.buy(new Computer2());
        buyer.buy(new Computer2());
        buyer.buy(new Computer2());
        buyer.buy(new Computer2()); //남은 잔액: 100, 잔액 부족
        buyer.buy(new Tv2());
        buyer.summary();
        System.out.println("뭐가 출력될까? " + buyer.cart[0]);
        System.out.println("뭐가 출력될까? " + buyer.cart[5]);
        System.out.println("뭐가 출력될까? " + buyer.cart[6]); //null
//        System.out.println("뭐가 출력될까? " + buyer.cart[10]); //ArrayIndexOutOfBoundsException 발생


        /* ★ 객체 배열 다형성 그림 그릴 수 있어야 한다.
        Product p1 = new Tv1();
        Product p2 = new Computer();
        Product p3 = new Audio();

        //객체 배열 생성 = 위에 변수 3개를 묶어 놓은게 배열이다.
        Product cart[] = new Product[3];
        cart[0] = new Tv1();
        cart[1] = new Computer();
        cart[2] = new Audio();
         */

    }
}
