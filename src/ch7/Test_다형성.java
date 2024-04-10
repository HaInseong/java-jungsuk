package ch7;

class A1 {
    int i;
    public A1(int i) {
        this.i = i;
    }
    int get() {
        return i;
    }
}

class B1 extends A1 {
    int i;
    public B1(int i) {
        super(2*i);
        this.i = i;
    }
    int get() {
        return i;
    }
}

public class Test_다형성 {
    public static void main(String[] args) {
        A1 ab = new B1(7);
        System.out.println(ab.i + ab.get());
        B1 ba = (B1)ab; // 다형성 구현
        System.out.println(ba.i + ba.get());
        System.out.println(ab.get()+","+ba.get());
    }
}
