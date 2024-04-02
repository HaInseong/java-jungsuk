package ch7;

/*추상메서드로 작성하는 이유는?
 * 자손마다 각각 다른 구체적인 필터링이 추가된 메서드가 작성될 것이기 때문에.
 * 그래서 조상 메서드에 구체적인 필터링을 추가할 필요가 없어.
 * 어차피 각각의 자손 클래스에 맞게 변경되거든.*/


/*  abstract void play(int pos);
    void play() {
        play(currentPos);
    }
 * 인스턴스 메서드인데 안에서 추상메서드를 호출하고 있는 경우는?
 * ★메서드는 선언부만 알면 호출 가능하므로 추상메서드도 호출 가능해.
 * 왜냐하면, 지금은 추상메서드에 몸통이 없지만, 나중에 자손이 설계도를 완성시킬 것이기 때문이지.
 * 그리고 어차피 인스턴스 메서드는 객체 생성 후에만 호출할 수 있기 때문에,
 * 인스턴스 메서드 안에서 추상메서드를 호출하게 미리 작성해둬도 되는거야.
 * 즉, 객체 생성 이전이기 때문에 호출 될 수가 없다.
 * 인스턴스 메서드가 호출 될 때 쯤이면 이미 추상메서드도 완성이 되어 있다.
 * 상속을 통해서 자손이 완성이 되고, 자손 객체가 생성된 이후에 호출 가능하다.*/

abstract class Player { //★ 미완성 설계도이므로 객체로 생성할 수 없다.
    boolean pause;
    int currentPos;

    Player() {
        pause = false;
        currentPos = 0;
    }
    abstract void play(int pos); //abstract로 만들면 자손에서 재구현을 강제하는 효과가 있다.
    abstract void stop();
    void play() {
        play(currentPos);
    }
}

/*추상 클래스는 상속을 통해 완성해야 객체 생성 가능하다.
* 즉, 다른 클래스를 작성하는데 도움을 주는 용도로 사용된다.*/
class AudioPlayer extends Player {
    //AudioPlayer에 맞는 구체적인 필터링을 자손의 메서드 안에 구현한다.
    void play(int pos) {
        this.currentPos = pos;
    }
    void stop() {
        System.out.println("재생을 중단합니다.");
    }
}


public class Ex7_10_추상클래스 {
    public static void main(String[] args) {
        AudioPlayer ap = new AudioPlayer(); //AudioPlayer는 완성된 설계도여서 객체 생성 가능하다.
        ap.play(10);
        System.out.println(ap.currentPos + " 위치부터 플레이 합니다");
        ap.stop();

        Player p = new AudioPlayer(); //★ 만능 리모컨 일뿐이지, 실제 생성된 객체는 AudioPlayer라는게 다형성의 핵심이야.
        p.play(20); //리모컨이 Player이라도, 실제 구현된 AudioPlayer의 메서드가 호출된다.
        System.out.println(p.currentPos + " 위치부터 플레이 합니다.");
        System.out.println(ap.currentPos + " 위치부터 플레이 합니다");
        p.stop();







        System.out.println();
        System.out.println("==========================Starcraft game example==========================");

//        Unit[] groups = {new Marine(), new Tank(), new DropShip()};
        Unit[] units = new Unit[3]; //객체배열: 참조변수 묶음
        units[0] = new Marine();
        units[1] = new Tank();
        units[2] = new DropShip();
        for (int i=0; i<units.length; i++) {
            if (units[i] != null) {
                units[i].move(i+1, i+10);
//                groups[i].move(10, 20);
            }
            else {
                return;
            }
//            units[i].move(10, i);
//            return; 리턴문을 적으면 반복문의 첫번째만 실행하고 바로 끝난다.
        }

    }
}

abstract class Unit {
    int x, y;
    abstract void move(int x, int y);
    void stop() {

    }
}

class Marine extends Unit {
    void move(int x, int y) {
        System.out.println("마린[x=" + x + ", y=" + y + "]");
    }
    void stimPack() {}
}

class Tank extends Unit {
    void move(int x, int y) {
        System.out.println("탱크[x=" + x + ", y=" + y + "]");
    }
}

class DropShip extends Unit {
    void move(int x, int y) {
        this.x = x+10;
        this.y = y+10;
        System.out.println("드랍쉽[x=" + this.x + ", y=" + this.y + "]");
    }
}