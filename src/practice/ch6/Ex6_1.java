package practice.ch6;

public class Ex6_1 {
    public static void main(String[] args) {
        SutdaCard s = new SutdaCard();
        s.random();
        s.checkKwang();
    }
}

class SutdaCard {
    int num; //카드의 숫자(1~10 사이의 정수)
    boolean isKwang; //광이면 true, 아니면 false

    public int random() {
        //random함수: range: 0.0 ~ 1.0
        this.num = (int) (Math.random()*10)+1;
        System.out.println("카드의 숫자(1~10 사이의 정수): " + num);
        return num;
    }

    public boolean checkKwang() {
        int checkNum = (int) (Math.random()*2);

        this.isKwang = (checkNum == 1);

        if(isKwang) {
            System.out.println("Kwang");
        }
        else {
            System.out.println("isn't Kwang");
        }
        return isKwang;
    }
}
