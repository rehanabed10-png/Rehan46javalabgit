import java.util.*;
public class Rehan17 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); System.out.print("Enter a string: "); String s=sc.nextLine();
        Set<Character> set=new HashSet<>(); int left=0,max=0;
        for(int right=0;right<s.length();right++){while(set.contains(s.charAt(right)))set.remove(s.charAt(left++));set.add(s.charAt(right));max=Math.max(max,right-left+1);}
        System.out.println("Longest length: " + max); sc.close();
    }
}
