public class Rehan24 {
    interface Printable { void print(); }
    static class Document implements Printable { public void print(){System.out.println("Printing document");} }
    public static void main(String[] args){Printable p=new Document();p.print();}
}
