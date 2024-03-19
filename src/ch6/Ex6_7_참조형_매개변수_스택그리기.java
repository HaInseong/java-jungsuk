package ch6;

class Data2 { int x;}

//기본형 매개변수 = Read Only
//참조형 매개변수 = Read & Write
public class Ex6_7_참조형_매개변수_스택그리기 {
    public static void main(String[] args) {
        Data2 d = new Data2();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d);
        System.out.println("After change(d)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(Data2 d) {
        d.x = 1000;
        System.out.println("change() : x = " + d.x);
    }
}
