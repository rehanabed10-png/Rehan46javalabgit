import java.io.*;
public class Rehan26 {
    public static void main(String[] args) {
        try(BufferedWriter w=new BufferedWriter(new FileWriter("buffered.txt"))){w.write("Buffered I/O is efficient.");w.newLine();w.write("Second line.");}
        catch(IOException e){System.out.println(e.getMessage());return;}
        try(BufferedReader r=new BufferedReader(new FileReader("buffered.txt"))){String line;while((line=r.readLine())!=null)System.out.println(line);}
        catch(IOException e){System.out.println(e.getMessage());}
    }
}
