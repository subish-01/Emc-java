class A extends Thread
{
    public void run()              //should be created when extending the Thread
    {
        System.out.println("HEllo world welcome");
    }
}
public class Threading 
{
    public static void main(String[] args)
    {
        A obj = new A();
        obj.run();
    }
}
