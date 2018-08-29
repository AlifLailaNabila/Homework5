package static_variable;

public class TestGoogleDrive {
    public static void main(String[] args) {


        GoogleDrive gd1 = new GoogleDrive();
        System.out.println(GoogleDrive.driveMembers);


        int sizeOf1 = GoogleDrive.driveSize = 16;
        System.out.println(sizeOf1);


        GoogleDrive gd2 = new GoogleDrive();

        int sizeOf2 = GoogleDrive.driveSize = 64;
        System.out.println(sizeOf2);

        System.out.println(GoogleDrive.driveSize);




    }
}


