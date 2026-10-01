import java.io.FileInputStream;
import java.io.IOException;
public class Rehan28 {
    public static void main(String[] args) {
        try(FileInputStream in=new FileInputStream("output.txt")){int ch;while((ch=in.read())!=-1)System.out.print((char)ch);System.out.println();}
        catch(IOException e){System.out.println("I/O error: "+e.getMessage());}
    }
}
