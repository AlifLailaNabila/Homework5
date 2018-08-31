package conditionalStatement;

import java.util.Scanner;

public class CompareValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Please enter three numbers: ");
        int num1=sc.nextInt(),  num2 =sc.nextInt(), num3=sc.nextInt();
        if (num1>num2) {
            System.out.println("Num1 is greater than num2");
        }

        if (num1<num3) {
            System.out.println("Num1 is greater than num3");
        }
        if (num1<num2){
                System.out.println("Num2 is greater than num1");
        } else {
            System.out.println("Other condition");

        }
    }
}
