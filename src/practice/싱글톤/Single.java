package practice.싱글톤;

public class Single {
    private static Single instance = new Single();
    private Single() {}

    public static Single getInstance() {
        if(instance == null) {
            instance = new Single();
        }
        return instance;
    }
}
