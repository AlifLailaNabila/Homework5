package loops;

import java.util.Random;

public class ForLoop {
    public static void main(String[] args) {
        Random rd = new Random();
        for(int i =10; i>0; i=i-2){
            i = 1+rd.nextInt(20);
            System.out.println(i);
        }
        for(int i =0; i<10; i++){
            System.out.println(i);
        }

    }
}
