interface Printable
{
    void display();
}
interface Showable
{
    void display();
}
class Document implements Printable,Showable
{
    @Override
    public void display() 
    {
        System.out.println("This file contains a document");
    }
}

public class Multipleinheritance 
{
    public static void main(String[] args)
    {
        Document obj = new Document();
        obj.display();
    }
}
