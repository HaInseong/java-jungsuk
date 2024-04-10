package ch8;

class A {
    int i;
    public A(int i) {
        this.i = i;
    }
    int get() {
        return i;
    }
}

class B extends A {
    int i;
    public B(int i) {
        super(2*i);
        this.i = i;
    }
    int get() {
        return i;
    }
}

public class Test {
    public static void main(String[] args) {
        A ab = new B(7);
        System.out.println(ab.i + ab.get());
        B ba = (B)ab; // 다형성 구현
        System.out.println(ba.i + ba.get());
        System.out.println(ab.get()+","+ba.get());
    }
}
