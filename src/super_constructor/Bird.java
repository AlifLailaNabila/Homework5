package super_constructor;

public class Bird {
    public String birdName;
    public int birdNum;
    public int birdAge;

    public Bird(){
        System.out.println("Default one");
    }
    public Bird(String birdName){
        this.birdName = birdName;
        System.out.println("The birdname is " +birdName);
    }
    public Bird(String birdName, int birdAge){
        this.birdName = birdName;
        this.birdAge = birdAge;
        System.out.println(birdName+" "+birdAge);
    }

    public void birdInfo(){
        System.out.println("All info is given");
    }




}
