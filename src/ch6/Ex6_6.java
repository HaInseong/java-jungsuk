package ch6;

class Data1 { int x;}
public class Ex6_6 {
    public static void main(String[] args) {
        Data1 d = new Data1();
        d.x = 10;
        System.out.println("main() : x = " + d.x);

        change(d.x);
        System.out.println("After change(d.x)");
        System.out.println("main() : x = " + d.x);
    }

    static void change(int x) {
        x = 1000;
        System.out.println("매개변수로 x 값을 받음");
        System.out.println("change() : x = " + x);
    }
}
