package ch7;

class Point3 {
    int x, y;

    Point3(int x, int y) {
        this.x = x;
        this.y = y;
    }
}

class Point3D extends Point3 {
    int z;
    Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }
}

public class Ex7_11 {
    public static void main(String[] args) {
        Point3D d = new Point3D(10, 20 , 30);

        System.out.println(d.x);
        System.out.println(d.y);
        System.out.println(d.z);
    }
}
