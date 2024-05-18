package practice.객체간협력;

public class Subway {
    int subwayNumber;
    int fare;
    int passengerCount;

    public Subway(int subwayNumber) {
        this.subwayNumber = subwayNumber;
    }

    public void take(int fare) {
        this.fare += fare;
        passengerCount++;
    }

    public void showInfo() {
        System.out.println(this.subwayNumber + "번 지하철의 현재까지 총 수입은 " + this.fare + "명 입니다." + " 오늘 이용 승객수는 " + this.passengerCount + "입니다.");
    }

    @Override
    public String toString() {
        return "Subway{" +
                "subwayNumber=" + subwayNumber +
                ", fare=" + fare +
                ", passengerCount=" + passengerCount +
                '}';
    }
}
