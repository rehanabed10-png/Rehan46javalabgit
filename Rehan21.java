public class Rehan21 {
    static class Shape { void draw(){System.out.println("Drawing shape");} }
    static class Circle extends Shape { void draw(){System.out.println("Drawing circle");} }
    static class Rectangle extends Shape { void draw(){System.out.println("Drawing rectangle");} }
    public static void main(String[] args){Shape s=new Circle();s.draw();s=new Rectangle();s.draw();}
}
