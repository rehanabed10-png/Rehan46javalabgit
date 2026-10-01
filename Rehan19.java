import java.util.Scanner;
public class Rehan19 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); System.out.print("Enter a string: "); String s=sc.nextLine();
        System.out.println("Contains 'Java': " + s.contains("Java"));
        System.out.println("Starts with 'J': " + s.startsWith("J"));
        System.out.println("Index of 'a': " + s.indexOf('a'));
        System.out.println("Substring: " + (s.length() >= 3 ? s.substring(0,3) : s)); sc.close();
    }
}
