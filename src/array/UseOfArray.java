package array;

import java.util.Random;
import java.util.Scanner;

public class UseOfArray {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        int [] abc = new int [10];
        //Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Please enter numbers: ");
        for(int i=0;i<abc.length;i++){
            abc[i]=random.nextInt(100);
        }

        for(int j=0;j<abc.length;j++){
            System.out.println("Array index value is " +abc[j]);
        }

    }
}
