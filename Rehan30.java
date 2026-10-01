import java.io.*;
public class Rehan30 {
    public static void main(String[] args) {
        try(Writer w=new FileWriter("text.txt")){w.write("Java FileReader and FileWriter example.");}
        catch(IOException e){System.out.println(e.getMessage());return;}
        try(Reader r=new FileReader("text.txt")){int ch;while((ch=r.read())!=-1)System.out.print((char)ch);System.out.println();}
        catch(IOException e){System.out.println(e.getMessage());}
    }
}
