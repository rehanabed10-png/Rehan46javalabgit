import java.io.*;
public class Rehan27 {
    public static void main(String[] args) {
        String source="output.txt", target="copy.txt";
        try(InputStream in=new FileInputStream(source);OutputStream out=new FileOutputStream(target)){
            byte[] buffer=new byte[1024]; int n; while((n=in.read(buffer))!=-1)out.write(buffer,0,n); System.out.println("File copied successfully.");
        }catch(IOException e){System.out.println("I/O error: "+e.getMessage());}
    }
}
