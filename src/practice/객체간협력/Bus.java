package practice.객체간협력;

public class Bus {
    int busNumber;
    int fare;
    int passengerCount;

    public Bus(int busNumber) {
        this.busNumber = busNumber;
    }

    public void take(int fare) {
        this.fare += fare;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println(this.busNumber + "번 버스의 현재까지 총 수입은 " + this.fare + "명 입니다." + " 오늘 이용 승객수는 " + this.passengerCount + "입니다.");
    }
}
