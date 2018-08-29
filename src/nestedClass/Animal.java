package nestedClass;

public class Animal {
    public int numOfAnimal;

    public Animal(){
    }
    Tiger tiger = new Tiger();
    //Lion lion = new Lion();

    public void outerAnimal1(){
        System.out.println("Outer class method 1");
        tiger.innerTiger1();
        tiger.innerTiger2();
    }
    public void outerAnimal2(){
        System.out.println("Outer class method 2");
        Lion.innerLion1();
    }

    public class Tiger{
        public int numOfTiger;

        public Tiger(){
        }

        public void innerTiger1(){
            System.out.println("Inner Tiger method 1");
        }

        private void innerTiger2(){
            System.out.println("Inner Tiger method 2");
        }
    }//Inner Tiger Ends

    public static class Lion{
        public int numOfLion;

        public Lion(){
        }

        public static void innerLion1(){
            System.out.println("Inner Lion method 1");
        }

        private void innerLion2(){
            System.out.println("Inner Lion method 2");
        }
    }//Inner Lion Ends



}//Outer Ends
