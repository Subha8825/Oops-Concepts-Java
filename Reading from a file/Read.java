import java.util.*;
import java.io.File;
class Read{
    public static void main(String[] args){
        try{
        File f=new File("Example.txt");
        Scanner reader=new Scanner(f);
        while(reader.hasNextLine()){
            System.out.println(reader.nextLine());
        }
    }
    catch(Exception e){
        System.out.println(e);
    }

    }
}
// java.io.FileNotFoundException: Example.txt (The system cannot find the file specified)