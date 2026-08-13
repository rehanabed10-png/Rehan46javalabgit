import java.util.Scanner;

public class Rehan10{
    public static void main(String[] args) {
		double num1,num2,result;
		char op;
        boolean correctexp = true;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Basic caluclator");
		
        System.out.print("enter first number: ");
        num1 = sc.nextDouble();
        
        System.out.print("Enter an operator (+, -, *, /): ");
        op = sc.next().charAt(0);
		while(op != '+' && op != '-' && op != '*' && op != '/'){
			System.out.print("Enter an operator (+, -, *, /): ");
			op = sc.next().charAt(0);
		}
        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();
        
        switch (op) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                    correctexp = false;
                    result = 0;
                } else {
                    result = num1 / num2;
                }
                break;
            default:
                System.out.println("syntactical error!!!!");
                correctexp = false;
                result = 0;
                break;
        }
        if (correctexp) {
            System.out.println("Result: " + num1 + " " + op + " " + num2 + " = " + result);
        }
		
        sc.close();
    }
}
