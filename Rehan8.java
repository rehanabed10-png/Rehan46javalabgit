import java.util.*;
public class Rehan8{
	public static void main(String[] args){
		float km,mi;
		int ch;
		Scanner sc = new Scanner(System.in);
		System.out.println("choose the option for conversion: ");
		System.out.println("1.kilometers to miles.\n 2,Miles to Kilometers.");
		ch = sc.nextInt();
		while(ch !=1 && ch != 2){
		System.out.println("choose between 1 or 2:");
		ch = sc.nextInt();
		}
		if(ch == 1){
			System.out.println("enter in km:");
			km = sc.nextFloat();
			mi = km * 0.621f;
			System.out.println("distance in miles: " + mi);
		}
		else if (ch == 2){
			System.out.println("enter in miles:");
			mi = sc.nextFloat();
			km = mi * 1.609f;
			System.out.println("distance in km: " + km);
		}
		sc.close();
	}
}