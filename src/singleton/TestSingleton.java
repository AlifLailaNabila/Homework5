package singleton;

public class TestSingleton {
    public static void main(String[] args) {
        Singleton sg1= Singleton.getInstance();
        sg1.addition(3,8);
    }
}
