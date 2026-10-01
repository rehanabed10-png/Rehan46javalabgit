import java.io.FileOutputStream;
import java.io.IOException;
public class Rehan29 {
    public static void main(String[] args) {
        try(FileOutputStream out=new FileOutputStream("output.txt")){out.write("Hello from Java I/O Streams".getBytes());System.out.println("Data written successfully.");}
        catch(IOException e){System.out.println("I/O error: "+e.getMessage());}
    }
}
