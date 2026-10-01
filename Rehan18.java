import java.util.Scanner;
public class Rehan18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); System.out.print("Enter a string: "); String s = sc.nextLine();
        System.out.println("Length: " + s.length());
        System.out.println("Uppercase: " + s.toUpperCase());
        System.out.println("Lowercase: " + s.toLowerCase());
        System.out.println("Trimmed: " + s.trim()); sc.close();
    }
}
