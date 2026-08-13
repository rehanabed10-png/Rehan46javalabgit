import java.util.*;
public class Rehan5{
	public static void main(String[] args){
		int x,y;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the numbers to swap: ");
		x = sc.nextInt();
		y = sc.nextInt();
		
		x += y;
		y = x - y;
		x = x - y;
		System.out.printf("after swap -> %d %d",x,y);
	}
}