package practice.객체간협력;

public class Student {
    String name;
    int money;

    public Student(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public void takeBus(Bus busNumber) {
        busNumber.take(1000);
        this.money -= 1000;
    }

    public void takeSubway(Subway subwayNumber) {
        subwayNumber.take(1200);
        this.money -= 1200;
    }

    public void showInfo() {
        System.out.println(this.name + "의 현재 잔액은 " + this.money + "입니다.");
    }
}
