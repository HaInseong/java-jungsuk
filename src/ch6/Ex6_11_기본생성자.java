package ch6;

//클래스 내에 생성자가 없으면 컴파일러가 기본 생성자를 자동으로 추가해준다.
class Cons1 {
    int value;
}

//다른 생성자가 선언되어 있으면 꼭 기본 생성자 작성해야 한다.
//다른 생성자가 있더라도 항상 기본 생성자를 작성하는 습관을 들여야 한다.
class Cons2 {
    int value;
    String str;

    Cons2() {}
    Cons2(int num, String str) {
        value = num;
        this.str = str;
    }
}
public class Ex6_11_기본생성자 {
    public static void main(String[] args) {
        Cons1 c1 = new Cons1();
        System.out.println(c1.value);

        Cons2 c2 = new Cons2(3, "생성자를 사용하는 이유는 지금처럼 객체를 생성할 때 초기화 까지 한번에 처리하려고 하는 것인데, 이렇게 하지 않으면 객체를 생성한 후 참조변수를 통해서 직접 초기화를 해줘야해서 코드가 길어진다.");
        System.out.println(c2.value);
        System.out.println(c2.str);

    }
}
