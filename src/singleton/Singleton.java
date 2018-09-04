package singleton;

public class Singleton {
    public static Singleton sg = new Singleton();

    private Singleton(){
    }

    public static Singleton getInstance(){
        return sg;
    }

    public int addition(int a, int b){
        int total=a+b;
        System.out.println(total);
        return total;

    }
}
