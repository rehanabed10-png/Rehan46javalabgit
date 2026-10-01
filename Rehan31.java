import java.io.*;
import java.util.*;
public class Rehan31 {
    public static void main(String[] args) {
        try(Scanner sc=new Scanner(new File("output.txt"))){Map<String,Integer> freq=new HashMap<>();while(sc.hasNext()){String word=sc.next().toLowerCase().replaceAll("[^a-z0-9]","");if(!word.isEmpty())freq.put(word,freq.getOrDefault(word,0)+1);}System.out.println(freq);}
        catch(FileNotFoundException e){System.out.println("File not found: output.txt");}
    }
}
