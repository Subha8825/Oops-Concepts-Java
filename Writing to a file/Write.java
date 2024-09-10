import java.util.*;
import java.io.File;
import java.io.FileWriter;
class Write{
    public static void main(String[] args){
        try{
        File f=new File("Example.txt");
        FileWriter fw=new FileWriter(f);
        fw.write("Hello world");
        fw.close();

        
    }
    catch(Exception e){
        System.out.println(e);
    }

    }
}