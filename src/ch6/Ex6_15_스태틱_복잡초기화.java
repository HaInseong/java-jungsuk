package ch6;



public class Ex6_15_스태틱_복잡초기화 {

    static int[] arr = new int[10]; //대입 연산자로 할 수 있는 최대 범위는 배열의 생성까지

    //배열에 난수를 채우는 작업 같은 건 명시적(대입) 초기화로 할 수 없다.
    //난수로 채우는 작업은 static block에서 CV 복잡 초기화 해줘야 한다.
    static {
        for(int i=0; i<arr.length; i++) {
            arr[i] = (int)(Math.random()*10)+1;
        }
    }

}