package static_variable;

public class GoogleDrive {
    public static int driveSize;
    public final static int driveMembers=5;


    public int getGoogleDriveSize(){
        return driveSize;
    }


    public void setGoogleDriveSize(int driveSize){
        this.driveSize=driveSize;
    }
}
