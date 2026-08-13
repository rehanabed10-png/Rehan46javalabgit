import java.util.*;
public class Rehan6{
	public static void main(String[] args){
		int x;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your age: ");
		x = sc.nextInt();
		
		if(x>=18){
			System.out.println("eligible to vote!!!!");
		}
		else{
			System.out.println("wait for your time.....");
		}
	}
}