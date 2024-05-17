package practice.객체간협력;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("하인성", 10000);
        Bus b100 = new Bus(100);
        Subway sg = new Subway(2);
        s1.showInfo();
        s1.takeBus(b100);
        s1.takeSubway(sg);
        s1.showInfo();
        b100.showInfo();
        sg.showInfo();
    }
}
