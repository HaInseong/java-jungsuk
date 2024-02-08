package practice.ch6;

class Marine {
    int x, y = 0;
    int hp = 60;
    static int weapon = 6;
    static int armor = 0;
 //static 변수와 관련된 작업을 할 때는 메서드에 static을 붙여줘야한다.
    void weaponUp() {
        weapon++;
    }

    void armorUp() {
        armor++;
    }

    void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

public class Ex6_9 {
    public static void main(String[] args) {

        Marine m1 = new Marine();
        Marine m2 = new Marine();
        m1.weaponUp();
        System.out.println(m1.weapon);
        m2.weaponUp();
        System.out.println(m2.weapon);
        System.out.println(m1.weapon);
    }
}
