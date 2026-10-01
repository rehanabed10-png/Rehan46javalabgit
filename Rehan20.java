import java.util.Scanner;
public class Rehan20 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); System.out.print("Enter a string: "); String s=sc.nextLine();
        String rev=new StringBuilder(s).reverse().toString();
        System.out.println("Reverse: " + rev); System.out.println("Palindrome: " + s.equalsIgnoreCase(rev)); sc.close();
    }
}
