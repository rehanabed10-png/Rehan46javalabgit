import java.util.*;
class Id {
    int id;
    long adhaar;
    long mobileNum;
    Scanner sc = new Scanner(System.in);

    public int getId() {
        this.id = Integer.parseInt(sc.nextLine());
        return this.id;
    }

    public long getAdhaar() {
        this.adhaar = Long.parseLong(sc.nextLine());
        return this.adhaar;
    }

    public long getNum() {
        this.mobileNum = Long.parseLong(sc.nextLine());
        return this.mobileNum;
    }
}
class Year extends Id {
    int year;
    String course;

    public int getYear() {
        this.year = Integer.parseInt(sc.nextLine());
        return this.year;
    }

    public String getCourse() {
        this.course = sc.nextLine();
        return this.course;
    }
}
class Rehan12 extends Year {
    String name;

    public String getName() {
        this.name = sc.nextLine();
        return this.name;
    }

    public void displayDetails() {
        System.out.println("Name: " + this.name);
        System.out.println("Year of Study: " + this.year);
        System.out.println("ID: " + this.id);
        System.out.println("Course: " + this.course);
        System.out.println("Mobile Number: " + this.mobileNum);
    }

    public static void main(String[] args) {
        Rehan12 rehan = new Rehan();
        
        System.out.println("\n==== Enter Student Details ====");
        
        System.out.println("enter your name: ");
        rehan.getName();
        
        System.out.println("enter your year of study: ");
        rehan.getYear();
        
        System.out.println("enter your id: ");
        rehan.getId();
        
        System.out.println("enter your course: ");
        rehan.getCourse();
        
        System.out.println("enter your number: ");
        rehan.getNum();
		
        System.out.println("\n===== DISPLAYING STUDENT DETAILS =====");
        rehan.displayDetails();
    }
}