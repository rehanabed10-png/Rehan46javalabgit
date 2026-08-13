import java.util.*;
public class Rehan9{
	public static void main(String[] args){
		int a,b,max;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter two numbers to find max: ");
		a = sc.nextInt();
		b = sc.nextInt();
		max = (a > b) ? a:b;
		System.out.println("maximum is :" + max);
	}
}