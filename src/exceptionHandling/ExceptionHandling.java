package exceptionHandling;

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int num = 0;
            int result = num / 0;
            System.out.println(result);
        }catch(Exception ex){
            System.out.println("Zero can not be divided");
        }
        System.out.println("I came to this point");
    }
}
