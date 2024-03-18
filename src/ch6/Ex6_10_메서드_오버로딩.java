package ch6;
//1. 메서드 이름이 같아야 한다.
//2. 매개변수의 개수 또는 타입이 달라야 한다.
//3. 반환 타입은 영향없다.
public class Ex6_10_메서드_오버로딩 {

    public static void main(String[] args) {

        MyMath_오버로딩 mm = new MyMath_오버로딩();
        System.out.println(mm.add(10, 20));
        System.out.println(mm.add(3L, 5L));
    }

}

class MyMath_오버로딩 {

    //오버로딩의 올바른 예 - 매개변수는 다르지만 같은 의미의기능 수행
    int add(int a, int b) {
        System.out.print("int add(int a, int b) - ");
        return a+b;
    }

    long add(long a, long b) {
        System.out.print("long add(long a, long b) - ");
        return a+b;
    }

    int add(int[] a) { //배열의 모든 요소의 합을 결과로 돌려준다.
        System.out.print("int add(int[] a) - ");
        int result = 0;
        for(int i=0; i<a.length; i++){
            result += a[i];
        }
        return result;
    }
}
