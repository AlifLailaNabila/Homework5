package fileOperation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.io.Reader;

public class ReadFile {

    public static void main(String[] args) throws IOException {
        FileReader fr = null;
        BufferedReader br = null;
        String path = "/Users/alifnabila/Sublime/homework.txt";

        try{
            fr = new FileReader(path);
        } catch (Exception ex){
            System.out.println("File is not found");
        }
        try{
            br = new BufferedReader(fr);
            String data="";
            while (( data=br.readLine()) !=null){
               System.out.println(data);
            }
        } catch (Exception ex){
            System.out.println("File is not readable");
        }
        finally{
            if(fr !=null){
                fr.close();
            }
            if (br !=null){
                br.close();
            }

        }

    }
}
