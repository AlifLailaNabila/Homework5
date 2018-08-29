package static_method;

public class Doctor {
    public static void docSal(){
        System.out.println("The base is 50k");
    }
    public void docHoliday(){
        System.out.println("Saturday and Sunday");
    }

    public final static void docQualification(){
        System.out.println("MBBS");
    }

}
