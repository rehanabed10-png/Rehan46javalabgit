import java.util.Scanner;

class Additon {
    public int add(int a, int b) {
        return a + b;
    }
    public int add(int a, int b, int c) {
        return a + b + c;
    }
    public double add(double a, double b) {
        return a + b;
    }
    public double add(double a, double b, double c) {
        return a + b + c;
    }
}

class Rehan15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Additon sum = new Additon();
        

        double a = 0, b = 0, c = 0;
        
        System.out.println("====choose the operations====\n1.two integers\n2.three integers\n3.two double\n4.three double.");
        int ch = sc.nextInt();
        

        if (ch == 1 || ch == 3) {
            System.out.print("Enter value for a and b: ");
            a = sc.nextDouble();
            b = sc.nextDouble();
        } else if (ch == 2 || ch == 4) {
            System.out.print("Enter value for a, b, and c: ");
            a = sc.nextDouble();
            b = sc.nextDouble();
            c = sc.nextDouble();
        }
        

        switch(ch) {
            case 1:
                System.out.println("Result: " + sum.add((int)a, (int)b));
                break;
            case 2:
                System.out.println("Result: " + sum.add((int)a, (int)b, (int)c));
                break;
            case 3:
                System.out.println("Result: " + sum.add(a, b));
                break;
            case 4:
                System.out.println("Result: " + sum.add(a, b, c));
                break;
            default:
                System.out.println("invalid input!!!!!");
                break;
        }
        sc.close();
    }
}