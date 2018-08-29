package super_constructor;

public class SubBird extends Bird{
    public int birdChild;
     public SubBird(){
         super();
         System.out.println("Default Sub");
     }
    public SubBird(String birdName, int birdChild){
        super(birdName);
        this.birdName = birdName;
        System.out.println(birdName+ " "+ birdChild);

    }
    public SubBird(int birdChild, int birdNum, String birdName){
        super(birdName, birdNum);
        this.birdChild= birdChild;
        this.birdNum=birdNum;
        this.birdName=birdName;

        System.out.println(birdChild+ " "+ birdNum+" "+birdName);
    }


}
