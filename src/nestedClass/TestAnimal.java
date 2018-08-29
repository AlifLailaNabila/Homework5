package nestedClass;

public class TestAnimal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.outerAnimal1();
        animal.outerAnimal2();
        animal.tiger.innerTiger1();
        Animal.Lion.innerLion1();
    }
}
