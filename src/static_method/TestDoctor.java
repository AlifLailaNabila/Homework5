package static_method;

public class TestDoctor {
    public static void main(String[] args) {
        Doctor.docSal();
        Doctor doc1 = new Doctor();
        doc1.docHoliday();

        SubDoctor sd1 = new SubDoctor();
        SubDoctor.docSal();
        sd1.docHoliday();

        SubDoctor.docQualification();

    }

}
