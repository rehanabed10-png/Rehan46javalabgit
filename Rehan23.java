public class Rehan23 {
    static class Id { int id; void setId(int id){this.id=id;} }
    static class Year extends Id { int year; void setYear(int year){this.year=year;} }
    static class Student extends Year { String name,course; void display(){System.out.println(name+" | Year: "+year+" | ID: "+id+" | Course: "+course);} }
    public static void main(String[] args){Student s=new Student();s.name="Rehan";s.setYear(1);s.setId(101);s.course="Java";s.display();}
}
