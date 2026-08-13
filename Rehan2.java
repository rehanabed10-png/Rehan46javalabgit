import java.util.*;
public class Rehan2
{
	public static void main(String[] args)
	{
		float mat,phy,che,tot,per;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter your physics,maths,chemistry marks in this order(for 100): ");
		phy = sc.nextFloat();
		mat = sc.nextFloat();
		che = sc.nextFloat();
		tot = phy+mat+che;
		System.out.println("total marks are: " + tot);
		per = tot/3;
		System.out.println("percentage is: " + per);
	}
}