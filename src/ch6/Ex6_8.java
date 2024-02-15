package ch6;

class Data3 {int x;}
public class Ex6_8 {
    public static void main(String[] args) {
        Data3 d = new Data3();
        d.x = 10;

        Data3 d2 = copy(d); //팩토리 메서드
        System.out.println("d.x = " + d.x);
        System.out.println("d 참조 변수의 주소값 = " + d);
        System.out.println("d2.x = " + d2.x);
        System.out.println("d2 참조 변수의 주소값 = " + d2);


    }

    public static Data3 copy(Data3 d) {
        Data3 tmp = new Data3();
        tmp.x = d.x;
        return tmp;
    }
}
