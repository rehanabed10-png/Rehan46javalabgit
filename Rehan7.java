import java.util.*;
public class Rehan7{
	public static void main(String[] args){
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers to swap: ");
		a = sc.nextInt();
		b = sc.nextInt();
		
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;


		System.out.printf("after swap -> %d %d\n",a,b);
		System.out.println("This code is using bitwise operators!!!!!!");
	}
}