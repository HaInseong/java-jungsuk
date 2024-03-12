package ch6;

public class Ex6_3 {
    public static void main(String[] args) {
        //★프로그램이 실행되면 메모리에 클래스(설계도)가 가장 먼저 올라간다. 이유는? 설계도가 올라가 있어야 객체 생성이 가능하니까.
        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);

        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 " + Card.width * Card.height + "입니다.");
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 " + Card.width * Card.height + "입니다.");

        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
//        c1.width = 50;
//        c2.height = 80;
        //모든 값이 공유하는 변수의 값을 변경한다는 것을 알 수 있도록 Card 클래스를 직접 불러들임
        Card.width = 50;
        Card.height = 80;

        System.out.println("Card.width = " + Card.width);
        System.out.println("Card.height = " + Card.height);
        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 " + Card.width * Card.height + "입니다.");
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 " + Card.width * Card.height + "입니다.");
    }
}
