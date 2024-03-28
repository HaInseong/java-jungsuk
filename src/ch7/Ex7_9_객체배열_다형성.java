package ch7;

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

class Buyer2 {
    int money = 1000;
    int bonusPoint = 0;
    Product2[] cart = new Product2[10];
    int i = 0;

    void buy(Product2 p) {
        if(money < p.price) {
            System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
            return;
        }
        //잔액이 충분하다면
        money -= p.price;
        bonusPoint = p.bonusPoint;
        cart[i++] = p;
        System.out.println(p+"을/를 구매하셨습니다.");
        System.out.println("★남은 잔액은 " + money + "입니다.★");
    }

    void summary() {
        int sum = 0;
        String itemList = "";

        for(int i=0; i<cart.length; i++) {
            if(cart[i]==null) break;
            sum += cart[i].price;
            if(i<cart.length-1 && cart[i+1] != null) { //★ 마지막 인덱스보다 i가 작지 않다면, 그건 i가 최소 마지막 인덱스에 도달했다는 의미야.
                itemList += cart[i] + ", "; //주소값이 담기는건가?
                //맞어. println 메서드는 참조변수가 매개변수로 오면 자동으로 toString을 호출해주잖아?
                //그런데 각각의 상품 클래스들은 toString메서드가 오버라이딩 되어 있어.
                //그럼 상품명을 출력하게 될 거야.
            } else {
                itemList += cart[i];
            }

        }
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


        /* 객체 배열 다형성 그림 그리기
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
