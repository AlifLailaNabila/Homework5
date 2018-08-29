package super_constructor;

public class TestBird {
    public static void main(String[] args) {
        Bird bird1 = new Bird();
        bird1.birdInfo();
        SubBird sb1 = new SubBird(20, 30, "Peacock");
        SubBird sb2 = new SubBird("Hen",2 );


    }
}
