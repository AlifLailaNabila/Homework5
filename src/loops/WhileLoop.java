package loops;

public class WhileLoop {
    public static void main(String[] args) {
        int num=1;
        while(num<10) {
            System.out.println(num);
            num++;
            //int num2=2;
            while(num<5) {
                System.out.println("Test Plan " + num);
               num++;

            }
        }
    }
}
