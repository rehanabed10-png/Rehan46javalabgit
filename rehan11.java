import java.util.Scanner;

class Employee {

    int id;
    int salary;
    String name;
	
    Scanner sc = new Scanner(System.in);

    
    public int getId() {
        this.id = sc.nextInt();
        return this.id;
    }

    
    public int getSalary() {
        this.salary = sc.nextInt();
        sc.nextLine(); 
        return this.salary;
    }
	
    public String getName() {
        this.name = sc.nextLine();
        return this.name;
    }
}


class Rehan11 {
    public static void main(String[] args) {
        
        Employee rehan = new Employee();

        System.out.println("Enter your id: ");
        rehan.getId();

        System.out.println("Enter your salary: ");
        rehan.getSalary();

        System.out.println("Enter your name: ");
        rehan.getName();
        
        
        System.out.println("\nEmployee Details");
        System.out.println("ID: " + rehan.id);
        System.out.println("Salary: " + rehan.salary);
        System.out.println("Name: " + rehan.name);
    }
}
